package com.manthan.SpringEcommerce.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
