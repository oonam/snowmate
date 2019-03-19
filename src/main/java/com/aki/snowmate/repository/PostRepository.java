package com.aki.snowmate.repository;

import com.aki.snowmate.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();
  Post findPostByPostId(long id);
}
