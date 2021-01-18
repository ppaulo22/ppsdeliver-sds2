package com.devsuperior.ppsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ppsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
