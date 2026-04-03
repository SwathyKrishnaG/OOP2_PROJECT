import java.time.LocalDateTime;
import java.util.List;

public final class TakeawayOrder implements Order {
    private Customer customer;
    private List<MenuItem> items;
    private LocalDateTime time;

    public TakeawayOrder(Customer customer, List<MenuItem> items) {
        this.customer = customer;
        this.items = items;
        this.time = LocalDateTime.now();
    }

    public Customer getCustomer() { return customer; }
    public List<MenuItem> getItems() { return items; }
    public LocalDateTime getTime() { return time; }
    public String getType() { return "Takeaway"; }

    public String toString() {
        return "Customer: " + customer.name() + ", Items: " + items;
    }
}
