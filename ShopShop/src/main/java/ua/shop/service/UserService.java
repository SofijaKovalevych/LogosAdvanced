package ua.shop.service;

import ua.shop.entity.User;

public interface UserService {
	
void save(User user);
	
	User findById(int id);

}
