package com.gossip.serviceInterf;


import org.springframework.http.ResponseEntity;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.dto.request.UpdateBlogRequest;
import com.gossip.dto.response.BlogResponse;
import com.gossip.dto.response.GREResponseEntity;
import com.gossip.entity.Blog;

import antlr.collections.List;

public interface BlogServiceInterface {
    
	ResponseEntity<BlogResponse> createBlog(CreateBlogRequest blogRequest);
	ResponseEntity<BlogResponse> updateBlog(UpdateBlogRequest updateBlogRequest);
	ResponseEntity<GREResponseEntity> getBlogById(Integer blogId);
	String deleteBlog(Integer blogId);
 //   List getAllBlogs(String userId);
//    void addCommentToBlog(Long blogId, Comment comment);
	
}

