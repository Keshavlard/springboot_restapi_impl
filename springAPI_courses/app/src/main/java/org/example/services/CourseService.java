package org.example.services;

import org.checkerframework.checker.units.qual.C;
import org.example.entities.Courses;

import java.util.List;

public interface CourseService {



    public List<Courses> getCourses();
    public Courses getCourseById(long id);
    public Courses addCourse(Courses courses);
    public Courses updateCourse(Courses courses);
    public void deleteCourse(long id);
}
