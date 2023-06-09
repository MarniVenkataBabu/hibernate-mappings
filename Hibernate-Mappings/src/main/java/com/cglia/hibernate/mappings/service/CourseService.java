package com.cglia.hibernate.mappings.service;

import java.util.List;

import com.cglia.hibernate.mappings.entity.Course;


public interface CourseService {
	
	public List<Course> findAll();
	public Course findById(int id);
	public void save(Course course);
	public void update(Course course, int id);
	public void deleteById(int id);

}
