package com.proyectAlex.Challenge_Foro_Alura.service;

import com.proyectAlex.Challenge_Foro_Alura.models.Topico;

import java.util.List;

public interface TopicoService {
    Topico cadastrar(Topico topico);
    List<Topico> listarTodos();
    Topico mostrarDetalhes(Long id);
    Topico atualizar(Long id, Topico topico);
    void remover(Long id);
}

