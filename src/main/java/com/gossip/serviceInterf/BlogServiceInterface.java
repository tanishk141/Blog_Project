package com.gossip.serviceInterf;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.entity.Blog;
import com.gossip.entity.Comment;

public interface BlogServiceInterface {
    
	ResponseEntity<BlogResponse> createBlog(CreateBlogRequest blogRequest);
	ResponseEntity<BlogResponse> updateBlog(UpdateBlogRequest updateBlogRequest);
	Blog getBlogById(Integer blogId);
	String deleteBlog(Integer blogId);
   
//    List<Blog> getAllBlogs(String userId);
//    void addCommentToBlog(Long blogId, Comment comment);
	
}

