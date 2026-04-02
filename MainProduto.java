public class MainProduto {
    public static void main(String[] args) {

        // criando um produto
        Produto p1 = new Produto("Computador", 2500.00);

        // exibindo dados iniciais
        System.out.println("Produto: " + p1.getNomeProduto());
        System.out.println("Preço: R$ " + p1.getPrecoProduto());

        // alterando o preço (válido)
        p1.setPrecoProduto(4000.00);
        System.out.println("Novo preço: R$ " + p1.getPrecoProduto());

        // tentando alterar para um preço inválido
        p1.setPrecoProduto(0);
        System.out.println("Preço final: R$ " + p1.getPrecoProduto());
    }
}