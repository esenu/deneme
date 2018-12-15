package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserRegisterController {

    @RequestMapping(value = "/register", method=RequestMethod.POST)
    public UserRegisterResponse registerUser(@RequestBody User user){
        return user.getEmail();
    }
}