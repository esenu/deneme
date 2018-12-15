package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetUserList {
    @RequestMapping(value="/userList", method= RequestMethod.GET)
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setEmail("asd@asd.com");
        user.setPassword("asd@asd.com");

        userList.add(user);
        return userList;
    }
}
