package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
