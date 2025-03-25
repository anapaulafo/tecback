package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Diretor;
import br.uniesp.si.techback.repository.DiretorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorService {
    @Autowired
    private DiretorRepository repository;
    public Diretor cadastrar(Diretor diretor){
        return repository.save(diretor);
    }
    public List<Diretor> listar (){
        return repository.findAll();
    }

    public void excluir (Integer id){
        repository.deleteById(id);
    }

    public Diretor alterar (Diretor diretor){
        if (diretor.getId()==null){
            throw new EntityNotFoundException("Diretor não encontrado");
        } return repository.save(diretor);
    }
}
