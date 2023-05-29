package com.example.springskypro;

import com.example.springskypro.model.Product;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ShoppingCartService {

    void add(List<Integer> id);

    List<Product> get();
}
