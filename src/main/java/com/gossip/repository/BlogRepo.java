package com.gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gossip.dto.request.CreateBlogRequest;
import com.gossip.entity.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Integer> {


	
}
