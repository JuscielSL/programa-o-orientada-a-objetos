// Classe para testar os métodos de encapsulamento
// de outras classes  
public class MainEncapsulamento {
        public static void main(String[] args) {
        // a. teste conta bacaria (private + validação) 
        System.out.println("--------TESTANDO ENCAPSULAMENTO---");
        // Exercício 1. Teste conta báncaria
        System.err.println("exercício 1. Conta bancária");
        //criando um novo objeto a partir da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria("Regiano Alves");
        //verificando saldo atual
        System.out.println("Saldo atual e..R$ " + minhaConta.getSaldo());
        // Depositando um valor invalido, vai delvolver um erro
        minhaConta.depositar(-50.00);
        // tentado acessar diretamento a propriedade minhaConta.saldo
        // não sera possivel, porque ela possui visibilidade PRIVATE

        // depositando um valor no saldo da conta bancária
        minhaConta.depositar(153.50);
         System.err.println("Saldo apos o depostio e..R$ " + minhaConta.getSaldo());
    }
}