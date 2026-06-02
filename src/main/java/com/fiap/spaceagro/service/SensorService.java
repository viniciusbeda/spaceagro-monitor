package com.fiap.spaceagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.spaceagro.model.Sensor;
import com.fiap.spaceagro.repository.SensorRepository;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Sensor atualizar(Long id, Sensor sensor) {
        sensor.setId(id);
        return repository.save(sensor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}