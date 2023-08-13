package Main;

import Product.Bread;
import Product.Chocolate;
import Product.Coke;
import Product.ProductForSale;

public class Store {

    public static void main(String[] args) {
        System.out.println("---------ProductForsale-----------------");
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("white", 10.5, "intense", 0.05, true);
        products[1] = new Coke("zero", 15, "no sugar", 0.2, true);
        products[2] = new Bread("ruşeym", 12, "multi nutrition", 0.7, false);

        listProducts(products);
    }


    public static void listProducts(ProductForSale[] products) {
        //nullpointerexception hatası almamak için Stringlerin null olma ihtimaline karşı bu şekilde koruma sağlayabiliriz.
        if (products !=null) {
            for (ProductForSale product : products) {
                if (product != null)
                    product.showDetails();
            }
        }
    }
}
