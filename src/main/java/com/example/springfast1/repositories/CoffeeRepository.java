package com.example.springfast1.repositories;


import com.example.springfast1.models.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
