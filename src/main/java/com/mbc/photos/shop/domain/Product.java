package com.mbc.photos.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name= "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {


    @Id
    @Column(length = 36)
    @Type(type="uuid-char")
    private UUID productId;
    private String productName;
    private Double productPrice;
    private String productDescription;
    private int productQuantity;
    private String productPicture;


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }


}
