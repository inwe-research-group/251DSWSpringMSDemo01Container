package sm.dsw.ms.course.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.course.model.Course;

@Repository
public interface ICourseRepository extends CrudRepository<Course,Long> {
}
