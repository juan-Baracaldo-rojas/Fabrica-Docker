package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> findAllMachine () {
        return machineRepository.findAll();
    }

    public Machine findByIdMachune (Integer idMachine) {
        Optional<Machine> machine = machineRepository.findById(idMachine);
        return machine.orElse(null);
    }

    public void deleteMachine (Integer idMachine) {
        machineRepository.deleteById(idMachine);
    }

    public Machine saveMachine (Machine machine) {
        return machineRepository.save(machine);
    }

    public Machine updateMachine (Integer idMachine, Machine machine) {
        Machine machineBd = findByIdMachune(idMachine);
        if (machineBd != null) {
            machineBd.setBrand(machine.getBrand());
            machineBd.setModel(machine.getModel());
            machineBd.setSerialNumber(machine.getSerialNumber());
            machineBd.setShoppingDate(machineBd.getShoppingDate());
            machineBd.setWorkers(machine.getWorkers());
            return saveMachine(machineBd);
        }
        throw new RuntimeException("Maquina no encontrada");
    }
}
