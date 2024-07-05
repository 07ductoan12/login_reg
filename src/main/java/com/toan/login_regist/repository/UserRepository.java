package com.toan.login_regist.repository;

import com.toan.login_regist.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/** UserRepository */
public interface UserRepository extends JpaRepository<User, Long> {}
