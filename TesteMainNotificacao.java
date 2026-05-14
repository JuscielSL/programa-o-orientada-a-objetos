package exercicio2;

public class TesteMainNotificacao  {
    public static void main(String[] args) {
    Notificacao avisoEmail = new EmailNotificacao();
    Notificacao avisoSms = new SmsNotificacao();
    avisoEmail.enviar("Olá por email!");
    avisoSms.enviar("Olá por SMS!");
    }
}
