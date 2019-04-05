package com.aki.snowmate.service;

import com.aki.snowmate.entity.User;

public interface UserService {

  User saveUser(User user);
  User getUserById(long id);
  void deleteByUserId(long id);
}
