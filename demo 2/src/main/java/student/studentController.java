package student;
//API layer


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //we annotate with RestController  for the apiLayer as a apiController
@RequestMapping (path ="api/v1/student" )  //used to pass the path of the API instead of the localhost8080
// it will be     http://localhost:8080/api/v1/student
public class studentController {

//use a reference for student service
    private final studentService studentService;

    //we need to create an instance for studentService class
    // so we use an annotation called @AutoWired , it will magicly work as instance for us
    // then go back to studentService Class and add an annotation @Component or @Service
@Autowired
    public studentController(student.studentService studentService) {
        this.studentService = studentService;

    }


    @GetMapping

    public List<Student> getStudents()
    {

        return studentService.getStudents();

    }

    /*
    @GetMapping

    public List<Student> getStudents()
    {

        return List.of(new Student(
                1L,
                "Rewaa",
                "rrrr@gmaikl",
                LocalDate.of(1992, Month.FEBRUARY,6),
                29
        ));
    }*/



}
