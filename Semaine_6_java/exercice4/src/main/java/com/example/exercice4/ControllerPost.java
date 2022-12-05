package com.example.exercice4;

import java.util.ArrayList;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ControllerPost {
   /* @PostMapping( "/createlivre" )
    public ResponseEntity createLivre(@RequestBody Map<String, String> request)
    {
        return ResponseEntity.ok(request);
    }*/
    @CrossOrigin
    @PostMapping("/addlivre")
    public ResponseEntity addLivre(@RequestBody Map<String, String> request){
        Livre.addLivre(new Livre(request.get("titre"), request.get("auteur")));
        return ResponseEntity.ok(request);
    }
    @CrossOrigin
    @GetMapping("/getlistelivres")
    public ArrayList getListeLivre(){
        return Livre.getListeLivres();
    }


}
