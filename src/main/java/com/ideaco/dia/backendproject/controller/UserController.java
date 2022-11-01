package com.ideaco.dia.backendproject.controller;

import com.ideaco.dia.backendproject.dto.LoginDto;
import com.ideaco.dia.backendproject.dto.UserDto;
import com.ideaco.dia.backendproject.model.PersonModel;
import com.ideaco.dia.backendproject.model.UserModel;
import com.ideaco.dia.backendproject.service.UserService;
import com.ideaco.dia.backendproject.utils.response.DataResponse;
import com.ideaco.dia.backendproject.utils.response.HandlerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{userId}")
    public UserModel getUser(@PathVariable int userId){
        UserModel user = userService.getUser(userId);
        if (user == null){
            return new UserModel();
        }else {
            return user;
        }
    }

    @PostMapping("/login")
    public Boolean login(@RequestParam("email") String email,
            @RequestParam("password") String password){
        Boolean login = userService.loginVal(email, password);
        return login;
    }

    @PostMapping("/regis")
    public String createUser(@RequestParam("name") String name,
                         @RequestParam("email") String email,
                             @RequestParam("phone") String phone,
                         @RequestParam("address") String address,
                         @RequestParam("password") String password,
                             @RequestParam("Status") Boolean status){
        if (userService.registration(name, email,phone, address, password, status)) {
            return "success";
        }else {
            return "email is already used in another account";
        }
    }
}
