package com.h2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLStoreRestController {

    @GetMapping(value = "/urlStores/url")
    public ResponseEntity<Object> storeNewUrl(@RequestParam String url){
        if (url!=null){

        }
        return new ResponseEntity<>("Parameter is empty", HttpStatus.BAD_REQUEST);
    }
}
