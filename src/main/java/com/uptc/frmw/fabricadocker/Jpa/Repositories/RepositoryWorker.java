package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryWorker extends JpaRepository<Worker,Long> {
}
