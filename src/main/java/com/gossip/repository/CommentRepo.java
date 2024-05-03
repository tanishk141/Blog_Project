package com.gossip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gossip.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {


	List<Comment> findByBlogId(Integer blogId);

	Comment findCommentById(Integer commentId);

	Comment deleteCommentById(Integer commentId);

	
}
