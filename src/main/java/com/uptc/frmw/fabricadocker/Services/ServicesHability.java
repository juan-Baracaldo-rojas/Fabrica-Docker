package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Hability;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.RepositoryHability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesHability {
    @Autowired
    private RepositoryHability repositoryHability;

    public List<Hability> findAll(){
        return repositoryHability.findAll();
    }

    public Hability findHabilityId(Long idHability){
        return repositoryHability.findById(idHability).orElse(null);
    }
    public Hability saveHability(Hability hability){
        return repositoryHability.save(hability);
    }
    public Hability updateHability(Long id,Hability hability){
        Hability habilityBD=findHabilityId(id);
        boolean habilityNotNull=habilityBD!= null;
        if(habilityNotNull){
            habilityBD.setName(hability.getName());
            return saveHability(habilityBD);
        }
        throw new RuntimeException("Factura no encontrada");
    }

    public void deleteHability(long idHability){
        repositoryHability.deleteById(idHability);
    }

}
