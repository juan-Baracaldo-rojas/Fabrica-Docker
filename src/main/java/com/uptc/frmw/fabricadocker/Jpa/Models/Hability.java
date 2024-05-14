package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "habilidades")
public class Hability {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "IdHabilidades")
        private long idHability;
        @Column(name="nombreHabilidades")
        private String name;

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

        @Override
        public String toString() {
            return "Hability{" +
                    "idHability=" + idHability +
                    ", name='" + name + '\'' +
                    '}';
        }
}
