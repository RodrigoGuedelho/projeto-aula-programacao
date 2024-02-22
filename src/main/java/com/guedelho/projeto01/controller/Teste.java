package com.guedelho.projeto01.controller;

import com.guedelho.projeto01.models.Pessoa;
import com.guedelho.projeto01.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Teste {

    @Autowired
    private PessoaRepository pessoaRepository;


    @GetMapping("/pessoas/{id}")
    public Pessoa buscaPorId(@PathVariable("id") Long id){
        Pessoa p = pessoaRepository.findById(id).get();

        return p;
    }

    @GetMapping("/pessoas")
    public List<Pessoa> listaTodos(){
        return pessoaRepository.findAll();
    }

    @PostMapping("/pessoas")
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/pessoas/{id}")
    public Pessoa editar(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) throws Exception {
        Pessoa p = pessoaRepository.findById(id).get();

        if (p == null)
            throw new Exception("Pessoa não exist");

        pessoa.setId(id);

        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/pessoas/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception {
        Pessoa p = pessoaRepository.findById(id).get();

        if (p == null)
            throw new Exception("Pessoa não existe");

        pessoaRepository.delete(p);
    }
}
