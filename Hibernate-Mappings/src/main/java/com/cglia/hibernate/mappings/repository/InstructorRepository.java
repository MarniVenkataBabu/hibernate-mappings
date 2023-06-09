package com.cglia.hibernate.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.hibernate.mappings.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
  // that's it no coding required here
}
