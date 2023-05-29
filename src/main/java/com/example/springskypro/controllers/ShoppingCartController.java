package com.example.springskypro.controllers;

import com.example.springskypro.ShoppingCartService;
import com.example.springskypro.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("id")List<Integer> id) {
       shoppingCartService.add(id);
    }
    @GetMapping(path = "/get")
    public List<Product> getAllProducts() {
        return shoppingCartService.get();
    }


}
