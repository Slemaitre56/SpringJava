package com.mbc.photos.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


@Entity(name= "basket")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Basket {

    @Id
    @Column(length = 36)
    @Type(type="uuid-char")
    private UUID basketId;
    private int basketQuantity;
    private float basketPrice;

}
