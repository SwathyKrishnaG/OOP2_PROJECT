import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class RestaurantService {
    private List<MenuItem> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addMenuItem(MenuItem item) { menu.add(item); }

    public void viewMenu() {
        menu.forEach(i -> System.out.println(i.name() + " | " + i.price() + " | Veg: " + i.vegetarian()));
    }

    public void placeOrder(Order order) { orders.add(order); }

    public void viewOrders() {
        orders.forEach(o -> {
            System.out.println("----------------------");
            System.out.println(o);
            System.out.println("Time: " + o.getTime());
        });
    }

    public void vegetarianItems() {
        menu.stream().filter(MenuItem::vegetarian).forEach(System.out::println);
    }

    public void sortByPrice() {
        menu.stream().sorted(Comparator.comparing(MenuItem::price)).forEach(System.out::println);
    }

    public void mostExpensiveItem() {
        menu.stream().max(Comparator.comparing(MenuItem::price)).ifPresent(System.out::println);
    }

    public void groupOrdersByCustomer() {
        Map<Customer, List<Order>> map = orders.stream().collect(Collectors.groupingBy(Order::getCustomer));
        map.forEach((k,v)-> System.out.println(k + " -> " + v));
    }

    public void partitionOrders() {
        Map<Boolean,List<Order>> map = orders.stream().collect(Collectors.partitioningBy(o -> o.getType().equals("Dine-In")));
        map.forEach((k,v)-> System.out.println(k + " -> " + v));
    }

    public void countOrders() {
        System.out.println("Total Orders: " + orders.stream().count());
    }

    public void lambdaExamples() {
        Predicate<MenuItem> p = i -> i.price() > 10;
        menu.stream().filter(p).map(MenuItem::name).forEach(System.out::println);
    }

    public void processOrdersConcurrently() throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = orders.stream()
            .map(o -> (Callable<String>) () -> "Processed: " + o.getCustomer().name())
            .toList();

        for (Future<String> f : ex.invokeAll(tasks)) {
            System.out.println(f.get());
        }
        ex.shutdown();
    }

    public List<Order> getOrders() { return orders; }
}
