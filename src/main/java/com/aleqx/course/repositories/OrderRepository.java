package com.aleqx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleqx.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
