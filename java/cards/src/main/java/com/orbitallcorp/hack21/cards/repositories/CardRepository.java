package com.orbitallcorp.hack21.cards.repositories;

import com.orbitallcorp.hack21.cards.domains.Card;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.orbitallcorp.hack21.cards.domains.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CardRepository extends PagingAndSortingRepository<Card, Long> {

}
//Create
//Retrieve
//Update
//Delete

//public interface CardRepository extends PagingAndSortingRepository<Card, Long> {
//
//}