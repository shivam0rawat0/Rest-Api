package org.example.controller;

import org.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    Repository dataRepository;
    @GetMapping("/hello/{name}/{age}")
    public void insert(@PathVariable("name") String name, @PathVariable("age") int age) {
        System.out.println(name);
        System.out.println(age);
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(@PathVariable int id) {
        return new ResponseEntity<>(dataRepository.getDataPoint(id), HttpStatus.OK);
    }

}