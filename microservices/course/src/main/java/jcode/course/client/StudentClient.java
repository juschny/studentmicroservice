package jcode.course.client;


import jcode.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("/api/student/search-by-course/{courseId}") // microservicio student asi se comunica con microservicio course
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long courseId);
}
