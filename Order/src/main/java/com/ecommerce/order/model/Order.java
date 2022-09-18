package com.ecommerce.order.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "orders")
public class Order {

    @Id
    private String id;
    private String nameClient;
    private String address;

    private String id_product;
    private String nameProduct;
    private int quantity;


    private float price_order;
    private LocalDateTime date;
}
