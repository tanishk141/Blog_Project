package com.gossip.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gossip.entity.Comment;
import com.gossip.serviceInterf.CommentServiceInterface;

@Service
public class CommentServiceImpl implements CommentServiceInterface {

	@Override
	public void saveComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(Integer commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getCommentById(Integer blogId) {
		// TODO Auto-generated method stub
		return null;
	}

}
