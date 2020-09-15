package web.controller;

import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping(value = "/")
    public String printUsers(ModelMap model) {
        model.addAttribute("listPersons", userServiceImpl.listUsers());
        return "default";
    }

    @PostMapping(value = "/update")
    public String editUser(@ModelAttribute("person") User user) {
        userServiceImpl.updateUser(user);
        return "redirect:/user/";
    }

    @PostMapping(value = "/newuser")
    public String createUser(@ModelAttribute("person") User user) {
        userServiceImpl.addUser(user);
        return "redirect:/user/";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userServiceImpl.deleteById(id);
        return "redirect:/user/";
    }
}
