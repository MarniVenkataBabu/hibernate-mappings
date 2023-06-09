package com.cglia.hibernate.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cglia.hibernate.mappings.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
