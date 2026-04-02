// Exercício 2. Praticando encapsulamento: Controle de produto. Restrição de acesso a atributos sensíveis e métodos auxiliares.
//isso garante que a regra de não 




public class Produto{
    private String nomeProduto;
    private double precoProduto;
    //implemento o método cronstrutor recebendo
    //o nome e o prço do produto
    public Produto(String nome, double preco) {
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }

    public void setPrecoProduto(double Preco) {
        if (Preco > 0) {
            this.precoProduto = Preco;
        } else {
            System.out.println("Erro preco não pode ser negativo ou zerado!");
        }
    }

    // método para recuperar o nome do produto
    public String getNomeProduto() {
        return this.nomeProduto;    
    }
    // método para recuperar o preço do produto
    public double getPrecoProduto() {   
        return this.precoProduto;
    }
}