package com.example.Shop1.controller;

import com.example.Shop1.Entity.Coffee;
import com.example.Shop1.repository.CoffeeRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Coffee_controller {
   private final CoffeeRepo coffeeRepo;
    public Coffee_controller(CoffeeRepo coffeeRepo){
        this.coffeeRepo=coffeeRepo;

    }
    @RequestMapping(value = "/coffees",method = RequestMethod.GET)
    public Iterable<Coffee> getCoffees(){
        return coffeeRepo.findAll();
    }
    @GetMapping("/coffees/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable Long id){
        return coffeeRepo.findById(id);
    }
    @PostMapping("/coffees")
    public Coffee postCoffee(@RequestBody Coffee coffee){
        return coffeeRepo.save(coffee);
    }
    @PutMapping("/coffees/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable Long id,
                                     @RequestBody Coffee coffee) {
        return (!coffeeRepo.existsById(id))
                ? new ResponseEntity<>(coffeeRepo.save(coffee),
                HttpStatus.CREATED)
                : new ResponseEntity<>(coffeeRepo.save(coffee), HttpStatus.OK);
    }
    @DeleteMapping("/coffees/{id}")
    public void deleteCoffee(@PathVariable Long id){
        coffeeRepo.deleteById(id);
    }

}
