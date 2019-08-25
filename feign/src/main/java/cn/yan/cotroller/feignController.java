package cn.yan.cotroller;

import cn.yan.entity.Student;
import cn.yan.feign.FeigProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class feignController {
    @Autowired
    private FeigProviderClient feigProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feigProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feigProviderClient.index();
    }
}
