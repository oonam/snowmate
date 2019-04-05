package com.aki.snowmate.controller;

import com.aki.snowmate.entity.Post;
import com.aki.snowmate.entity.User;
import com.aki.snowmate.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

  UserServiceImpl userService;

  @Autowired
  public UserRestController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @PostMapping("/save_user")
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/edit_user/{userId}")
  public User editUserById(@PathVariable(value = "userId") long id) {
    return userService.getUserById(id);
  }

  @PostMapping("/edit_user/{userId}")
  public User editUserById(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/delete_post/{userId}")
  public void deleteUserById(@PathVariable(value = "userId") long id) {
    userService.deleteByUserId(id);
  }
}