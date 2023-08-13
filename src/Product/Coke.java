package Product;

public class Coke extends ProductForSale{

    private double acidRate;

    private boolean isLight;

    public Coke(String type, double price, String description, double acidRate, boolean isLight) {
        super(type, price, description);
        this.acidRate=acidRate;
        this.isLight=isLight;
    }

    public double getAcidRate() {
        return acidRate;
    }

    public boolean isLight() {
        return isLight;
    }

    @Override
    public void showDetails() {
        String mutualDetails = super.toString();
        StringBuilder cokeDetails = new StringBuilder();
        cokeDetails.append(" Acid Rate: "+ getAcidRate());
        cokeDetails.append(" Is Light: "+ isLight());
        System.out.println(mutualDetails + cokeDetails.toString());
    }
}
