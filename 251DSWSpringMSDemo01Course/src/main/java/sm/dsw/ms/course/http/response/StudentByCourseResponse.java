package sm.dsw.ms.course.http.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sm.dsw.ms.course.dto.StudentDTO;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentByCourseResponse {
    private String coursename;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
