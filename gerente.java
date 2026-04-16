// Classe filha Gerente (especializado)
// Herança da classe Funcionario
// a propriedade extends faz relacionamento
// de herança entre Gerente e Funcionario

public class gerente extends Funcionário { 
    // método construtor que irá acessar a classe pai
    public gerente (String nome, Double salario){
        // enviando os valores para o metodo construtor 
        // da classe pai Funcionario
        super(nome, salario);
    }
    // criaremos um método público para incrementar
    // o salario protegido (protected) da classe pai
    public void bonusSalarial(){
        this.salarioFuncionario = 500.00;
    }
    
}
