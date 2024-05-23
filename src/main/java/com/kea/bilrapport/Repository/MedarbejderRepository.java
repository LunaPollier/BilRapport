package com.kea.bilrapport.Repository;
import com.kea.bilrapport.Model.Medarbejder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface MedarbejderRepository extends CrudRepository<Medarbejder, Integer>{

    }
