package com.aki.snowmate.repository;

import com.aki.snowmate.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findUserByUserId(long id);
}
