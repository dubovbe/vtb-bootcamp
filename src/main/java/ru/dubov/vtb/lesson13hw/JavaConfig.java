package ru.dubov.vtb.lesson13hw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public ProductService productService(){
        return new ProductService();
    }

    @Bean
    public Cart cart(ProductService productService){
        Cart cart = new Cart();
        cart.add(productService.findByTitle("title1"));
        cart.add(productService.findByTitle("title3"));
        cart.add(productService.findByTitle("title5"));
        cart.add(productService.findByTitle("title7"));
        cart.add(productService.findByTitle("title9"));
        return cart;
    }

    @Bean
    public OrderService orderService(Cart cart) {
        OrderService orderService = new OrderService();
        orderService.periodicalOrder(cart);
        return orderService;
    }
}
