package org.example.services;

import org.example.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CourseServiceImpl implements CourseService{



    List<Courses> list;

    public CourseServiceImpl(){

        list = new ArrayList<>();

        list.add(new Courses(1,"Btech", "CSE"));
        list.add(new Courses(2,"Btech", "ECE"));
        list.add(new Courses(3,"Btech", "ME"));
        list.add(new Courses(4,"Btech", "AI"));

    }


    @Override
    public List<Courses> getCourses(){
        return list;
    }

    @Override
    public Courses getCourseById(long id){
        Courses c = null;
        for(Courses courses : list){
            if(courses.getId() == id){
                c = courses;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses){
        list.add(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses){

        list.forEach(e -> {
            if(e.getId() == courses.getId()){
                e.setTitle(courses.getTitle());
                e.setDescription(courses.getDescription());
            }
        });

        return courses;
    }

    @Override
    public void deleteCourse(long id){
        list = this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());

    }


}
