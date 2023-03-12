package com.example.openaiimage.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ImageGenerationResponse {

    private Long created;
    
    private List<Data> data;
}
