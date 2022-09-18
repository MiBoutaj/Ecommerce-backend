package com.ecommerce.product.service;

import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Mono<Product> saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Flux<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }
}
