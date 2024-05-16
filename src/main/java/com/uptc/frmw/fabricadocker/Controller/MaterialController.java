package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Machine;
import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import com.uptc.frmw.fabricadocker.Services.MachineService;
import com.uptc.frmw.fabricadocker.Services.MaterialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/material")
public class MaterialController {

        @Autowired
        private MaterialServices materialServices;
        @GetMapping
        public List<Material> getAllMaterial() {

            return materialServices.findAllMaterial();
        }


    }

