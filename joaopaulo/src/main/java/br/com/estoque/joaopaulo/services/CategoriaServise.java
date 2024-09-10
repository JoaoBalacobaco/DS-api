package br.com.estoque.joaopaulo.services;

import br.com.estoque.joaopaulo.model.Categoria;
import br.com.estoque.joaopaulo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServise {
    @Autowired
    private CategoriaRepository categoriaRepository;
    public Categoria salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
