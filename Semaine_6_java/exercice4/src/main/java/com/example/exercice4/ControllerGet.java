package com.example.exercice4;

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
public class ControllerGet {
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/bonjour")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Inconnu") String name)
    {
        return new Hello(counter.incrementAndGet(), String.format( "Hello, %s!", name));
    }
    @RequestMapping(value = "/hello/**", method = RequestMethod.GET)
    @ResponseBody
    public String hello(HttpServletRequest request)
    {
        String requestURL = request.getRequestURL().toString();
        String arg[] = requestURL.split("/");
        String prenom = arg[4];
        String nom = arg[5];
        return String.format( "bonjour %s %s", prenom, nom.toUpperCase() );
    }
    //@CrossOrigin(origins = "http://localhost:8080")
    @CrossOrigin
    @GetMapping("/meteo")
    public String ajax(HttpServletRequest request)
    {
        return "brrr !!!! fait froid...";
    }

    @GetMapping("/livre")
    public Livre livre(@RequestParam(value = "titre", defaultValue = "Inconnu") String titre, @RequestParam(value = "auteur", defaultValue = "Inconnu") String auteur)
    {

        return new Livre(titre, auteur);
    }

    @GetMapping("/addition")
    public String addition(@RequestParam(value = "i1") int i1, @RequestParam(value = "i2") int i2){
        return i1 + " + " + i2 + " = " + (i1+i2);
    }

    @RequestMapping(value = "/addition/**", method = RequestMethod.GET)
    @ResponseBody
    public String addition(HttpServletRequest request){
        String requestURL = request.getRequestURL().toString();
        String arg[] = requestURL.split("/");
        int i1 = Integer.parseInt(arg[4]);
        int i2 = Integer.parseInt(arg[5]);
        return String.format( "%o + %o = %o", i1, i2, (i1+i2));
    }
}