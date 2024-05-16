package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> findAllMachine () {
        return machineRepository.findAll();
    }
}
