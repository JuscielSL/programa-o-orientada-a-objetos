public class ContaBancaria {
    // Atributos privados: alguém fora desta classe 
    // pode alterá-los diretamente
    private String titularConta;
    private double saldoConta;


    public ContaBancaria(String nomeTitularConta){
        this.titularConta = nomeTitularConta;
        this.saldoConta = 0.0;
    }

    // criando um método para recuperar o saldo
public double getSaldo() {
    return this.saldoConta;
    
}
    // este metodo devolve o nome do titular
    // pseudovariável (método + variável) getTitutalar()

    public String getTitular() {
        return this.titularConta;
    }
    //agora um método para adicionar valores ao
    //saldo da conta
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            //validando o valor do depósito
            this.saldoConta += valorDeposito;
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor inválido para deposito.");
        }
    }
}
