package exercicio1;
// Especialização para cartão de credito
public class PagamentoCartao extends Pagamento {
    @Override // anotação de sobrescrita
    protected double calculaTaxa(double valor) {
        return valor * 0.05; // 5% de taxa da maquininha
    }
}