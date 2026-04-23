/**
 *Exercicio 5: Validção de dados (setters inteligentes)
 *foco: Garantir integridade de Strings e formatos.
 *Este exercico mostra que o encapsulamento transfoma
 *atributoos em "campos inteligentes".
 *O objeto Perfil se recusa a aceitar dados que não façam sentido
 */

public class Perfil {
    private String email = "";

    public void setEmail(String emailInformado) {
        if (emailInformado.contains("@") && emailInformado.contains(".")) {
            this.email = emailInformado;
            System.out.println("E-mail atualizado!");
        } else {
            System.out.println("E-mail inválido!");
        }
    }

    public String getEmail() {
        return this.email;
    }
}
