package br.com.guitarcustoms.apiguitarcustoms.service;

import br.com.guitarcustoms.apiguitarcustoms.entity.GuitarCustoms;
import br.com.guitarcustoms.apiguitarcustoms.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InserirGuitarraUseCase {

    @Autowired
    private GuitarRepository guitarRepository;

    public GuitarCustoms inserir (GuitarCustoms guitarCustoms){
        guitarCustoms = guitarRepository.save(guitarCustoms); //salva guitarra no db
        return guitarCustoms;

    }


}
