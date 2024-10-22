package br.com.estoque.joaopaulo.repositories;

import br.com.estoque.joaopaulo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
