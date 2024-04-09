package com.taowei.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taowei.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
