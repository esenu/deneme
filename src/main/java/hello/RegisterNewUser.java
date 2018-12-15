package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterNewUser {
    @RequestMapping(value="/registerUser", method= RequestMethod.POST)
    public ResponseEntity<User> registerUser(@RequestBody User user){
        System.out.println(user.getEmail() + " " + user.getPassword());
        return  new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
