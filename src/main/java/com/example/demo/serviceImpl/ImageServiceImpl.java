package com.example.demo.serviceImpl;

import com.example.demo.model.Image;
import com.example.demo.repository.ImageRepo;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ImageServiceImpl  implements ImageService {
    @Autowired
    private ImageRepo imgRepo;

    @Override
    public Optional<Image> getImgeDetails(int id) {

        return imgRepo.findById(id);
    }

    @Override
    public List<Image> getAllImages() {
        return imgRepo.findAll();
    }

    @Override
    public Image saveImage(Image img) {
        return imgRepo.save(img);
    }

    @Override
    public String deleteImgae(int id) {
        imgRepo.deleteById(id);
        return "deleted";
    }

    @Override
    public Image updateImage(Image img) {
        return imgRepo.save(img);
    }
}
