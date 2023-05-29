package com.example.springskypro.repository;


import com.example.springskypro.model.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StoreRepository {

    private int counter = 1;
    private final Map<Integer, Product> map = new HashMap<>();


    @PostConstruct
    public void init() {
        map.put(counter, new Product(counter++,"Носки"));
        map.put(counter, new Product(counter++,"Ноутбук"));
        map.put(counter, new Product(counter++,"Телефон"));
        map.put(counter, new Product(counter++,"Стакан"));
        map.put(counter, new Product(counter++,"Ковёр"));
        map.put(counter, new Product(counter++,"Замок"));
    }


    public Product get(int id) {
        return map.get(id);
    }


}
