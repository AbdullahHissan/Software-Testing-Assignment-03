package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFile {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("name");
        header.createCell(1).setCellValue("price");
        header.createCell(2).setCellValue("expectedTotal");

        // Create data rows
        Object[][] data = {
                {"Apple", 100, 100},
                {"Banana", 50, 50},
                {"Orange", 75, 75},
                {"Laptop", 1200, 1200},
                {"Book", 20, 20},
                {"ZeroItem", 0, 0},
                {"MaxInt", 2147483647, 2147483647},
                {"LargeVal", 1000000, 1000000},
                {"SmallVal", 1, 1},
                {"SpaceName", 300, 300}
        };

        int rowNum = 1;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue((String) rowData[0]);
            row.createCell(1).setCellValue((Integer) rowData[1]);
            row.createCell(2).setCellValue((Integer) rowData[2]);
        }

        // Save to file
        try (FileOutputStream fos = new FileOutputStream("src/test/resources/cart-data.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file created successfully!");
        }

        workbook.close();
    }
}