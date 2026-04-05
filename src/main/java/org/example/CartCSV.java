package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CartCSV {

    public static void addProductsFromCSV(String path, Cart cart) {
        try (InputStream is = CartCSV.class.getResourceAsStream(path);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;
                String[] parts = line.split(",");
                String category = parts[0].trim();
                long price = Long.parseLong(parts[1].trim());
                cart.addProduct(category, price);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}