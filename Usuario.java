// Exercico 4: Sistema de login (segurança) esconde a lógica interna (abstração via encapsulmento)



public class Usuario {
    private String login;
    private String senha;
    // crinando o método construtor da classe
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    // o mundo externo não precisa saber qual é a senha
    // apenas se ela esta correta
    public boolean autenticar(String senhaTentativa){
        return this.senha.equals(senhaTentativa);
    }
    // metodo para recuperar o login
    public String getLogin(){
        return this.login;
    }
}
