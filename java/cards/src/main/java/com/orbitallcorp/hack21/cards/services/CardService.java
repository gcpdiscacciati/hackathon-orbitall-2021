package com.orbitallcorp.hack21.cards.services;

import com.orbitallcorp.hack21.cards.domains.Card;
import com.orbitallcorp.hack21.cards.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

        // O código abaixo força o Iterable para List
        // return (List<Customer>) repository.findAll();

        return cards;
    }
}
