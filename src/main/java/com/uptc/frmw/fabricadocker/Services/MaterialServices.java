package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.MaterialRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServices {
    @Autowired
    private MaterialRespository materialRepository;

    public List<Material> findAllMaterial() {
        return materialRepository.findAll();
    }
}