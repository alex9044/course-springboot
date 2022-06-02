package com.aleqx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleqx.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
