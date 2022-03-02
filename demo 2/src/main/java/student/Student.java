package student;

import javax.persistence.*;
import java.time.LocalDate;
// using spring data jpa  by using these annotations
@Entity   //to map student class to our database
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name ="student_sequence",
            sequenceName ="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

// we will create 3 constructors

//1- generate an empty constructor
  //  public Student(
    //        long id, String name, String email, LocalDate of, Integer age) {
    //}

//test
    public Student() {
    }

    //2- generate constructor with everything
    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


//3- generate constructor with everything except the id because the database will generate the id for us
    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


// generate getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    //generate toString()
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }

    //go back to payrollApplication  and under @getMapping

}

