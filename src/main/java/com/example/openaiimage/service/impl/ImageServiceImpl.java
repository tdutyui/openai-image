package com.example.openaiimage.service.impl;

import com.example.openaiimage.client.ImageClient;
import com.example.openaiimage.model.ImageGenerationRequest;
import com.example.openaiimage.model.ImageGenerationResponse;
import com.example.openaiimage.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {
    
    private final ImageClient imageClient;
    
    private static final String TOKEN = System.getenv("OPENAI_TOKEN");
    
    @Override
    public ImageGenerationResponse createImage(String request) {
        ImageGenerationRequest imageGenerationRequest = ImageGenerationRequest.builder()
                .prompt(request)
                .n(1)
                .size("1024x1024")
                .responseFormat("url")
                .user("user")
                .build();
        return imageClient.createImage(imageGenerationRequest, TOKEN);
    }
}
