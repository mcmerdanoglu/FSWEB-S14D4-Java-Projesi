package Product;

public abstract class ProductForSale {

    private String type;
    private double price;

    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails (); //abstract methodların bodyleri {} olmaz!!!

    @Override
    public String toString() {
        StringBuilder productBuidler = new StringBuilder();
        productBuidler.append(getClass().getSimpleName() + "=>");
        productBuidler.append(" Type: " + getType());
        productBuidler.append(" Price: " + getPrice());
        productBuidler.append(" Description: "+ getDescription());
        return productBuidler.toString();
    }
}


