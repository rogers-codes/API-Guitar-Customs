package br.com.guitarcustoms.apiguitarcustoms.controller;

import br.com.guitarcustoms.apiguitarcustoms.entity.GuitarCustoms;
import br.com.guitarcustoms.apiguitarcustoms.service.InserirGuitarraUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guitarcustoms")
public class GuitarController {


    @Autowired
    InserirGuitarraUseCase inserirGuitarraUseCase; //cria um objeto da classe useCase para usar os seus métodos

    @PostMapping ("/comprar")
    public GuitarCustoms inserirGuitarra (@RequestBody GuitarCustoms guitarra){ //Recebe uma guitarra como parametro
       return inserirGuitarraUseCase.inserir(guitarra); //insere uma guitarra
    }



//    public GuitarCustoms verGuitarra (@ResponseBody GuitarCustoms guitarCustoms) {
//        return guitarCustoms.toString();
    }

