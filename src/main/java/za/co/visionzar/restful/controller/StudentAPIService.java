package za.co.visionzar.restful.controller;


import org.springframework.web.bind.annotation.*;
import za.co.visionzar.restful.model.StudentDetails;

@RestController
@RequestMapping("/student")
public class StudentAPIService {

    StudentDetails studentDetails;

    @GetMapping("{studentId}")
    public StudentDetails getStudentDetails(String studentId){
        return studentDetails;
    }
    @PostMapping
    public  String createStudentDetails(@RequestBody StudentDetails studentDetails){
        this.studentDetails=studentDetails;
        return "created";
    }
    @PutMapping
    public  String updateStudentDetails(@RequestBody StudentDetails studentDetails){
        this.studentDetails=studentDetails;
        return "updated";
    }
    @DeleteMapping("{studentId}")
    public String deleteStudentDetails(String studentId){
        this.studentDetails=null;
        return "deleted";

    }


}