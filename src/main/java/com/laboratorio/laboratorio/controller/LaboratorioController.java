package com.laboratorio.laboratorio.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.laboratorio.Laboratorio;
import com.laboratorio.laboratorio.service.LaboratorioService;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    @Autowired
    private final LaboratorioService laboratorioService;

    public LaboratorioController(LaboratorioService laboratorioService) {
        this.laboratorioService = laboratorioService;
    }

    @GetMapping
    public List<Laboratorio> getAllLaboratorios() {
        return laboratorioService.getAllLaboratorios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Laboratorio> getLaboratorioById(@PathVariable Long id) {
        Laboratorio laboratorio = laboratorioService.getLaboratorioById(id);
        if (laboratorio != null) {
            return new ResponseEntity<>(laboratorio, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Laboratorio> createLaboratorio(@RequestBody Laboratorio laboratorio) {
        Laboratorio createdLaboratorio = laboratorioService.createLaboratorio(laboratorio);
        return new ResponseEntity<>(createdLaboratorio, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Laboratorio> updateLaboratorio(@PathVariable Long id, @RequestBody Laboratorio laboratorio) {
        Laboratorio updatedLaboratorio = laboratorioService.updateLaboratorio(id, laboratorio);
        if (updatedLaboratorio != null) {
            return new ResponseEntity<>(updatedLaboratorio, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLaboratorio(@PathVariable Long id) {
        boolean deleted = laboratorioService.deleteLaboratorio(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
