package com.example.openaiimage.controller;

import com.example.openaiimage.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImageController implements ImageApi {
    
    private final ImageService imageService;
    
    @Override
    public String createImage(String request) {
        return imageService.createImage(request);
    }
}
