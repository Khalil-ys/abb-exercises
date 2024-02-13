package abb.exercises.exercise4.exer1;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the product: ");
        String productName = sc.nextLine();
        Product product = new Product(productName);

        System.out.println("Company Name: " + Product.companyName);
        System.out.println("Product ID: " + product.getProductID());
        System.out.println("Product Name: " + product.getProductName());


        String productName1=sc.nextLine();
        Product product1 = new Product(productName1);


        System.out.println("Company Name: " + Product.companyName);
        System.out.println("Product ID: " + product1.getProductID());
        System.out.println("Product Name: " + product1.getProductName());


    }
}