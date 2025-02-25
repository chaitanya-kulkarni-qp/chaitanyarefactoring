import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<String> items;
    private List<Double> prices;
    private double totalPrice;
    private double discountedPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getItems() {
        return items;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
