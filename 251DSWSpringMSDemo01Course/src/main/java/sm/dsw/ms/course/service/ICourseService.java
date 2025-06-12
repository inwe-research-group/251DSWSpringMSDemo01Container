package sm.dsw.ms.course.service;

import sm.dsw.ms.course.http.response.StudentByCourseResponse;
import sm.dsw.ms.course.model.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    //StudentByCourseResponse findStudentByCourseId(Long courseId);
}
