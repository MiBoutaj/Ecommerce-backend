package com.ecommerce.product.controller;


import com.ecommerce.product.model.Product;
import com.ecommerce.product.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;

    @PostMapping("/addProduct")
    public Mono<Product> addProduct(Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/findAllProduct")
    public Flux<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping("/updateProductById")
    public Mono<Product> updateProductById(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProductById")
    public void deleteProductById(@RequestParam("id") String id){
        productService.deleteProductById(id);
    }
}
