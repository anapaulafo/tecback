package br.uniesp.si.techback.controller;


import br.uniesp.si.techback.model.Genero;
import br.uniesp.si.techback.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @GetMapping
    public List<Genero> listar(){ return service.listar(); }

    @PostMapping
    public Genero inserir(@RequestBody Genero genero){
        return service.cadastrar(genero);
    }

    @DeleteMapping
    public ResponseEntity excluir(Integer id) {
        service.excluir(id);
        return ResponseEntity.ok().build();}

    @PutMapping
    public Genero alterar(@RequestBody Genero genero) { return service.alterar(genero); }






}
