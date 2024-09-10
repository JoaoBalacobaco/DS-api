package br.com.orcamentobd.orcamentoBD.controllers;

import br.com.orcamentobd.orcamentoBD.model.Lancamento;
import br.com.orcamentobd.orcamentoBD.repositories.LancamentoRepository;
import br.com.orcamentobd.orcamentoBD.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {
    @Autowired
    private LancamentoService lancamentoService;
    @Autowired
    private LancamentoRepository lancamentoRepository;
    @GetMapping()
    public List<Lancamento> listarTodoasosLancamentos(){
        return lancamentoRepository.findAll(Sort.by("date").ascending());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> buscarPeloCodigoL(@PathVariable Long id){
        Optional<Lancamento>lancamento = lancamentoRepository.findById(id);
        return lancamento.isPresent() ? ResponseEntity.ok(lancamento.get()) : ResponseEntity.notFound().build();
    }

    @RequestMapping()
    public ResponseEntity<Lancamento> inserir (@RequestBody Lancamento lancamento){
        Lancamento lancamentoesalvar = lancamentoService.salvar(lancamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoesalvar);
    }
}
