package com.example.openaiimage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/image-api/create")
public interface ImageApi {
    
    @PostMapping
    String createImage(@RequestBody String request);
}
