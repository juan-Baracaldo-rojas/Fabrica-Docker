package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Worker;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.RepositoryWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesWorker {
    @Autowired
    private RepositoryWorker repositoryWorker;


    public List<Worker> findAll(){
        return repositoryWorker.findAll();
    }

    public  Worker findWorkerById(Long idWorker){
        return repositoryWorker.findById(idWorker).orElse(null);
    }

    public void deleteWorker(Long idWorker){
        repositoryWorker.deleteById(idWorker);
    }
    public Worker saveWorker(Worker worker){
        return repositoryWorker.save(worker);
    }
    public  Worker updateWorker(Long idWorker,Worker worker){
        Worker workerBd=findWorkerById(idWorker);
        boolean workerNotNull= workerBd != null;
        if (workerNotNull){
            workerBd.setName(worker.getName());
            workerBd.setLast_name(worker.getLast_name());
            workerBd.setBoringDate(worker.getBoringDate());
         //   workerBd.setHabilities(worker.getHabilities());
            workerBd.setAdress(worker.getAdress());
            return saveWorker(workerBd);
        }
        throw new RuntimeException("Factura no encontrada");
    }



}
