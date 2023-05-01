package com.geekster.University_Event._Management.controller;

import com.geekster.University_Event._Management.model.Department;
import com.geekster.University_Event._Management.model.Student;
import com.geekster.University_Event._Management.service.StudentService;
import io.micrometer.common.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "students")
    public String addStudents(@RequestBody List<Student> studentList){
        return studentService.addStudents(studentList);
    }

    @GetMapping(value = "students")
    public List<Student> getStudent(@Nullable @RequestParam Integer id){

        return studentService.getStudents(id);
    }

    @DeleteMapping(value = "student/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }

    @PutMapping(value = "student/{id}/{department}")
    public String updateStudentDepartmentById(@PathVariable Integer id , @PathVariable Department department){
        return studentService.updateStudentDepartmentById(id , department);
    }

}
