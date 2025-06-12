package sm.dsw.ms.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.course.client.StudentClient;
import sm.dsw.ms.course.dto.StudentDTO;
import sm.dsw.ms.course.http.response.StudentByCourseResponse;
import sm.dsw.ms.course.model.Course;
import sm.dsw.ms.course.repository.ICourseRepository;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>)courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByCourseId(Long courseId) {
        //consultar si existe el curso
        Course course=courseRepository.findById(courseId).orElseThrow();
        //obtener los estudiantes
        List<StudentDTO> studentDTOList=studentClient.findAllStudentByCourse(course.getId());

        return StudentByCourseResponse.builder()
                .coursename(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
