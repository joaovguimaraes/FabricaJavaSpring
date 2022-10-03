package com.example.fabrica.repository;

import com.example.fabrica.model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LoteRepository extends JpaRepository<Lote, Long> {
    Optional<Lote> findByName(String name);

    List<Lote> findByDate(Date date);
}
