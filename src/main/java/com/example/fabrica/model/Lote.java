package com.example.fabrica.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Lote {
    //código, nome, data, produto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "produtoId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produto;
    private String name;
    private Date date;
}
