package cn.yan.controller;

import cn.yan.entity.Student;
import cn.yan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student getStuById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.aveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.aveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前访问的端口是："+this.port;
    }
}
