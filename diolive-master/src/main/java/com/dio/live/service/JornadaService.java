package com.dio.live.service;

import com.dio.live.Repository.JornadaRespository;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRespository jornadaRespository;

    @Autowired
    public JornadaService(JornadaRespository jornadaRespository) {
        this.jornadaRespository = jornadaRespository;
    }
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
       return jornadaRespository.save(jornadaTrabalho);
    }
    public List<JornadaTrabalho> FindAll() {
       return jornadaRespository.findAll();
    }
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRespository.findById(idJornada);
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRespository.save(jornadaTrabalho);
    }
    public void deleteJornada(Long idJornada){
        jornadaRespository.deleteById(idJornada);}
}