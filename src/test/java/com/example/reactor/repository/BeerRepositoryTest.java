package com.example.reactor.repository;

import com.example.reactor.domain.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@DataR2dbcTest
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testCreateNew(){
        Beer beer = Beer.builder()
                .beerName("Galaxy Dog")
                .beerStyle("Pale Ale")
                .upc("789456")
                .price(new BigDecimal("15.99"))
                .quantityOnHand(10)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
        beerRepository.save(beer).subscribe(b -> System.out.println(b.getId()));
    }

}