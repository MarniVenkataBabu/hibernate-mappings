package com.cglia.hibernate.mappings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cglia.hibernate.mappings.entity.Student;
import com.cglia.hibernate.mappings.exceptionhandling.GlobalNotFoundException;
import com.cglia.hibernate.mappings.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	    private StudentRepository studentRepository;

	    public StudentServiceImpl(StudentRepository studentRepository) {
	        this.studentRepository = studentRepository;
	    }

	    @Override
	    public List<Student> findAll() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public Student findById(int id) {
	        Optional<Student> result = studentRepository.findById(id);
	        if (result.isPresent()) {
	            return result.get();
	        } else {
	            throw new GlobalNotFoundException("Student not found with id: " + id);
	        }
	    }

	    @Override
	    public void save(Student student) {
	        studentRepository.save(student);
	    }

	    @Override
	    public void update(Student student, int id) {
	        Optional<Student> result = studentRepository.findById(id);
	        if (result.isPresent()) {
	            Student existingStudent = result.get();
	            existingStudent.setFirstName(student.getFirstName());
	            existingStudent.setLastName(student.getLastName());
	            existingStudent.setEmail(student.getEmail());
	            studentRepository.save(existingStudent);
	        } else {
	            throw new GlobalNotFoundException("Student not found with id: " + id);
	        }
	    }

	    @Override
	    public void deleteById(int id) {
	        studentRepository.deleteById(id);
	    }
	}
