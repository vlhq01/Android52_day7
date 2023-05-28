package com.vndevpro.android52_day7;

public class ProductModel {

    private int id;
    private String productName;
    private String productImage;
    private String productPrices;
    private String rate;
    private boolean isWish;

    public ProductModel() {
    }

    public ProductModel(String productName, String productImage, String productPrices, String rate, boolean isWish) {
        this.productName = productName;
        this.productImage = productImage;
        this.productPrices = productPrices;
        this.rate = rate;
        this.isWish = isWish;
    }
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

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(String productPrices) {
        this.productPrices = productPrices;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public boolean isWish() {
        return isWish;
    }

    public void setWish(boolean wish) {
        isWish = wish;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productPrices='" + productPrices + '\'' +
                ", rate='" + rate + '\'' +
                ", isWish=" + isWish +
                '}';
    }
}
