package com.gossip.serviceInterf;

import java.util.List;

import com.gossip.entity.Comment;

public interface CommentServiceInterface {
   
	void saveComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(Integer commentId);
	List<Comment> getAllComments();
    Comment getCommentById(Integer blogId);
}
