package com.example.ticketcaissefinal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TicketCaisse {

    Ticket t1;

    @PostMapping("/addArticle")
    public ResponseEntity addArticle(@RequestBody Article article) {
        article.incrementID();
        this.t1.addArticle(article);
        System.out.println(article);
        return ResponseEntity.ok(article);
    }

    @PostMapping("/addClientName")
    public ResponseEntity addArticle(@RequestBody String name) {
        this.t1 = new Ticket(name);
        return ResponseEntity.ok(name);
    }

    @GetMapping("/getBill")
    public Ticket getBill() {
        this.t1.getTot();
        return this.t1;
    }
}
