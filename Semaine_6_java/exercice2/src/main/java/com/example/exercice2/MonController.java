package com.example.exercice2;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MonController {

    @GetMapping("/message")
    public String mamethodeAPI(HttpServletRequest req){
        return "Hello world !";
    }

    @CrossOrigin
    @GetMapping("/meteo")
    public String getMeteo(HttpServletRequest req){
        return "Il fait beau";
    }
}