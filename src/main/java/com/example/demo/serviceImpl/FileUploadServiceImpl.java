package com.example.demo.serviceImpl;

import com.example.demo.model.Image;
import com.example.demo.security.JwtTokenUtil;
import com.example.demo.service.FileUpload;

import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileUploadServiceImpl implements FileUpload {
    @Autowired
    private ImageService imageService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Override
    public String uploadImage(String path, MultipartFile file, String token) throws IOException {

        String name = file.getOriginalFilename();
        String filePath = path + File.separator + name;
        Image img = new Image();
        img.setImgName(filePath);
        String username=jwtTokenUtil.getUsernameFromToken(token.replace("Bearer ",""));
        //saving image data in db
        img.setUseId(username);
        try {
            if (imageService.saveImage(img) != null) ;
            //create folder if not created
            {
                File f = new File(path);
                if (!f.exists()) {
                    f.mkdir();
                }
                Files.copy(file.getInputStream(), Paths.get(filePath));
                return name;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return name;
    }
}
