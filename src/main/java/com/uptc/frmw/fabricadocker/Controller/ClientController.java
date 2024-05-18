package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Client;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ClientRepository;
import com.uptc.frmw.fabricadocker.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAllClients () {
        return clientService.getAllClient();
    }

    @GetMapping("/{idClient}")
    public Client getClientById (@PathVariable Integer idClient) {
        return clientService.findByIdClient(idClient);
    }

    @DeleteMapping("/{idClient}")
    public void deleteClient(@PathVariable Integer idClient) {
        clientService.deleteClient(idClient);
    }

    @PostMapping
    public Client saveClient (@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @PutMapping("/{idClient}")
    public Client updateClient (@PathVariable Integer idClient, @RequestBody Client client){
        return  clientService.updateClient(idClient, client);
    }
}
