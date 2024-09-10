package br.com.orcamentobd.orcamentoBD.repositories;

import br.com.orcamentobd.orcamentoBD.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento,Long> {
}
