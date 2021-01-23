package com.orbitallcorp.hack21.cards.services;

import com.orbitallcorp.hack21.cards.domains.Card;
import com.orbitallcorp.hack21.cards.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public Card save(Card card) {
        return cardRepository.save((card));
    }

    public List<Card> findAll() {

        List<Card> cards = new ArrayList<Card>();
        for (Card card : (List<Card>) cardRepository.findAll()) {
            cards.add(card);
        }



        return cards;
    }

    /*
    //Tentativa de implementar findById
    public Optional<Card> findById(Long id){
        return cardRepository.findById(id);
    }*/
}
