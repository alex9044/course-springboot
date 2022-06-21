package com.aleqx.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleqx.course.entities.User;
import com.aleqx.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	//Operacao para inserir no banco de dados
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	//Operacao para deletar do banco de dados
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
