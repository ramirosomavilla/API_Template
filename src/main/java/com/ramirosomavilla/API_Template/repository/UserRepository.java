package com.ramirosomavilla.API_Template.repository;

import com.ramirosomavilla.API_Template.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}