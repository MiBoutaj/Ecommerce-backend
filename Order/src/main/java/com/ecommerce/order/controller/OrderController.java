package com.ecommerce.order.controller;


import com.ecommerce.order.model.Order;
import com.ecommerce.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class OrderController {
    private final OrderRepository orderRepository;
    @CrossOrigin("*")
    @GetMapping("/all")
    Flux<Order>  getAllOrder(){
        return orderRepository.findAll();
    }
    @CrossOrigin("*")
    @PostMapping("/add")
    Mono<Order> addOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }
}
