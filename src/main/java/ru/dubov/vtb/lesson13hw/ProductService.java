package ru.dubov.vtb.lesson13hw;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    List<Product> productList = new ArrayList<>();

    @PostConstruct
    public void insertToProductsList() {
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(i, "title"+ i, i*100));
        }
    }

    public void printAll() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product findByTitle(String title) {
        Product foundProduct = null;
        for (Product product : productList) {
            if (title.equals(product.getTitle())) foundProduct = product;
        }
        return foundProduct;
    }


}
