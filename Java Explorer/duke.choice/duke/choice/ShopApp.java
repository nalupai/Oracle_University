package duke.choice;

import java.util.Arrays;

class ShopApp {
    
    public static void main(String[] args) {

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Customer is " + c1.getName());

        System.out.println("minimum price = " + Clothing.getMIN_PRICE());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        c1.addItems(items);

        Arrays.sort(c1.getItems());

        for (Clothing item : items) {
            //System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
            System.out.println(item);
        }
        
        System.out.println("Total = " + c1.getTotalClothingCost(items));

        double sum = 0;
        double average = 0;
        int counter = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                sum = sum + item.getPrice();
                counter++;
            }
        }

        try {
            average = sum / counter;
            double zeroCheck = 0 / (int)average;
            System.out.println("average price = " + average);
        } catch (ArithmeticException e) {
            System.out.println("calling an exception");
        }
    }
}
