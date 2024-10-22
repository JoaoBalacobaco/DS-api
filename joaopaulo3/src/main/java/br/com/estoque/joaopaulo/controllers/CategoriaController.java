package br.com.estoque.joaopaulo.controllers;

import br.com.estoque.joaopaulo.model.Categoria;
import br.com.estoque.joaopaulo.repositories.CategoriaRepository;
import br.com.estoque.joaopaulo.repositories.Filters.CategoriaFilter;
import br.com.estoque.joaopaulo.services.CategoriaServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaServise categoriaServise;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @GetMapping()
    public Page<Categoria> pesquisar(CategoriaFilter categoriaFilter, Pageable pageable){
        return categoriaRepository.filtrar(categoriaFilter, pageable);
    }
   @GetMapping("/todas")
    public List<Categoria> ListarTodaasCategorias(){
        return categoriaRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable int id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.isPresent() ? ResponseEntity.ok(categoria.get()) : ResponseEntity.notFound().build();
    }
    @PostMapping()
    public ResponseEntity<Categoria> inseir(@RequestBody Categoria categoria){
        Categoria categoriaSalva = categoriaServise.salvar(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover (@PathVariable int id) {
        categoriaRepository.deleteById(id);
    }

}
