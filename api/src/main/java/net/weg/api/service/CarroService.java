package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Carro;
import net.weg.api.repository.CarroRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@Service
public class CarroService {

    private CarroRepository carroRepository;


    public Carro buscarUm(@PathVariable(value = "id") Integer id) {
        return carroRepository.findById(id).get() ;
    }

    public Collection<Carro> buscarTodos() {
        return carroRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        carroRepository.deleteById(id);
    }

    public void criar(@RequestBody Carro clubeFutebol) {
        carroRepository.save(clubeFutebol);
    }

    public void editar(@RequestBody Carro clubeFutebol) {
        carroRepository.save(clubeFutebol);
    }
}
