package ua.shop.service;

import java.util.List;

import ua.shop.entity.Items;

public interface ItemsService {
	
	void save(Items items);
	
	Items findOne(Integer id);
	
	List<Items> findAll();

	void delete(Integer id);
}
