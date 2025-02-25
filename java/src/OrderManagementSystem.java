import enums.DiscountedPriceCalculator;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "VIP");
        Order order = new Order(customer);

        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);

        TotalPriceCalculator totalPriceCalculator = new TotalPriceCalculator(order.getPrices());
        order.setTotalPrice(totalPriceCalculator.calculateTotal());
        DiscountedPriceCalculator discountedPriceCalculator = new DiscountedPriceCalculator(order.getTotalPrice());
        order.setDiscountedPrice(
                discountedPriceCalculator.applyDiscountAndGetFinalAmount(customer.getDiscount())
        );
        order.printOrder();

        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total: $" + order.getTotalPrice());
        System.out.println("Discounted Total: $" + order.getDiscountedPrice());
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}
