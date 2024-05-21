package com.kea.bilrapport.Klasser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



    @Entity
    public class Medarbejder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String brugernavn;
        private String email;
        private String adgangskode;

        // Getter og setter

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBrugernavn() {
            return brugernavn;
        }

        public void setBrugernavn(String brugernavn) {
            this.brugernavn = brugernavn;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAdgangskode() {
            return adgangskode;
        }

        public void setAdgangskode(String adgangskode) {
            this.adgangskode = adgangskode;
        }
    }
