package endpoints;

import hello.User;
import hello.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthenticateController {
    @Autowired
    UserService userService;

    @GetMapping("/authenticate")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}