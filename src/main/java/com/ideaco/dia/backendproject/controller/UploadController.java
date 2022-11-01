package com.ideaco.dia.backendproject.controller;

import com.ideaco.dia.backendproject.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/upload")
public class UploadController {

    @Autowired
    public UploadService uploadService;

    @PostMapping("/image")
    public boolean uploadImage(@RequestParam("image")MultipartFile image){
        if (uploadService.saveFile(image)){
            return true;
        }else {
            return false;
        }
    }
}
