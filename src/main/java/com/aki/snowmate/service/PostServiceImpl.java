package com.aki.snowmate.service;

import com.aki.snowmate.entity.Post;
import com.aki.snowmate.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Post savePost(Post post) {
    return postRepository.save(post);
  }

  @Override
  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findPostByPostId(id);
  }

  @Override
  public void deleteById(long id) {
    postRepository.deleteById(id);
  }
}
