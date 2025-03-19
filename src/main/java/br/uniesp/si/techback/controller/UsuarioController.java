package br.uniesp.si.techback.controller;


import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar(){ return service.listar(); }

    @PostMapping
    public Usuario inserir(@RequestBody Usuario usuario){
        return service.cadastrar(usuario);
    }

    @DeleteMapping
    public ResponseEntity excluir(Integer id) {
        service.excluir(id);
        return ResponseEntity.ok().build();}

    @PutMapping
    public Usuario alterar(@RequestBody Usuario usuario) { return service.alterar(usuario); }






}
