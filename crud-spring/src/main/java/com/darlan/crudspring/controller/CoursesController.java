package com.darlan.crudspring.controller;

import java.util.List;

import com.darlan.crudspring.models.Course;
import com.darlan.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
