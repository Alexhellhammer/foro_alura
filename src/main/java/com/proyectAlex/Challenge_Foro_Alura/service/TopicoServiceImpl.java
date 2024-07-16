package com.proyectAlex.Challenge_Foro_Alura.service;

import com.proyectAlex.Challenge_Foro_Alura.models.Topico;
import com.proyectAlex.Challenge_Foro_Alura.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoServiceImpl implements TopicoService {

    private final TopicoRepository topicoRepository;

    @Autowired
    public TopicoServiceImpl(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    @Override
    @Transactional
    public Topico cadastrar(Topico topico) {
        return topicoRepository.save(topico);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Topico> listarTodos() {
        return topicoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Topico mostrarDetalhes(Long id) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);
        return optionalTopico.orElse(null);
    }

    @Override
    @Transactional
    public Topico atualizar(Long id, Topico topico) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);
        if (optionalTopico.isPresent()) {
            Topico topicoExistente = optionalTopico.get();
            topicoExistente.setTitulo(topico.getTitulo());
            topicoExistente.setMensaje(topico.getMensaje());
            topicoExistente.setEstado(topico.getEstado());
            topicoExistente.setCurso(topico.getCurso());
            return topicoRepository.save(topicoExistente);
        }
        return null;
    }

    @Override
    @Transactional
    public void remover(Long id) {
        topicoRepository.deleteById(id);
    }
}


