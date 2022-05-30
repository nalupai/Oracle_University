package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

class ShopApp {
    
    public static void main(String[] args) {

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Customer is " + c1.getName() + ".");

        System.out.println("minimum price = " + Clothing.getMIN_PRICE());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"),
            new Clothing("Blue T-Shirt", 10.5, "S")};
        
        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer webserver = WebServer.create(config, routing);
            webserver.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
