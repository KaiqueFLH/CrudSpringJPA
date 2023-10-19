package net.weg.api.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.weg.api.model.Seguro;
import net.weg.api.service.SeguroService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/seguro")
public class SeguroController {
    private SeguroService seguroService;

    @GetMapping("/{id}")
    public void buscarId(Integer id){
        seguroService.buscarId(id);
    }

    @GetMapping()
    public void buscarTodos(){
        seguroService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Integer id){
        seguroService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Seguro seguro){
        seguroService.salvar(seguro);
    }

    @PutMapping
    public void atualizar(@RequestBody Seguro seguro){
        seguroService.salvar(seguro);
    }
}
