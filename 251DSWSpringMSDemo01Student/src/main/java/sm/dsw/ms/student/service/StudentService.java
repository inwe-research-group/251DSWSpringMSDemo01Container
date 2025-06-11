package sm.dsw.ms.student.service;

import sm.dsw.ms.student.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByCourseId(Long courseId);
}
