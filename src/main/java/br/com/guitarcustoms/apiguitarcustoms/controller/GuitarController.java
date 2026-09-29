package br.com.guitarcustoms.apiguitarcustoms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guitarcustoms")
public class GuitarController {

    @GetMapping("/hello")
    public String GuitarController() {
        return "hello";
    }
}
