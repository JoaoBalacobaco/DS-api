package br.com.estoque.joaopaulo.controllers;

import br.com.estoque.joaopaulo.model.Produto;
import br.com.estoque.joaopaulo.repositories.ProdutoRepository;
import br.com.estoque.joaopaulo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/produto")

public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping()
    public List<Produto> ListarTodosProdutos(){
        return produtoRepository.findAll(Sort.by("nomeproduto").ascending());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPeloCodigoP(@PathVariable Long id){
        Optional<Produto>produto = produtoRepository.findById(id);
        return produto.isPresent() ? ResponseEntity.ok(produto.get()) : ResponseEntity.notFound().build();
    }
    @RequestMapping()
    public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto){
        Produto produtosalvo = produtoService.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtosalvo);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover (@PathVariable Long id){produtoRepository.deleteAllById(id);
    }
}
