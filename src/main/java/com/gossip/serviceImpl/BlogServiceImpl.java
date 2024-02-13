package com.gossip.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.entity.Blog;
import com.gossip.entity.User;
import com.gossip.repository.BlogRepo;
import com.gossip.repository.UserRepo;
import com.gossip.serviceInterf.BlogServiceInterface;

@Service
public class BlogServiceImpl implements BlogServiceInterface{

	@Autowired
	private BlogRepo repo; 
	
	@Autowired
	private UserRepo userRepository;
	
	@Override
	public ResponseEntity<BlogResponse> createBlog(CreateBlogRequest blogRequest) {
		
		Blog blog=new Blog();
			
		blog.setTitle(blogRequest.getTitle());
		blog.setDescription(blogRequest.getDescription());
		blog.setPublish(blogRequest.getPublish());
		blog.setCreatedAt(LocalDateTime.now());
		blog.setUpdatedAt(LocalDateTime.now());
	       
		repo.save(blog);
		
		
		return null;
	}

	@Override
	public ResponseEntity<BlogResponse> updateBlog(UpdateBlogRequest updateBlogRequest) {
		
		return null;
	}

	@Override
	public Blog getBlogById(Integer blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBlog(Integer blogId) {
		// TODO Auto-generated method stub
		return null;
	}


}
