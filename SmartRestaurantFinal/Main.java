import java.util.*;
import java.text.NumberFormat;

class Main {
    void main() throws Exception {
        RestaurantService s = new RestaurantService();

        s.addMenuItem(new MenuItem("Pizza",12.5,false));
        s.addMenuItem(new MenuItem("Salad",8,true));

        System.out.println("MENU:");
        s.viewMenu();

        Customer c = new Customer("John");
        s.placeOrder(new DineInOrder(c,List.of(new MenuItem("Pizza",12.5,false)),1));

        System.out.println("\nORDERS:");
        s.viewOrders();

        s.vegetarianItems();
        s.sortByPrice();
        s.mostExpensiveItem();
        s.groupOrdersByCustomer();
        s.partitionOrders();
        s.countOrders();

        s.lambdaExamples();
        s.processOrdersConcurrently();

        FileManager.saveOrders(s.getOrders());
        FileManager.readOrders();

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IE"));
        System.out.println(nf.format(12.5));

        String msg = switch("Dine-In"){
            case "Dine-In" -> "Serve";
            default -> "Pack";
        };
        System.out.println(msg);
    }
}
