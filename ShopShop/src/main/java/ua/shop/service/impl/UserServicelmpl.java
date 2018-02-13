package ua.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.shop.entity.User;
import ua.shop.repository.UserRepository;
import ua.shop.service.UserService;


@Service
public class UserServicelmpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User findById(int id) {
		return userRepository.findOne(id);
	}

}
