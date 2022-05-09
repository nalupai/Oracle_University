package duke.choice;

class ShopApp {
    
    public static void main(String[] args) {

        double tax = 0.2;
        double total;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();

        c1.name = "Pinky";

        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println(item1.description + ", " + item1.price + ", " + item1.size);
        System.out.println(item2.description + ", " + item2.price + ", " + item2.size);

        total = (2 * item2.price + item1.price) + (2 * item2.price + item1.price) * tax;
        System.out.println(total);
    }
}
