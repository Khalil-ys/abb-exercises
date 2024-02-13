package abb.exercises.exercise4.exer1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    static String companyName;
    private static int productID;
    private String productName;

    static {
        companyName = "MyCompany";
    }


    public Product(String productName) {
        this.productName = productName;
        productID++;
    }

    public String getProductID() {
        return productID + "";
    }
}
