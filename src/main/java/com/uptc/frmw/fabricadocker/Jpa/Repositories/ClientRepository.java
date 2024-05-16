package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
