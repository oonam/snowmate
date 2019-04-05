package com.aki.snowmate.service;

import com.aki.snowmate.entity.User;
import com.aki.snowmate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User saveUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User getUserById(long id) {
    return userRepository.findUserByUserId(id);
  }

  @Override
  public void deleteByUserId(long id) {
    userRepository.deleteById(id);
  }
}
