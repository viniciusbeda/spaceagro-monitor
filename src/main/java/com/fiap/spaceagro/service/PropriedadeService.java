package com.fiap.spaceagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.spaceagro.model.Propriedade;
import com.fiap.spaceagro.repository.PropriedadeRepository;

@Service
public class PropriedadeService {

    @Autowired
    private PropriedadeRepository repository;

    public List<Propriedade> listarTodas() {
        return repository.findAll();
    }

    public Propriedade salvar(Propriedade propriedade) {
        return repository.save(propriedade);
    }

    public Propriedade buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Propriedade atualizar(Long id, Propriedade propriedade) {
        propriedade.setId(id);
        return repository.save(propriedade);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}