package br.com.guitarcustoms.apiguitarcustoms.service;

import br.com.guitarcustoms.apiguitarcustoms.entity.GuitarCustoms;
import org.springframework.stereotype.Service;

@Service
public class ComprarGuitarraUseCase {

    public void comprar (GuitarCustoms guitarCustoms){
        System.out.println(guitarCustoms);
    }


}
