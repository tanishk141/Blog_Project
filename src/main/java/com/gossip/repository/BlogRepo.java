package com.gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gossip.entity.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Integer> {

	Blog findBlogById(Integer blogId);

	String deleteBlogById(Integer blogId);
	
	
	
}
