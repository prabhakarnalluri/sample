package com.example.demo.service;

import com.example.demo.model.Image;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Optional<Image> getImgeDetails(int id);
    List<Image> getAllImages();
    Image saveImage(Image img);
    String deleteImgae(int is);
    Image updateImage(Image img);

}
