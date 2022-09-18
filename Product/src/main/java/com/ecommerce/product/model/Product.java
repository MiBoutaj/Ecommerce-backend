package com.ecommerce.product.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id_product;
    private String nameProduct;
    private String description;
    private InventoryStatus inventoryStatus;
    private Category category;
    private float price;
    private int quantity;
    private String picture;
}
