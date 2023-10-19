package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Cliente;
import net.weg.api.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/jogador")
public class ClienteController {

    private ClienteService clienteService;

//    public ClienteController(ClienteService clienteService) {
//        this.clienteService = clienteService;
//    }

    @GetMapping("/{id}")
    public Cliente buscarUm(@PathVariable(value = "id") Integer id) {
        return clienteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Cliente> buscarTodos() {
        return clienteService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id) {
        clienteService.deletar(id);
    }

    @PostMapping()
    public void criar(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
    }

    @PutMapping()
    public void atualizar(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
    }
}
