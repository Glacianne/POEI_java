package com.example.exercice4bis;

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
public class Controller {
    AtomicLong nbrUsers = new AtomicLong();

    @GetMapping("/bonjour")
    public String bonjour(@RequestParam(value = "nom") String name){
       //return "Utilisateur " + nbrUsers.incrementAndGet() + " : " + "Bonjour " + name + ".";
        return "bonjour";
    }

}
