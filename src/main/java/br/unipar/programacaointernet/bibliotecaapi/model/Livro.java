package br.unipar.programacaointernet.bibliotecaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60)
    private String titulo;

    @Column(length = 20)
    private String genero;

    @Column(length = 120)
    private String autor;

    @Column(length = 10)
    private String edicao;

}
