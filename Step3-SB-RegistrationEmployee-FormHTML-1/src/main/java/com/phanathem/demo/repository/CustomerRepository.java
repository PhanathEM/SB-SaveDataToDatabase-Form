package com.phanathem.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phanathem.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
