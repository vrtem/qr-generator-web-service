package com.artvasiliuk.qrgenerator.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class QRController {
    @RequestMapping(value = "/image", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)

    public void getImage(HttpServletResponse response) throws IOException {

        var imgFile = new ClassPathResource("static/images/image.png");

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }
}
