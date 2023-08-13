package Product;

public class Bread extends ProductForSale{

    private double wheatRate;

    private boolean isDoubleBaked;

    public Bread(String type, double price, String description, double wheatRate, boolean isDoubleBaked) {
        super(type, price, description);
        this.wheatRate=wheatRate;
        this.isDoubleBaked=isDoubleBaked;
    }

    public double getWheatRate() {
        return wheatRate;
    }

    public boolean isDoubleBaked() {
        return isDoubleBaked;
    }

    @Override
    public void showDetails() {
        String mutualDetails = super.toString();
        StringBuilder breadDetails = new StringBuilder();
        breadDetails.append(" Wheat Rate: "+ getWheatRate());
        breadDetails.append(" Is Double Baked: "+ isDoubleBaked());
        System.out.println(mutualDetails + breadDetails.toString());
    }
}
