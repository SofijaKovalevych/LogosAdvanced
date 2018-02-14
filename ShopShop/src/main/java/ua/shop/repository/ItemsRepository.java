package ua.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.shop.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
