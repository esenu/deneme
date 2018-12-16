package endpoints;

import hello.User;
import hello.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    private long saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }
}