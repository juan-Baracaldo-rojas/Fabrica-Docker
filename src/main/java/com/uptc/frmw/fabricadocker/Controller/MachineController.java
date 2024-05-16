package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/machine")
public class MachineController {
    @Autowired
    private MachineService machineService;
    @GetMapping
    public List<Machine> getAllMachine() {
        return machineService.findAllMachine();
    }

    @GetMapping("/{idMachine}")
    public Machine getByIdMachine (@PathVariable  Integer idMachine) {
        return machineService.findByIdMachune(idMachine);
    }
    @DeleteMapping("/{idMachine}")
    public void deleteMachine (@PathVariable Integer idMachine) {
        machineService.deleteMachine(idMachine);
    }
    @PostMapping
    public Machine saveMachine (@RequestBody Machine machine) {
        return machineService.saveMachine(machine);
    }

    @PutMapping("/{idMachine}")
    public Machine updateMachine (@PathVariable Integer idMachine, @RequestBody Machine machine) {
        return machineService.updateMachine(idMachine, machine);
    }
}
