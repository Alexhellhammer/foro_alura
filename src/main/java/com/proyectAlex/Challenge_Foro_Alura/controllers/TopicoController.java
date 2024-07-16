package com.proyectAlex.Challenge_Foro_Alura.controllers;

import com.proyectAlex.Challenge_Foro_Alura.models.Topico;
import com.proyectAlex.Challenge_Foro_Alura.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService topicoService;

    @Autowired
    public TopicoController(TopicoService topicoService) {
        this.topicoService = topicoService;
    }

    @PostMapping
    public Topico cadastrarTopico(@RequestBody @Valid Topico topico) {
        return topicoService.cadastrar(topico);
    }

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Topico mostrarDetalhesTopico(@PathVariable Long id) {
        return topicoService.mostrarDetalhes(id);
    }

    @PutMapping("/{id}")
    public Topico atualizarTopico(@PathVariable Long id, @RequestBody @Valid Topico topico) {
        return topicoService.atualizar(id, topico);
    }

    @DeleteMapping("/{id}")
    public void removerTopico(@PathVariable Long id) {
        topicoService.remover(id);
    }
}



