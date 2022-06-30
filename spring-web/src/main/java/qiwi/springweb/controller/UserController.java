package qiwi.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import qiwi.springweb.model.User;
import qiwi.springweb.service.UserService;
import qiwi.springweb.validator.UserValidator;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "save";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("user", service.getUserById(id));
        return "save";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute User user, BindingResult result) {
        UserValidator validator = new UserValidator();
        validator.validate(user, result);

        if (result.hasErrors()) {
            return "save";
        }

        service.save(user);

        return "redirect:/users/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/users/";
    }

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("users", service.getAll());
        return "index";
    }
}
