package com.taowei.ecommerce.service;

import com.taowei.ecommerce.dto.Purchase;
import com.taowei.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
