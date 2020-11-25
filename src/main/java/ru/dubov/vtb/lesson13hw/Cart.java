package ru.dubov.vtb.lesson13hw;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    List<Product> cardList = new ArrayList<>();

    public void add(Product product) {
        cardList.add(product);
    }
}
