package com.gossip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gossip.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
