package com.student.gr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.gr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
