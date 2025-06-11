package sm.dsw.ms.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.student.model.Student;
import sm.dsw.ms.student.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {

        return (List<Student>)studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public List<Student> findByCourseId(Long courseId) {
        return studentRepository.findAllByCourseId(courseId);
    }
}
