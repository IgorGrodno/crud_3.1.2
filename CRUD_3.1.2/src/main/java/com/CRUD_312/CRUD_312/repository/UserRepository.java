package com.CRUD_312.CRUD_312.repository;

import com.CRUD_312.CRUD_312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
