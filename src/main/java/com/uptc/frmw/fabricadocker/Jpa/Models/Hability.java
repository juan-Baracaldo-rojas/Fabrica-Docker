package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
    @Table(name = "habilidad")
public class Hability {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "IdHabilidad")
        private long idHability;
        @Column(name="nombreHabilidad")
        private String name;

    @ManyToMany(mappedBy = "habilities")
    private List<Worker> workers;


    public Hability() {
        }

        public long getIdHability() {
            return idHability;
        }

        public void setIdHability(long idHability) {
            this.idHability = idHability;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
/*
    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
*/
    @Override
        public String toString() {
            return "Hability{" +
                    "idHability=" + idHability +
                    ", name='" + name + '\'' +
                    '}';
        }
}
