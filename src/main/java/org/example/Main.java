// DiscountService.java
class DiscountService {
    public long applyDiscount(long total) {
        return total - (total / 10); // example 10% discount
    }
}

// PaymentService.java
class PaymentService {
    public boolean pay(long total) {
        return true; // simulate payment
    }
}

// OrderService.java
class OrderService {
    public long placeOrder(long total) {
        return System.currentTimeMillis(); // unique order ID as long
    }
}