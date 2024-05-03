package com.gossip.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.entity.Blog;
import com.gossip.entity.User;
import com.gossip.repository.BlogRepo;
import com.gossip.repository.UserRepo;

@Service
public class BlogServiceImpl {
	
	@Autowired
	private UserRepo userRepository;

	@Autowired
	private BlogRepo repo; 
	
	
	public ResponseEntity<BlogResponse> createBlog(CreateBlogRequest blogRequest) {
		Blog blog=new Blog();
		User user = userRepository.findByUserName(blogRequest.getUserName());
		if(user == null) {
			BlogResponse response=new BlogResponse();
			response.setMessage("please register first");
			return new ResponseEntity<BlogResponse>(response,HttpStatus.NOT_ACCEPTABLE);
		}
		
		blog.setTitle(blogRequest.getTitle());
		blog.setDescription(blogRequest.getDescription());
		blog.setPublish(blogRequest.getPublish());
		blog.setUser(user);
		blog.setCreatedAt(LocalDateTime.now());
		blog.setUpdatedAt(LocalDateTime.now());
	       
		repo.save(blog);
		return new ResponseEntity<BlogResponse> (HttpStatus.CREATED) ;
	}

	
	public ResponseEntity<BlogResponse> updateBlog(UpdateBlogRequest updateBlogRequest) {
		
		Blog blog =new Blog();

		
		blog.setTitle(updateBlogRequest.getTitle());
		blog.setDescription(updateBlogRequest.getDescription());
		blog.setPublish(updateBlogRequest.getPublish());
		blog.setUpdatedAt(LocalDateTime.now());
		repo.save(blog);
		
		BlogResponse response=new BlogResponse("Success","Blog updated Successfully");
		return new ResponseEntity<BlogResponse>(response,HttpStatus.OK) ;
	}


	public Blog getBlogById(Integer blogId) {
			
				return repo.findBlogById(blogId);
	}

	
	public String deleteBlog(Integer blogId) {
		
		return repo.deleteBlogById(blogId);
	}
	
	

}
