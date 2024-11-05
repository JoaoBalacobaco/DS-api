package br.com.orcamentobd.orcamentoBD.services;

import br.com.orcamentobd.orcamentoBD.model.Municipio;
import br.com.orcamentobd.orcamentoBD.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {
    @Autowired
    private MunicipioRepository municipioRepository;
    public Municipio salvar(Municipio municipio){return municipioRepository.save(municipio);}
}
