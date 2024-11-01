package model;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidade;

    public void adicionarEstoque(Integer quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(Integer quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque.");
        }
    }

    public boolean verificarDisponibilidade() {
        return quantidade > 0;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}