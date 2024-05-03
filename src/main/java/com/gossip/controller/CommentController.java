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
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.gossip.dto.request.CreateCommentRequest;
import com.gossip.dto.request.UpdateCommentRequest;
import com.gossip.dto.response.CommentResponse;
import com.gossip.entity.Comment;
import com.gossip.serviceInterf.CommentServiceInterface;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentServiceInterface commentService;
	
	@PostMapping(value="/createComment")
	public ResponseEntity<CommentResponse> createComment(@RequestBody CreateCommentRequest commentRequest){
		return commentService.createComment(commentRequest);
	} 
	
	@PutMapping(value="/updateComment")
	public ResponseEntity<CommentResponse> updateCommemt(@RequestBody UpdateCommentRequest request){
		return commentService.updateComment(request);
	}
	
	@DeleteMapping("/delete/{commentId}")
	public ResponseEntity<Void> deleteComment(@PathVariable Integer commentId){
		commentService.deleteComment(commentId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	// get comments for a specific blog
	@GetMapping("/getComment/{blogId}")
	public ResponseEntity<List<Comment>> getCommentsByBlog(@PathVariable Integer blogId){
		List<Comment> comments = commentService.getComments(blogId);
		return new ResponseEntity<>(comments,HttpStatus.OK);
	}

}
