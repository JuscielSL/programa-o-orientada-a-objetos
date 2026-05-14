package exercicio1;

public class TesteMainPagamento {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        pagamento.processar(500.00); 
    }
}
