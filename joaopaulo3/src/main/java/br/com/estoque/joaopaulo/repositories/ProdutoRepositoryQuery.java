package br.com.estoque.joaopaulo.repositories;

import br.com.estoque.joaopaulo.dto.ProdutoDto;
import br.com.estoque.joaopaulo.repositories.Filters.ProdutoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProdutoRepositoryQuery {
    public Page<ProdutoDto> filtrar(ProdutoFilter produtoFilter, Pageable pageable);
}
