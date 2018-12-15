package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetUserList {
    @RequestMapping(value="/userList", method= RequestMethod.GET)
    public List<User> getUserList(@RequestParam(value="email", defaultValue = "csd@asd.com") String email){
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setEmail("asd");
        user.setPassword("asd@asd.com");
        userList.add(user);

        user = new User();
        user.setEmail("bsd@asd.com");
        user.setPassword("bsd@asd.com");
        userList.add(user);

        for (User u: userList)
        {
            if (email.equals(u.getEmail())) {
                return userList;
            }
        }
        userList.clear();
        user = new User();
        user.setEmail("parola hatalı");
        user.setPassword("");
        userList.add(user);

        return userList;
    }
}
