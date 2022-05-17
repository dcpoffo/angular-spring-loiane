package com.darlan.crudspring.repository;

import com.darlan.crudspring.models.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
   
}
