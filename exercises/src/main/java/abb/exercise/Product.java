package abb.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    static String companyName;
    private int productID;
    private String productName;

    static {
        companyName = "MyCompany";
    }

    {
        productID = 1000;
    }

    public Product(String productName) {
        this.productName = productName;
        productID++;
    }
}
