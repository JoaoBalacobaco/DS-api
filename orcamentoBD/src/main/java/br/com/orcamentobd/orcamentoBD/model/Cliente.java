package br.com.orcamentobd.orcamentoBD.model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
    @Entity
    @Table(name="cliente")
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @OneToMany(mappedBy= "cliente")
        private List<Lancamento> lancamentoLista = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cliente cliente = (Cliente) o;
            return id == cliente.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String nome;
        private String endereco;
        private String numero;
        private String bairro;

        public Municipio getMunicipio() {
            return municipio;
        }

        public void setMunicipio(Municipio municipio) {
            this.municipio = municipio;
        }

        @ManyToOne
        @JoinColumn(name = "id_municipio")
       private Municipio municipio;

        //GETTERS AND SETTERS


        public List<Lancamento> getLancamentoLista() {
            return lancamentoLista;
        }

        public void setLancamentoLista(List<Lancamento> lancamentoLista) {
            this.lancamentoLista = lancamentoLista;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        //EQUALS AND HASH CODE

    }
