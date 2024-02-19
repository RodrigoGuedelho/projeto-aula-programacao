package com.guedelho.projeto01.controller;

import com.guedelho.projeto01.models.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
public class Teste {


    @GetMapping("/pessoas")
    public Pessoa hello(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rodrigo");
        pessoa.setIdade(7);

        return pessoa;
    }

    @PostMapping("/pessoas")
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoa;
    }

    @PutMapping("/pessoas")
    public Pessoa editar(@RequestBody Pessoa pessoa){
        return pessoa;
    }

    @DeleteMapping("/pessoas/{id}")
    public Long delete(@PathVariable("id") Long id){
        return id;
    }
}
