package sm.dsw.ms.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sm.dsw.ms.course.model.Course;
import sm.dsw.ms.course.service.ICourseService;

@RestController
@RequestMapping("api/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("/all")
    public ResponseEntity<?> findById(){
        return ResponseEntity.ok(courseService.findAll());
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course){
        courseService.save(course);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

//    @GetMapping("search-student/{courseId}")
//    public ResponseEntity<?> findStudentsByCourseId(@PathVariable Long courseId){
//        return ResponseEntity.ok(courseService.findStudentByCourseId(courseId));
//    }
}
