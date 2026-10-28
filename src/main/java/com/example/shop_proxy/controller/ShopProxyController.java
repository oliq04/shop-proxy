package com.example.shop_proxy.controller;

import com.example.shop_proxy.model.*;
import com.example.shop_proxy.service.ShopProxyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopProxyController {

    private final ShopProxyService shopProxyService;

    @GetMapping("/products")
    public PageDto<ProductDto> findProducts(@RequestParam("page") int page,
                                            @RequestParam("size") int size) {
        return shopProxyService.findProducts(page, size);
    }

    @PostMapping("/to-cart")
    public ProductDto addToCart(@RequestParam("id") Long id, @RequestBody ProductConfigurationCommand productConfiguration) {
        return shopProxyService.addToCart(id, productConfiguration);
    }

    @PostMapping("/new-cart")
    public CartDto createCart() {
        return shopProxyService.createCart();
    }

    @PostMapping("/order")
    public OrderDto createOrder(@RequestParam("cart-id") Long cartId, @RequestParam("customer-id") Long customerId) {
        return shopProxyService.createOrder(cartId, customerId);
    }

    @GetMapping("/order/{id}")
    public OrderDto getOrder(@PathVariable("id") Long id) {
        return shopProxyService.getOrder(id);
    }


}
