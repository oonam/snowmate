package com.aki.snowmate.service;

import com.aki.snowmate.entity.Post;

import java.util.List;

public interface PostService {

  Post savePost(Post post);
  List<Post> getPosts();
  Post getPostById(long id);
  void deleteByPostId(long id);
}