package com.taowei.ecommerce.dto;

import java.util.Set;

import com.taowei.ecommerce.entity.Address;
import com.taowei.ecommerce.entity.Customer;
import com.taowei.ecommerce.entity.Order;
import com.taowei.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
    
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
