package com.example.openaiimage.service;

import com.example.openaiimage.model.ImageGenerationResponse;

public interface ImageService {
    
    ImageGenerationResponse createImage(String request);
}
