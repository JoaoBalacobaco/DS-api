package br.com.orcamentobd.orcamentoBD.controllers;

import br.com.orcamentobd.orcamentoBD.model.Cliente;
import br.com.orcamentobd.orcamentoBD.repositories.ClienteRepository;
import br.com.orcamentobd.orcamentoBD.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping()
    public List<Cliente> listarTodososClientes(){
        return clienteRepository .findAll(Sort.by("nome").ascending());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPeloCodigoP(@PathVariable int id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.isPresent() ? ResponseEntity.ok(cliente.get()) : ResponseEntity.notFound().build();
    }
    @RequestMapping()
    public ResponseEntity<Cliente> inserir (@RequestBody Cliente cliente){
        Cliente clientesalvar = clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientesalvar);
    }
}
