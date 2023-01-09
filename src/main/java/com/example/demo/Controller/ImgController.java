package com.example.demo.Controller;

import com.example.demo.model.Image;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/img")
public class ImgController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/{id}")
    Optional<Image> getImageDetails(@PathVariable int id){return imageService.getImgeDetails(id);}
    @PostMapping("/save")
    Image saveImage(@RequestBody Image img){return imageService.saveImage(img);}
    @DeleteMapping("/{id}")
    String deleteImagage(@PathParam("id") int id){ return imageService.deleteImgae(id);}
    @PostMapping("/update")
    Image updateImage(@RequestBody Image img){return imageService.updateImage(img);}
}
