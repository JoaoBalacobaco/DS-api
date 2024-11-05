package br.com.orcamentobd.orcamentoBD.controllers;

import br.com.orcamentobd.orcamentoBD.model.Municipio;
import br.com.orcamentobd.orcamentoBD.repositories.MunicipioRepository;
import br.com.orcamentobd.orcamentoBD.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/municipio")
public class MunicipioController {
    @Autowired
    private MunicipioService municipioService;
    @Autowired
    private MunicipioRepository municipioRepository;
    @GetMapping()
    public List<Municipio> listarTodososMunicipios(){
        return municipioRepository.findAll(Sort.by("nome").ascending());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Municipio> buscarPeloCodigoP(@PathVariable int id){
        Optional<Municipio> municipio = municipioRepository.findById(id);
        return municipio.isPresent() ? ResponseEntity.ok(municipio.get()) : ResponseEntity.notFound().build();
    }
    @RequestMapping()
    public ResponseEntity<Municipio> inserir (@RequestBody Municipio municipio){
        Municipio municipiosalvar = municipioService.salvar(municipio);
        return ResponseEntity.status(HttpStatus.CREATED).body(municipiosalvar);
    }
}
