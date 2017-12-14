package controller;

import data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }


    @RequestMapping(path = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(String email) {
        User user = new User();
        String mail = "1";
        user.setEmail(mail);
        user.setName("Name");
        userService.create(user);
        return user.toString();
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List getAll() {
        return userService.getAll();
    }
}
