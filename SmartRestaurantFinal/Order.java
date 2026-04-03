import java.time.LocalDateTime;
import java.util.List;

public sealed interface Order permits DineInOrder, TakeawayOrder {
    Customer getCustomer();
    List<MenuItem> getItems();
    LocalDateTime getTime();
    String getType();
}
