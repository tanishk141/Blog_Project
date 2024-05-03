package com.gossip.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gossip.dto.request.CreateCommentRequest;
import com.gossip.dto.request.UpdateCommentRequest;
import com.gossip.dto.response.CommentResponse;
import com.gossip.entity.Blog;
import com.gossip.entity.Comment;
import com.gossip.entity.User;
import com.gossip.repository.BlogRepo;
import com.gossip.repository.CommentRepo;
import com.gossip.repository.UserRepo;
import com.gossip.serviceInterf.CommentServiceInterface;

@Service
public class CommentServiceImpl implements CommentServiceInterface {

	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private BlogRepo blogRepo;
	
	public ResponseEntity<CommentResponse> createComment(CreateCommentRequest commentRequest) {
	 
		User user = userRepo.findByUserName(commentRequest.getUserName());
		Blog blog = blogRepo.findBlogById(commentRequest.getBlogId());
		
		Comment comment =new Comment();
		comment.setTitle(commentRequest.getTitle());
		comment.setBlog(blog);
		comment.setUser(user);
		comment.setCreatedAt(LocalDateTime.now());
		comment.setUpdatedAt(LocalDateTime.now());
		
		commentRepo.save(comment);
		CommentResponse response =new CommentResponse();
		response.setMessage("Comment Posted");
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

	public ResponseEntity<CommentResponse>  updateComment(UpdateCommentRequest request) {
		
//		User user = userRepo.findById(request.getUserId());
//		Blog blog = blogRepo.findBlogById(request.getBlogId());
//		Comment existingComment = commentRepo.findCommentById(request.getCommentId());
//		
//		Comment updatecomment =new Comment();
//		updatecomment.setTitle(request.getTitle());
//		updatecomment.setBlog(blog);
//		updatecomment.setId(request.getCommentId());
//		updatecomment.setUser(user);
//		updatecomment.setUpdatedAt(LocalDateTime.now());
//		
//		commentRepo.save(updatecomment);
//		CommentResponse response=new CommentResponse();
//		response.setMessage("comment updated");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	public Comment deleteComment(Integer commentId) {
		return commentRepo.deleteCommentById(commentId);
		
	}

	public List<Comment> getComments(Integer blogId) {
		return commentRepo.findByBlogId(blogId);
	}


}
