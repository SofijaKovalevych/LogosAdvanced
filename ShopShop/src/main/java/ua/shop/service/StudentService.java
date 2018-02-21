package ua.shop.service;

import java.util.List;

import ua.shop.entity.Student;

public interface StudentService {
	
void saveStudent (Student student);
	
	List<Student> findAllStudents();
	

}
