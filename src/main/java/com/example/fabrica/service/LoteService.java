package com.example.fabrica.service;

import com.example.fabrica.model.Lote;
import com.example.fabrica.model.Produto;
import com.example.fabrica.repository.LoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoteService {
    private final LoteRepository loteRepository;

    public LoteService(LoteRepository loteRepository) {
        this.loteRepository = loteRepository;
    }

    public Lote add(Lote lote) {
        lote = loteRepository.save(lote);
        return lote;
    }

    public Lote getByName(String name) {
        Optional<Lote> loteOptional = loteRepository.findByName(name);
        return loteOptional.orElse(null);
    }

}
