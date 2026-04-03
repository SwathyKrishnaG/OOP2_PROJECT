import java.time.LocalDateTime;
import java.util.List;

public final class DineInOrder implements Order {
    private Customer customer;
    private List<MenuItem> items;
    private LocalDateTime time;
    private int tableNumber;

    public DineInOrder(Customer customer, List<MenuItem> items, int tableNumber) {
        this.customer = customer;
        this.items = items;
        this.tableNumber = tableNumber;
        this.time = LocalDateTime.now();
    }

    public Customer getCustomer() { return customer; }
    public List<MenuItem> getItems() { return items; }
    public LocalDateTime getTime() { return time; }
    public String getType() { return "Dine-In"; }

    public String toString() {
        return "Customer: " + customer.name() + ", Table: " + tableNumber + ", Items: " + items;
    }
}
