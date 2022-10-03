package com.example.fabrica.controller;

import com.example.fabrica.model.Produto;
import com.example.fabrica.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> addProduto(@RequestBody Produto produto) {
        return new ResponseEntity<>(produtoService.add(produto), HttpStatus.CREATED);
    }

    @PostMapping("/listcategory/{category}")
    public ResponseEntity<List<Produto>> getByCategory(@PathVariable("category") String category) {
        return new ResponseEntity<>(produtoService.getByCategory(category), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Produto>> getAllProduto() {
        return new ResponseEntity<>(produtoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/available")
    public ResponseEntity<List<Produto>> getAllAvailable() {
        return new ResponseEntity<>(produtoService.getAvailable(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProduto(@PathVariable("id") Long id) {
        return new ResponseEntity<>(produtoService.getById(id), HttpStatus.OK);
    }
}
