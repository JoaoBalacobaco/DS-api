package br.com.orcamentobd.orcamentoBD.services;

import br.com.orcamentobd.orcamentoBD.model.Cliente;
import br.com.orcamentobd.orcamentoBD.model.Lancamento;
import br.com.orcamentobd.orcamentoBD.repositories.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;
    public Lancamento salvar(Lancamento lancamento){return lancamentoRepository.save(lancamento);}
}
