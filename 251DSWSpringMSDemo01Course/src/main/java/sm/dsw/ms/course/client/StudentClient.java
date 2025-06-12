package sm.dsw.ms.course.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sm.dsw.ms.course.dto.StudentDTO;

import java.util.List;

@FeignClient(name="251DSWSpringMSDemo01Student",url="localhost:8091/api/student")
public interface StudentClient {
    @GetMapping("/api/student/search-by-course/{courseId}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long courseId);
}
