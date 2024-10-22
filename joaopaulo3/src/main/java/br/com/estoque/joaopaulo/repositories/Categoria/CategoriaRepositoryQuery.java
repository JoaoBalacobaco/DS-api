package br.com.estoque.joaopaulo.repositories.Categoria;

import br.com.estoque.joaopaulo.model.Categoria;
import br.com.estoque.joaopaulo.repositories.Filters.CategoriaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoriaRepositoryQuery {
    public Page<Categoria> filtrar(CategoriaFilter categoriaFilter, Pageable pageable);
}
