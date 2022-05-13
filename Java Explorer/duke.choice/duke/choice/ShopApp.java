package duke.choice;

class ShopApp {
    
    public static void main(String[] args) {

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        //item1.setDescription("Blue Jacket");
        //item1.setPrice(20.9);
        //item1.setSize("M");

        //item2.setDescription("Orange T-Shirt");
        //item2.setPrice(10.5);
        //item2.setSize("S");

        //items[2].setDescription("Green Scarf");
        //items[2].setPrice(5.0);
        //items[2].setSize("S");

        //items[3].setDescription("Blue T-Shirt");
        //items[3].setPrice(10.5);
        //items[3].setSize("S");

        c1.addItems(items);

        for (Clothing item : items) {
            System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
        }
        
        System.out.println("Total = " + c1.getTotalClothingCost(items));
    }
}
