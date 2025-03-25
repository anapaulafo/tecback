package br.uniesp.si.techback.controller;


import br.uniesp.si.techback.model.Diretor;
import br.uniesp.si.techback.service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    @Autowired
    private DiretorService service;

    @GetMapping
    public List<Diretor> listar(){ return service.listar(); }

    @PostMapping
    public Diretor inserir(@RequestBody Diretor diretor){
        return service.cadastrar(diretor);
    }

    @DeleteMapping
    public ResponseEntity excluir(Integer id) {
        service.excluir(id);
        return ResponseEntity.ok().build();}

    @PutMapping
    public Diretor alterar(@RequestBody Diretor diretor) { return service.alterar(diretor); }






}
