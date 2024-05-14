package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Hability;
import com.uptc.frmw.fabricadocker.Services.ServicesHability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Habilities")
public class ControllerHability {
    @Autowired
    private ServicesHability servicesHability;
    @GetMapping
    public List<Hability> findAll(){
        return servicesHability.findAll();
    }
    @GetMapping("/{IdHabilidad}")
    public Hability findHabilityId(@PathVariable Long IdHabilidad){
        return servicesHability.findHabilityId(IdHabilidad);
    }
    @PostMapping()
    public Hability saveHability(@RequestBody Hability hability){
        return servicesHability.saveHability(hability);
    }
    @PutMapping("/{id}")
    public Hability updateHability(@PathVariable Long id,@RequestBody Hability hability){
       return servicesHability.updateHability(id,hability);
    }
    @DeleteMapping("/{IdHabilidad}")
    public void deleteHability(long idHability){
        servicesHability.deleteHability(idHability);
    }

}
