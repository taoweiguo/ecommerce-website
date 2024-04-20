package com.taowei.ecommerce.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taowei.ecommerce.dto.Purchase;
import com.taowei.ecommerce.dto.PurchaseResponse;
import com.taowei.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrdPurchase(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        
        return purchaseResponse;
    }
    
}
