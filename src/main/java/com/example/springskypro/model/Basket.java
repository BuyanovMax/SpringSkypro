package com.example.springskypro.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {

    private final List<Integer> basket = new ArrayList<>();


    public void add(List<Integer> prd) {
        basket.addAll(prd);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(basket);
    }


}
