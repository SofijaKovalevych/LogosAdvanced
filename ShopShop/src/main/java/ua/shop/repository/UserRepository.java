package ua.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.shop.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
