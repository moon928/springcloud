package cn.yan.controller;

import cn.yan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return "当前的端口是： "+restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
