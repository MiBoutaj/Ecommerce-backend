package com.ecommerce.product.service;

import com.ecommerce.product.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Mono<Product> saveProduct(Product product);
    Flux<Product> getAllProduct();
    Mono<Product> updateProduct(Product product);
    void deleteProductById(String id);
}
