package com.divyansh.ecom.controller;

import com.divyansh.ecom.model.Role;
import com.divyansh.ecom.model.User;
import com.divyansh.ecom.repository.RoleRepository;
import com.divyansh.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String registerget(){
        return "register";
    }
    @PostMapping("/register")

    public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request)throws ServletException{
        String password= user.getPassword();
        user.setPassword(bCryptPasswordEncoder.encode(password));
        List<Role> roles= new ArrayList<>();
        roles.add(roleRepository.findById(2).get());
        userRepository.save(user);
        request.login(user.getEmail(),password);
        return "redirect:/";
    }

}
