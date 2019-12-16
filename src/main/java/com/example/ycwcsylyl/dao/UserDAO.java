package com.example.ycwcsylyl.dao;

import com.example.ycwcsylyl.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {

    User getByUsernameAndPassword(String username,String password);

    User findByUsername(String username);
}
