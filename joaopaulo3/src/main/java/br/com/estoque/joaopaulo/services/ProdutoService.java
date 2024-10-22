package br.com.estoque.joaopaulo.services;

import br.com.estoque.joaopaulo.model.Produto;
import br.com.estoque.joaopaulo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    public Produto salvar(Produto produto){return produtoRepository.save(produto);}
}
