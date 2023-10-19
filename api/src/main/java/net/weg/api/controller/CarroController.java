package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Carro;
import net.weg.api.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/clube")
public class CarroController {

    CarroService clubeService;

    @GetMapping("/{id}")
    public Carro buscarUm(@PathVariable(value = "id") Integer id) {
        return clubeService.buscarUm(id);
    }

    @GetMapping
    public Collection<Carro> buscarTodos() {
        return clubeService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id) {
        clubeService.deletar(id);
    }

    @PostMapping()
    public void criar(@RequestBody Carro clubeFutebol) {
        clubeService.criar(clubeFutebol);
    }

    @PutMapping()
    public void editar(@RequestBody Carro clubeFutebol) {
        clubeService.editar(clubeFutebol);
    }
}
