package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine, Integer> {
}
