package ru.dubov.vtb.lesson13hw;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public void periodicalOrder(Cart cart) {
        double totalOrderCost = 0;
        System.out.println("Товары в корзине");
        for (Product product : cart.cardList) {
            System.out.println(product.getTitle());
            totalOrderCost+= product.getCost();
        }
        System.out.println("Итоговая стоимость");
        System.out.println(totalOrderCost);
    }

}
