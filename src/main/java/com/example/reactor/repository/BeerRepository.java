package com.example.reactor.repository;


import com.example.reactor.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}