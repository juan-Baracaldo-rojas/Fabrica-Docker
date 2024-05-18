package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Worker;
import com.uptc.frmw.fabricadocker.Services.ServicesWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Workers")
public class ControllerWorker {
    @Autowired
    private ServicesWorker servicesWorker;
    @GetMapping
    public List<Worker> findAll(){
        return servicesWorker.findAll();
    }
    @GetMapping("/{idWorker}")
    public  Worker findWorkerById(@PathVariable Long idWorker){
        return servicesWorker.findWorkerById(idWorker);
    }
    @DeleteMapping("/{idWorker}")
    public void deleteWorker(@PathVariable long idWorker){
        servicesWorker.deleteWorker(idWorker);
    }
    @PostMapping()
    public Worker saveWorker(@RequestBody    Worker worker){
        return servicesWorker.saveWorker(worker);
    }
    @PutMapping("/{idWorker}")
    public  Worker updateWorker( @PathVariable Long idWorker, @RequestBody Worker worker){
      return servicesWorker.updateWorker(idWorker,worker);
    }

}
