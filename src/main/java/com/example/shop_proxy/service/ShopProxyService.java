package com.example.shop_proxy.service;

import com.example.shop_proxy.model.*;

public class ShopProxyService {
    public PageDto<ProductDto> findProducts(int page, int size) {
    }

    public ProductDto addToCart(Long id, ProductConfigurationCommand productConfiguration) {
    }

    public CartDto createCart() {
    }

    public OrderDto createOrder(Long cartId, Long customerId) {
    }

    public OrderDto getOrder(Long id) {
    }
}
