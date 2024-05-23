package com.kea.bilrapport.Repository;

import com.kea.bilrapport.Model.Skade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkadeRepository extends JpaRepository<Skade, Long> {
    Optional<Skade> findById(Long skadeId);

    // Andre metoder i dit repository...
}
