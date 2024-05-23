package com.kea.bilrapport.Repository;

import com.kea.bilrapport.Model.DataRegistrering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRegistreringRepository extends JpaRepository<DataRegistrering, String> {
}
