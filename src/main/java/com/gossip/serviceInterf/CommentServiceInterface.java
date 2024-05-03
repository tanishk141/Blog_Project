package com.gossip.serviceInterf;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gossip.dto.request.CreateCommentRequest;
import com.gossip.dto.request.UpdateCommentRequest;
import com.gossip.dto.response.CommentResponse;
import com.gossip.entity.Comment;

public interface CommentServiceInterface {
   
	ResponseEntity<CommentResponse> createComment(CreateCommentRequest commentRequest);
	ResponseEntity<CommentResponse>  updateComment(UpdateCommentRequest request);
    Comment deleteComment(Integer commentId);
	List<Comment> getComments(Integer blogId);
}
