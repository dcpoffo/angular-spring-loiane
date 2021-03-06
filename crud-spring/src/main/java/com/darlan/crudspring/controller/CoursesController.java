package com.darlan.crudspring.controller;

import java.util.List;

import com.darlan.crudspring.models.Course;
import com.darlan.crudspring.repository.CourseRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CoursesController {    
    
    private CourseRepository courseRepository;
    
    // public CoursesController(CourseRepository courseRepository) {
    //     this.courseRepository = courseRepository;
    // }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping    
    public List<Course> list(){
        return courseRepository.findAll();
    }

    // @PostMapping
    // public ResponseEntity<Course> create(@RequestBody Course course) {
    //     //return courseRepository.save(course);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));

    // }
    // ou
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);     
    }

}
