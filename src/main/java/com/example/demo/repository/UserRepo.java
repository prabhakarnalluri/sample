package com.example.demo.repository;


import com.example.demo.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<UserDao,Long> {


    UserDao findByuserName(String name);
}
