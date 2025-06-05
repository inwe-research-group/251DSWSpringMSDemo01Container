package sm.dsw.ms.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
}
