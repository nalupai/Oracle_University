package duke.choice;

class ShopApp {
    
    public static void main(String[] args) {

        //double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();

        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        for (Clothing item : items) {

            if (item.getSize().equals(c1.getSize())) {
                System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
                total = total + item.getPrice();
            }

            if (total > 15) {
                break;
            }
        }

        System.out.println("Total = " + total);

        int measurement = 3;

        switch (measurement) {
            case 1: case 2: case 3:
                c1.setSize("S");
                break;
            case 4: case 5: case 6:
                c1.setSize("M");
                break;
            case 7: case 8: case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
    }
}
