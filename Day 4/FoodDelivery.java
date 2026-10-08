class FoodDelivery {

    static class Food {
        int orderId;
        String name;
        String foodName;
        int quantity;
        double price;
    }

    static void displayOrder(Food order) {
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Customer Name: " + order.name);
        System.out.println("Food Item: " + order.foodName);
        System.out.println("Quantity: " + order.quantity);
        System.out.println("Price: $" + order.price);
    }

    static void calculateTotal(Food order) {
        double total = order.quantity * order.price;
        System.out.println("Total Amount: $" + total);
    }

    static void cancelOrder(Food order) {
        System.out.println(
            "Order with ID " + order.orderId + " has been canceled."
        );
    }

    // Child class
    static class PremiumOrder extends Food {
        double discount;

        void deliveryCharge() {
            double charge = 50;
            System.out.println("Delivery Charge: $" + charge);
        }

        void calculateDiscount() {
            discount = 0.10 * (quantity * price);
            System.out.println("Discount: $" + discount);
        }

        void calculatePremiumTotal() {
            double total = (quantity * price) - discount + 50;
            System.out.println(
                "Total Amount after Discount and Delivery Charge: $" + total
            );
        }
    }

    public static void main(String[] args) {

        PremiumOrder order = new PremiumOrder();

        order.orderId = 101;
        order.name = "Mithra";
        order.foodName = "Pizza";
        order.quantity = 2;
        order.price = 250;

        displayOrder(order);
        calculateTotal(order);
        cancelOrder(order);

        System.out.println("\n--- Premium Order ---");

        order.calculateDiscount();
        order.deliveryCharge();
        order.calculatePremiumTotal();
    }
}