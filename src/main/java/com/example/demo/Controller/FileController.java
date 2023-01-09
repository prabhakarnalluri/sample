package com.example.demo.Controller;


import com.example.demo.Payloads.FileResponse;

import com.example.demo.service.FileUpload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileUpload fileUploadService;

    @Value("${project.image}")
    private String path;


    @PostMapping("/upload")
    ResponseEntity<?> fileupload(@RequestParam("image") MultipartFile image,@RequestHeader("Authorization") String bearerToken) throws IOException {
        String fileName = null;
        try {
            fileName = fileUploadService.uploadImage(path, image, bearerToken);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ok(new FileResponse(null, "Image is not Uploaded"));
        }
        return new ResponseEntity(new FileResponse(fileName, "Image is uploaded"), HttpStatus.OK);

    }

}
