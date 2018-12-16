package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/Users")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/Users/{id}")
    private User getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/Users/{id}")
    private void deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @PostMapping("/Users")
    private long saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }
}
