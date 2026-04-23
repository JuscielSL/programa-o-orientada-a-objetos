/**
 *Exercicio 5: Validção de dados (setters inteligentes)
 *foco: Garantir integridade de Strings e formatos.
 *Este exercico mostra que o encapsulamento transfoma
 *atributoos em "campos inteligentes".
 *O objeto Perfil se recusa a aceitar dados que não façam sentido
 */

public class Perfil {
    //Declarando uma propriedade encapsulada
    private String email = ""; 
    //criando um metodo para alterar o email
    public void setEmail(String emailInformado){
        //Encapsula a logica de validação do email
        if (email.contains("@")&& email.contains(".")){
            this.email = emailInformado;
            System.out.println("E-mail atualizado!");
    } else {
            System.out.println("E-mail inválido! O email ");
        }
    }
}
