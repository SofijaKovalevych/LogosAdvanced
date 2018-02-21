package ua.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.shop.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
