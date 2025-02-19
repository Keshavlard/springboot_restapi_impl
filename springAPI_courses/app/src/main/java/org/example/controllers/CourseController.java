package org.example.controllers;


import org.example.entities.Courses;
import org.example.services.CourseService;
import org.example.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {



    //demo home
//    @GetMapping("/home")
//    public String home(){
//        return "Welcome to Courses Application";
//    }


    @Autowired
    private CourseService courseService;

    //get courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Courses getCourseById(@PathVariable String id){
        return this.courseService.getCourseById(Long.parseLong(id));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return this.courseService.addCourse(courses);
    }

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses courses){
        return this.courseService.updateCourse(courses);
    }

    @DeleteMapping("/courses/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id){
        try{
            this.courseService.deleteCourse(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
