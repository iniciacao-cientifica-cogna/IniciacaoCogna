package model;


//classe para configurar usuário
public class Usuario {
    private String nome, email, senha;

    //construtor para configurar usuários
    public Usuario() {

    }
    //métodos get e set do nome, email e senha
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
}
