package endpoints;

import hello.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    private String hello() {
        return "world";
    }

}