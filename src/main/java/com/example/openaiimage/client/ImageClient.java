package com.example.openaiimage.client;

import com.example.openaiimage.model.ImageGenerationRequest;
import com.example.openaiimage.model.ImageGenerationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "imageApi", url = "https://api.openai.com/v1/images/generations")
public interface ImageClient {
    
    @PostMapping
    ImageGenerationResponse createImage(@RequestBody ImageGenerationRequest request, @RequestHeader("Authorization") String token);
}
