package com.example.openaiimage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ImageGenerationRequest {
    
    private String prompt;
    
    private Integer n;
    
    private String size;
    
    @JsonProperty(value = "response_format")
    private String responseFormat;
    
    private String user;
}
