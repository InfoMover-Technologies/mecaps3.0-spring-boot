package com.im.training.springboot;

import lombok.Data;

@Data
public class ExceptionMessage {

    private int status;
    private String message;
    private String details;
    private String path;

}
