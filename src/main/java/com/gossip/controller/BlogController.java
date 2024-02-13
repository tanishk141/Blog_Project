package com.gossip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.entity.Blog;
import com.gossip.serviceInterf.BlogServiceInterface;

@RestController
@RequestMapping("/blogs")
public class BlogController {
	
	@Autowired
	BlogServiceInterface blogServiceInterface;
	
	
	@PostMapping(path = "addBlog")
	public ResponseEntity<BlogResponse> addBlog(@RequestBody CreateBlogRequest blogRequest){
		return blogServiceInterface.createBlog(blogRequest);
	}
	
	@PutMapping(path = "updateBlog")
	public ResponseEntity<BlogResponse> updateBlog(@RequestBody UpdateBlogRequest updateBlogRequest){
		return blogServiceInterface.updateBlog(updateBlogRequest);
	}
	
//	@GetMapping(path = "getBlog")
//	public Blog getBlog(@PathVariable Integer blogId) {
//		Blog blog =new Blog();
//		return blog;
//	}
//	
//	@DeleteMapping(path = "deleteBlog")
//	public String deleteBlog(@PathVariable Integer blogId) {
//		return "Blog with ID "+blogId+ "deleted successfully" ;
//	}
	
}
