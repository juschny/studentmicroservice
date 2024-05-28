package jcode.course.service;



import jcode.course.entity.Course;
import jcode.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCourseResponse findStudentsByCourseId(Long courseId);
}
