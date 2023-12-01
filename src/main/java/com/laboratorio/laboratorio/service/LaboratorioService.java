package com.laboratorio.laboratorio.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.laboratorio.laboratorio.Laboratorio;
import com.laboratorio.laboratorio.repository.LaboratorioRepository;

@Service
public class LaboratorioService {

    @Autowired
    private LaboratorioRepository laboratorioRepository;

    public List<Laboratorio> getAllLaboratorios() {
        return laboratorioRepository.findAll();
    }

    public Laboratorio getLaboratorioById(Long id) {
        return laboratorioRepository.findById(id).orElse(null);
    }

    public Laboratorio createLaboratorio(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);
    }

    public Laboratorio updateLaboratorio(Long id, Laboratorio updatedLaboratorio) {
        Laboratorio existingLaboratorio = laboratorioRepository.findById(id).orElse(null);
        if (existingLaboratorio != null) {
            // Atualize os campos relevantes do laboratório existente com base no updatedLaboratorio
            existingLaboratorio.setNome(updatedLaboratorio.getNome());
            existingLaboratorio.setDescricao(updatedLaboratorio.getDescricao());
            // Adicione mais campos conforme necessário

            return laboratorioRepository.save(existingLaboratorio);
        } else {
            return null;
        }
    }

    public boolean deleteLaboratorio(Long id) {
        Laboratorio existingLaboratorio = laboratorioRepository.findById(id).orElse(null);
        if (existingLaboratorio != null) {
            laboratorioRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
