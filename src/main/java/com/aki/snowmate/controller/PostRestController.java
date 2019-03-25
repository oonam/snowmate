package com.aki.snowmate.controller;

import com.aki.snowmate.entity.Post;
import com.aki.snowmate.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostRestController {

  PostServiceImpl postService;

  @Autowired
  public PostRestController(PostServiceImpl postService) {
    this.postService = postService;
  }

  @PostMapping("/save_post")
  public Post savePost(@RequestBody Post post) {
    return postService.savePost(post);
  }

  @GetMapping({"", "/list_posts"})
  public List<Post> getAllPosts() {
    return postService.getPosts();
  }

  @GetMapping("/edit_post/{postId}")
  public Post editPostById(@PathVariable(value = "postId") long id) {
    return postService.getPostById(id);
  }

  @PostMapping("/edit_post/{postId}")
  public Post editPostById(@RequestBody Post post) {
    return postService.savePost(post);
  }

  @GetMapping("/delete_post/{postId}")
  public void deletePostById(@PathVariable(value = "postId") long id) {
    postService.deleteByPostId(id);
  }
}
