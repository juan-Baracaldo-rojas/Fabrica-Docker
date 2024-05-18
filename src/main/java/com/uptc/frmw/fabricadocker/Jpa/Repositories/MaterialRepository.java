package com.uptc.frmw.fabricadocker.Jpa.Repositories;


import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MaterialRepository extends JpaRepository <Material, Integer> {
}



