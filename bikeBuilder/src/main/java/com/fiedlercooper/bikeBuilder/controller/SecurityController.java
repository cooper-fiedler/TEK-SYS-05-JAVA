package com.fiedlercooper.bikeBuilder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fiedlercooper.bikeBuilder.entity.User;
import com.fiedlercooper.bikeBuilder.repository.UserRepository;
 
@Controller
public class SecurityController {
 
    @Autowired
    private UserRepository userRepo;
    
    // GET MAIN INDEX.HTML
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    // MAIN SIGNUP_FORM.HTML
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup_form";
    }
    
    // ADDS USER UPON SUCCESSFUL REGISTER
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
         
        userRepo.save(user);
         
        return "register_success";
    }
    
    // RETURNS FULL LIST OF USERS
    
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
         
        return "users";
    }
}