package com.fiap.spaceagro.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.spaceagro.model.Sensor;
import com.fiap.spaceagro.service.SensorService;

@RestController
public class SensorController {

    @Autowired
    private SensorService service;

    @GetMapping("/sensores")
    public List<Sensor> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping("/sensores")
    public Sensor salvar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping("/sensores/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
    return service.buscarPorId(id);
    }

    @PutMapping("/sensores/{id}")
    public Sensor atualizar(@PathVariable Long id,
                        @RequestBody Sensor sensor) {
    return service.atualizar(id, sensor);
    }

    @DeleteMapping("/sensores/{id}")
    public void deletar(@PathVariable Long id) {
    service.deletar(id);
    }

}