package com.example.demo.service;

import com.example.demo.model.UserDao;
import com.example.demo.model.UserDto;


public interface UserService {

     UserDao save(UserDto user);



}
