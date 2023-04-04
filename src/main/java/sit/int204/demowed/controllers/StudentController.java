package sit.int204.demowed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sit.int204.demowed.entities.Student;
import sit.int204.demowed.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping("/initialize")
    public ResponseEntity<String> init() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1001, "Somchai", 3.20));
        studentList.add(new Student(1002, "Somsak", 3.50));
        studentList.add(new Student(1003, "Somsri", 2.50));
        studentList.add(new Student(1004, "Somkiat", 3.75));
        studentList.add(new Student(1005,
                "Somchoke"
                , 2.80));
        service.saveAll(studentList);
        String message = "5 new Students have added !!!";
        return new ResponseEntity(message, HttpStatus.OK);
    }
    @GetMapping("/student-list")
    public ResponseEntity<String> getStudents() {
        StringBuilder sb = new StringBuilder();
        for (Student student : service.getAll()) {
            sb.append(student.getId()).append(", ").append(student.getName());
            sb.append(", ").append(student.getGpax());
            sb.append("<br>------------------------<br>");
        }
        return new ResponseEntity(sb.toString(), HttpStatus.OK);
    }
    @GetMapping("/save-student")
    public ResponseEntity<String> saveStudent(
            //รับ ค่ามา
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam double gpax) {
        Student s = new Student(id, name, gpax);
        service.save(s);
        //return method ด้านบน
        return getStudents();
    }

    @GetMapping("/find-std")
    public String FindStd(
            //รับ ค่ามา
            @RequestParam int id){
        System.out.println(service.findById(id));
           return service.findById(id).toString();
        //return method ด้านบน
    }


}
