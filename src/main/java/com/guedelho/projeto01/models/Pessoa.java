package com.guedelho.projeto01.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1, initialValue = 1)
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
    private Long id;
    private String nome;
    private int idade;


}
