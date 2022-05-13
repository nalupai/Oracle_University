package duke.choice;

class Clothing {

    private String description;
    private double price;
    private String size = "M";

    private static final double MIN_PRICE = 10.0;
    private static final double TAX_RATE = .2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public static double getMIN_PRICE() {
        return MIN_PRICE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
