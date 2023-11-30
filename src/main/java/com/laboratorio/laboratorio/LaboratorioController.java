package com.laboratorio.laboratorio;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

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
