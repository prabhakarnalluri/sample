package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUpload {
     String uploadImage(String path, MultipartFile file, String token) throws IOException;
}
