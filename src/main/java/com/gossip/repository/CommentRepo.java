package com.gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gossip.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {

	
}
