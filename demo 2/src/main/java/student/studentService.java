package student;
//service layer  it is the business layer


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// @Component  or
@Service
public class studentService {

    public List<Student> getStudents()
    {

        return List.of(new Student(
                1L,
                "Rewaa",
                "rrrr@gmaikl",
                LocalDate.of(1992, Month.FEBRUARY,6),
                29
        ));
    }



}
