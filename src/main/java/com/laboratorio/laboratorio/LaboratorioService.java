package com.laboratorio.laboratorio;

import java.util.List;

public interface LaboratorioService {
    List<Laboratorio> getAllLaboratorios();

    List<Laboratorio> getLaboratoriosDisponiveis();

    Laboratorio getLaboratorioById(Long id);

    Laboratorio saveLaboratorio(Laboratorio laboratorio);

    Laboratorio updateLaboratorio(Long id, Laboratorio laboratorio);

    void deleteLaboratorio(Long id);
}
