package com.example.fabrica.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "produto")
public class Produto {
    // título, descrição, preço de produção, preço de venda, categoria, disponibilidade
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private float priceProduction;
    private float salePrice;
    private String category;
    private boolean available;
}
