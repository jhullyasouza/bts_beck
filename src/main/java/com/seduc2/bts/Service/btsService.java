package com.seduc2.bts.Service;

import com.seduc2.bts.Entity.BTS;
import com.seduc2.bts.Repository.btsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class btsService {


    private final btsRepository repository;
    public btsService(btsRepository repository) {
        this.repository = repository;
    }

    public BTS salvar(BTS bts){
        return repository.save(bts);
    }

    public List<BTS> listar(){
        return repository.findAll();
    }
}

