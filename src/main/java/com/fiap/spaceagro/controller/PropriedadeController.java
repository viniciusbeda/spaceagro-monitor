package com.fiap.spaceagro.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.spaceagro.model.Propriedade;
import com.fiap.spaceagro.service.PropriedadeService;

@RestController
public class PropriedadeController {

    @Autowired
    private PropriedadeService service;

    @GetMapping("/propriedades")
    public List<Propriedade> listarTodas() {
        return service.listarTodas();
    }

    @PostMapping("/propriedades")
    public Propriedade salvar(@RequestBody Propriedade propriedade) {
    return service.salvar(propriedade);
    }

    @GetMapping("/propriedades/{id}")
    public Propriedade buscarPorId(@PathVariable Long id) {
    return service.buscarPorId(id);
    }

    @PutMapping("/propriedades/{id}")
    public Propriedade atualizar(@PathVariable Long id,
    @RequestBody Propriedade propriedade) {
    return service.atualizar(id, propriedade);
    }

    @DeleteMapping("/propriedades/{id}")
    public void deletar(@PathVariable Long id) {
    service.deletar(id);
    }

}