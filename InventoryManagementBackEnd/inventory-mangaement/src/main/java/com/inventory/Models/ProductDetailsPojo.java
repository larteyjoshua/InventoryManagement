package com.inventory.Models;

/**
 * Created by abin on 7/31/2017.
 */
public class ProductDetailsPojo {
    private int id;
    private String productName;
    private int productPrice;
    private int productWeight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public ProductDetailsPojo() {

    }

    public ProductDetailsPojo(int id, String productName, int productPrice, int productWeight) {

        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
    }
}
