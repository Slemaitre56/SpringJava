package com.mbc.photos.shop.domain;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private UUID productId;
    private String productName;
    private Double productPrice;
    private String productDescription;
    private int productQuantity;
    private String productPicture;

    public Product(UUID productId, String productName, Double productPrice,
                   String productDescription, int productQuantity, String productPicture) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productPicture = productPicture;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productQuantity == product.productQuantity
                && Objects.equals(productId, product.productId)
                && Objects.equals(productName, product.productName)
                && Objects.equals(productPrice, product.productPrice)
                && Objects.equals(productDescription, product.productDescription)
                && Objects.equals(productPicture, product.productPicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, productDescription, productQuantity, productPicture);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPicture='" + productPicture + '\'' +
                '}';
    }
}
