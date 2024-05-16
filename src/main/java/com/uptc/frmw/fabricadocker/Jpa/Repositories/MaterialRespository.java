package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRespository extends JpaRepository<Material, Integer> {
}
