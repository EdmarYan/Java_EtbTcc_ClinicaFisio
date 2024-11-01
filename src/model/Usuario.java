package model;

public abstract class Usuario {
    protected Long id;
    protected String nome;
    protected String email;
    protected String senha;
    protected String telefone;

    public boolean autenticar() {
        // Implementar lógica de autenticação
        return true; // Placeholder
    }

    public void recuperarSenha() {
        // Implementar lógica de recuperação de senha
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}