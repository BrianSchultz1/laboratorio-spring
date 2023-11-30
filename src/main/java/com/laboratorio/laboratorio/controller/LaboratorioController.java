package com.laboratorio.laboratorio.controller;

import com.laboratorio.laboratorio.Laboratorio;
import com.laboratorio.laboratorio.service.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/disponiveis")
    public List<Laboratorio> getLaboratoriosDisponiveis() {
        return laboratorioService.getLaboratoriosDisponiveis();
    }

    // Implemente CRUD completo
}
