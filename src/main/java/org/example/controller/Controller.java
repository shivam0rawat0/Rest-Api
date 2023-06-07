package org.example.controller;

import org.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @Value("${server.port}")
    private String port;
    @Autowired
    Repository dataRepository;
    @GetMapping("/")
    public String setting() {
        return "<a href='http://localhost:"+ port +"/datapoint/1'>datapoint/{id}</a>";
    }

    @RequestMapping(value = "/datapoint/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(@PathVariable int id) {
        System.out.println("Standard Rest Api");
        return new ResponseEntity<>(dataRepository.getDataPoint(id), HttpStatus.OK);
    }

}