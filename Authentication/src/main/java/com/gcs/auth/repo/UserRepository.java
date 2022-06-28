package com.gcs.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcs.auth.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
