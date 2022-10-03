package com.example.fabrica.controller;

import com.example.fabrica.model.Lote;
import com.example.fabrica.model.Produto;
import com.example.fabrica.service.LoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lote")
public class LoteController {

    private final LoteService loteService;

    public LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Lote> addLote(@RequestBody Lote lote) {
        return new ResponseEntity<>(loteService.add(lote), HttpStatus.CREATED);
    }

    @PostMapping("/{name}")
    public ResponseEntity<Lote> getByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(loteService.getByName(name), HttpStatus.OK);
    }


}
