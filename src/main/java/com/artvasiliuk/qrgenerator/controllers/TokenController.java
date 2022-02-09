package com.artvasiliuk.qrgenerator.controllers;

import com.artvasiliuk.qrgenerator.services.QRService;
import com.google.zxing.WriterException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class TokenController {

    QRService qrService;
    int imgSize = 500; //to move to app.properties
    String filePath = "C:\\Fun\\art-expo\\GITHUB\\CLEAN\\qr-generator-web-service\\src\\main\\resources\\image.png";

    @GetMapping("/token/{token}")
    @ResponseBody
    public void getToken(@PathVariable String token) throws IOException, WriterException {
        qrService.createQR(token, imgSize, imgSize, filePath);
    }
}
