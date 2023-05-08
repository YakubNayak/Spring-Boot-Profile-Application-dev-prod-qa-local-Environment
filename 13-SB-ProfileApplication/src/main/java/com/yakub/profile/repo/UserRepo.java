package com.yakub.profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yakub.profile.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
