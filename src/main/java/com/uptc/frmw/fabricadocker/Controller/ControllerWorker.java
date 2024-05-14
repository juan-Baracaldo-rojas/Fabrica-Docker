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
    public  Worker findWorkerById(Long idWorker){
        return servicesWorker.findWorkerById(idWorker);
    }
    @DeleteMapping("/{idWorker}")
    public void deleteWorker(long idWorker){
        servicesWorker.deleteWorker(idWorker);
    }
    @PostMapping()
    public Worker saveWorker(Worker worker){
        return servicesWorker.saveWorker(worker);
    }
    @PutMapping("/{idWorker}")
    public  Worker updateWorker(Long idWorker,Worker worker){
      return servicesWorker.updateWorker(idWorker,worker);
    }

}
