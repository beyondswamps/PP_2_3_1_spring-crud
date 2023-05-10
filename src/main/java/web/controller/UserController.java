package web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public String listUsers(Model model, @RequestParam(name = "id", required = false) Long id, User user) {
        if (id == null) {
            model.addAttribute("users", userService.getUsers());
        } else model.addAttribute("users", userService.getUser(id));
        model.addAttribute("user", user);
        return "users";
    }

    @RequestMapping(method=RequestMethod.POST, value = "/users")
    public String addUser(@ModelAttribute User user, Model model) {
//        model.addAttribute("user", user);
        userService.addUser(user);

        return "redirect:/users";
    }


}
