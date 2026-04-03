import java.nio.file.*;
import java.util.*;

public class FileManager {
    public static void saveOrders(List<Order> orders) throws Exception {
        List<String> lines = orders.stream().map(Object::toString).toList();
        Files.write(Paths.get("orders.txt"), lines);
    }

    public static void readOrders() throws Exception {
        Files.readAllLines(Paths.get("orders.txt")).forEach(System.out::println);
    }
}
