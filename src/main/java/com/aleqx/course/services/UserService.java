package com.aleqx.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleqx.course.entities.User;
import com.aleqx.course.repositories.UserRepository;
import com.aleqx.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	// Operacao para inserir no banco de dados
	public User insert(User obj) {
		return userRepository.save(obj);
	}

	// Operacao para deletar do banco de dados
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	// Operacao para atualizar do banco de dados
	public User update(Long id, User obj) {
		User entity = userRepository.getOne(id);
		updateData(entity,obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj){
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
