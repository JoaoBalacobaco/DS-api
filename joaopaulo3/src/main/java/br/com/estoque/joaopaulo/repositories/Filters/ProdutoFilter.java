package br.com.estoque.joaopaulo.repositories.Filters;

public class ProdutoFilter {
    private String nomeproduto;
    private String categoria;

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}