package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> showAll(){
		return repository.findAll();
	}
	
	public void save(Order order) {
		repository.save(order);
	}

	public Order get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
