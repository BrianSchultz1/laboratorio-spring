package com.laboratorio.laboratorio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
    // Adicione métodos de consulta personalizados, se necessário
}
