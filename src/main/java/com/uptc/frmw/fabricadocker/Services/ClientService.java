package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Client;
import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ClientRepository;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ShoppingOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ShoppingOrderRepository shoppingOrderRepository;

    public List<Client> getAllClient () {
        return clientRepository.findAll();
    }

    public Client findByIdClient (Integer idCliente) {
        Optional<Client> client = clientRepository.findById(idCliente);
        return client.orElse(null);
    }

    public void deleteClient (Integer idClient) {
        clientRepository.deleteById(idClient);
    }

    public Client saveClient (Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient (Integer idClient, Client client) {
        Client clientBd = findByIdClient(idClient);
        if (clientBd != null) {
            clientBd.setAddress(client.getAddress());
            clientBd.setContactName(client.getContactName());
            clientBd.setNumberPhone(client.getNumberPhone());
            return saveClient(clientBd);
        }
        throw new RuntimeException("Cliente no encontrado");
    }
}
