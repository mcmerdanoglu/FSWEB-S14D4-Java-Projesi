package Product;

public class Chocolate extends ProductForSale{

    private double sugarRate;

    public boolean isMilky;

    public Chocolate(String type, double price, String description, double sugarRate, boolean isMilky) {
        super(type, price, description);
        this.sugarRate=sugarRate;
        this.isMilky=isMilky;
    }

    public double getSugarRate() {
        return sugarRate;
    }

    public boolean isMilky() {
        return isMilky;
    }

    @Override
    public void showDetails() {
        String mutualDetails = super.toString();
        StringBuilder cocoDetails = new StringBuilder();
        cocoDetails.append(" Sugar Rate: "+ getSugarRate());
        cocoDetails.append(" Is Milky: "+ isMilky());
        System.out.println(mutualDetails + cocoDetails.toString());
    }
}
