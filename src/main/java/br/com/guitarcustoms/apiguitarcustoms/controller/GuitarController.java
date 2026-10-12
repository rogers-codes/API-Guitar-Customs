package br.com.guitarcustoms.apiguitarcustoms.controller;

import br.com.guitarcustoms.apiguitarcustoms.entity.GuitarCustoms;
import br.com.guitarcustoms.apiguitarcustoms.service.ComprarGuitarraUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guitarcustoms")
public class GuitarController {


    @Autowired
    ComprarGuitarraUseCase comprarGuitarraUseCase; //cria um objeto da classe useCase para usar os seus métodos

    @PostMapping ("/comprar")
    public void comprarGuitarra (@RequestBody GuitarCustoms guitarra){ //Recebe uma guitarra como parametro
        comprarGuitarraUseCase.comprar(guitarra); //compra uma guitarra
    }
}
