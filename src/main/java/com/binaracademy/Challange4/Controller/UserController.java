package com.binaracademy.Challange4.Controller;

import com.binaracademy.Challange4.Dto.UserDto;
import com.binaracademy.Challange4.Entity.User;
import com.binaracademy.Challange4.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/")
    public List<User> view_user(){
        return userService.ls_user();
    }
    @GetMapping(path = "/{id}")
    public Optional<User> view_user(@PathVariable Long id){
        return userService.ls_user(id);
    }
    @PostMapping(path ="/")
    public User add_user(@RequestBody UserDto userDto){
        return userService.set_user(userDto);
    }
    @PutMapping(path = "/{id}")
    public User set_user(@PathVariable Long id, @RequestBody UserDto userDto){
        userDto.setIdUser(id);
        return userService.set_user(userDto);
    }
    @DeleteMapping(path = "/{id}")
    public String delete_user(@PathVariable Long id){
        if(userService.delete_user(id)){
            return "Succes";
        }
        return "Failed";
    }
}
