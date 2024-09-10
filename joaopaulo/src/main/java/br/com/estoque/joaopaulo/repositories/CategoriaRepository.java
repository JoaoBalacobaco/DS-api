package br.com.estoque.joaopaulo.repositories;

import br.com.estoque.joaopaulo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {


}
