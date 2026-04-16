// Classe para testar os metodos de encapsulamento de outras classes

public class NovoMainEncapsulamento {
    public static void main (String[] args){
        // a. Teste conta bancaria (Private + Validação)
        System.out.println("-----TESTANDO ENCAPSULAMENTO-----");
        // Exercicio 1. Teste Conta Bancária
        System.out.println("Exercicio 1: Conta Bancaria");
        // Criando um novo objeto a partir da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria("Davi Morais");
        // verificando o saldo atual
        System.out.println("O saldo e ... R$ " 
                        + minhaConta.getSaldo());
        // Depositando um valor invalido, vai devolver um erro
        minhaConta.depositar (-50.00);
        // tentando acessar diretamente a propriedade minhaConta.saldo
        // não será possivel, porque ela possui visibilidade PRIVATE
        // Depositando um valor no saldo da conta bancaria
        minhaConta.depositar(153.50);
        System.err.println("Saldo apos o deposito e.. R$" + minhaConta.getSaldo());

        // Exercicio 2. Testando a classe produto
        System.out.println("\nExercicios 2 : Teste Produto");
        // Criando um novo objeto a partir da classe Produto
        Produto meuProduto = new Produto("Notebook", 2500.00);
        // Exibindo informações do produto
        System.out.println("Produto: " + meuProduto.getNomeProduto());
        System.out.println("Preco: R$" + meuProduto.getPrecoProduto());
        // Tentando setar um preço inválido
        System.out.println("\nTentando setar preco negativo:");
                    meuProduto.setPrecoProduto(-100.00);
        // Setando um preço válido
        System.out.println("Atualizando preco para R$3000.00:");
        meuProduto.setPrecoProduto(3000.00);
        System.out.println("Novo preco: R$" + meuProduto.getPrecoProduto());

        // Exercicio 3.  Teste funcionario e Gerente (protected)
        System.out.println("Exercicio 3: Hierarquia e Protected");
        // criando um novo objeto para a classe e suas filhas
        Gerente gerenteVendas = 
                new Gerente("Davi", 5000.20);
        System.out.println("O Funcionario gerente: "
                           + gerenteVendas.nomeFuncionario
                         + "e igual a ...R$ " + gerenteVendas.getSalario());
        // testando o método para dar um bônus de R$ 500.00
        System.out.println("O salario do gerente: "
                        + gerenteVendas.nomeFuncionario
                        + "acrescentando de bonus e igual a ..... R$"
                        + gerenteVendas.getSalario());
        
        
        
}
}
