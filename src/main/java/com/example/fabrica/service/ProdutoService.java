package com.example.fabrica.service;

import com.example.fabrica.model.Produto;
import com.example.fabrica.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto add(Produto produto) {
        produto = produtoRepository.save(produto);
        return produto;
    }

    public List<Produto> getAll() {
        Optional<List<Produto>> produtoOptional = Optional.of(produtoRepository.findAll());
        return produtoOptional.orElse(null);
    }

    public List<Produto> getByCategory(String category) {
        Optional<List<Produto>> produtoOptional = Optional.of(produtoRepository.findByCategory(category));
        return produtoOptional.orElse(null);
    }

    public List<Produto> getAvailable() {
        Optional<List<Produto>> produtoOptional = Optional.of(produtoRepository.findAllByAvailableIsTrue());
        return produtoOptional.orElse(null);
    }

    public Produto getById(Long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        return produtoOptional.orElse(null);
    }
}
