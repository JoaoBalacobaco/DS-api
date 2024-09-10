package br.com.orcamentobd.orcamentoBD.repositories;

import br.com.orcamentobd.orcamentoBD.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
