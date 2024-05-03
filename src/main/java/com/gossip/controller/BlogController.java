package com.gossip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.dto.response.GREResponseEntity;
import com.gossip.entity.Blog;
import com.gossip.serviceImpl.BlogServiceImpl;

@RestController
@RequestMapping("/blogs")
public class BlogController {
	
	@Autowired
	BlogServiceImpl blogServiceImpl;
	
	
	@PostMapping(value = {"createBlog"})
	public ResponseEntity<BlogResponse> createBlog(@RequestBody CreateBlogRequest blogRequest){
		return blogServiceImpl.createBlog(blogRequest);
	}
	
	@PutMapping(value = {"updateBlog"})
	public ResponseEntity<BlogResponse> updateBlog(@RequestBody UpdateBlogRequest updateBlogRequest){
		return blogServiceImpl.updateBlog(updateBlogRequest);
	}
	
	@GetMapping(path = "getBlog")
	public ResponseEntity<GREResponseEntity<Object>> getBlog(@RequestParam Integer blogId) {
		GREResponseEntity<Object> greResponseEntity=new GREResponseEntity();
	    try {
            Blog getBlog = blogServiceImpl.getBlogById(blogId);	
            greResponseEntity.setData(getBlog);
            greResponseEntity.setMessage("Success");
            return ResponseEntity.ok(greResponseEntity);
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
		
		
	}
	
	@DeleteMapping("deleteBlog/{blogId}")
	public ResponseEntity<GREResponseEntity> deleteBlog(@PathVariable Integer blogId) {
		GREResponseEntity greResponseEntity=new GREResponseEntity();
		
		try {
			blogServiceImpl.deleteBlog(blogId);
			greResponseEntity.setMessage("Blog Deleted Successfully");
			return ResponseEntity.ok(greResponseEntity);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
//	@GetMapping(path="getAllBlogs")
//	public ResponseEntity<GREResponseEntity> getAllBlogs(){
//		
//	
//	}
	
	
	
	
	
	
	
	
	
	
}
