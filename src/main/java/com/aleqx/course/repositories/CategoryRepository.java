package com.aleqx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleqx.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
