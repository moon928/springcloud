package cn.yan.controller;

import cn.yan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @GetMapping("/findAll1")
    public Collection<Student> findAll1(){
//        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
}
