package study.querydsl.ctr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtr {
    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}
