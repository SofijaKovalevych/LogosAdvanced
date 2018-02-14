package ua.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.shop.entity.Items;
import ua.shop.repository.ItemsRepository;
import ua.shop.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsRepository repository;
	
	@Override
	public void save(Items items) {
		repository.save(items);
	}

	@Override
	public Items findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public List<Items> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
	}

}
