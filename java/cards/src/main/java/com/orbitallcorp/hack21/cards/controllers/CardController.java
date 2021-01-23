package com.orbitallcorp.hack21.cards.controllers;

import com.orbitallcorp.hack21.cards.domains.Card;
import com.orbitallcorp.hack21.cards.services.CardService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping
    public ResponseEntity<Card> save(@RequestBody Card card) {
        Card savedCard = cardService.save((card));

        return new ResponseEntity(savedCard, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Card>> findAll() {
        List<Card> cards = cardService.findAll();
        return ResponseEntity.ok(cards);
    }

    /*
    //Tentativa de Implementar 'PUT     /cards/{id}'
    @PutMapping("/{id}")

    //Tentativa de Implementar 'DELETE     /cards/{id}'
    @DeleteMapping("/{id}")

    //Tentativa de Implementar 'GET     /cards/{id}'
    @GetMapping("/{id}")
    public ResponseEntity<List<Card>> findById() {
        List<Card> idcards = cardService.findById(ID);
        return ResponseEntity.ok(idcards);
    }

    //Tentativa de Implementar 'GET     /cards/paginationAndSorting'
    @GetMapping("/paginationAndSorting")
    */


}