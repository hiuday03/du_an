package com.da.du_an.democode.repository;

import com.da.du_an.democode.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(UserRepository.NAME)
public interface UserRepository extends JpaRepository<User, String> {
    public static final String NAME = "BaseUserRepository";
}
