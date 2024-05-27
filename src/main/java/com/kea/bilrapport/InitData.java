package com.kea.bilrapport;

import com.kea.bilrapport.Model.DataRegistrering;
import com.kea.bilrapport.Model.Skade;
import com.kea.bilrapport.Repository.DataRegistreringRepository;
import com.kea.bilrapport.Repository.SkadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class InitData implements CommandLineRunner {

    private final DataRegistreringRepository dataRegistreringRepository;
    private final SkadeRepository skadeRepository;

    @Autowired
    public InitData(DataRegistreringRepository dataRegistreringRepository, SkadeRepository skadeRepository) {
        this.dataRegistreringRepository = dataRegistreringRepository;
        this.skadeRepository = skadeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Opret dummy data for leasing
        DataRegistrering leasingData = new DataRegistrering();
        leasingData.setStelNummer(123L);
        leasingData.setNavn("Justin");
        leasingData.setEfternavn("Bieber");
        leasingData.setBilModel(2022);
        leasingData.setBilMærke("Toyota");
        leasingData.setLejeStartDato(new Date());
        leasingData.setLejeSlugDato(new Date(System.currentTimeMillis() + 864000000L)); // 10 dage frem

        dataRegistreringRepository.save(leasingData);

        // Opret dummy data for skade
        Skade skadeData = new Skade();
        skadeData.setSkadeId(1L);
        skadeData.setBilId(leasingData.getStelNummer());
        skadeData.setBeskrivelse("Front bumper damage");
        skadeData.setPris(1500.00);

        skadeRepository.save(skadeData);

        // Lav et link til http://localhost:8080/forside
        System.out.println("Link til forsiden: http://localhost:8080/forside");
    }
}
