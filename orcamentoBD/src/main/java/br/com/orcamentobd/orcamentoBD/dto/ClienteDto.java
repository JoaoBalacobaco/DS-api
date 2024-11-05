package br.com.orcamentobd.orcamentoBD.dto;

public class ClienteDto {
    private Integer id;
    private String nome;
    private String endereco;
    private String numero;
    private String baurro;

    public ClienteDto(Integer id, String nome, String endereco, String numero, String baurro) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.baurro = baurro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBaurro() {
        return baurro;
    }

    public void setBaurro(String baurro) {
        this.baurro = baurro;
    }
}
