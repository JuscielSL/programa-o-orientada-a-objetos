package exercicio1;
/**public class 
 * Exerciocio 1 - Classe Abstrata como template
 * (Template Method)
 *processamento de pagamentos.
 todo pagamento segue o mesmo tipo de fluxo ( validar ->
 calcular taxa -> confimar).
 *utlize classe abstrata para definir o algoritmo comum
 *e polimorfismo por sobrescrita para especializar o calculo da taxa.
  * */
public abstract class Pagamento {
    // Metodo template: define a sequencia fixa de passos 
 public final void processar(double valor){
    validarPagamento(valor); // validação comum
    //Passo variável (polimorfico)
    Double taxa =calculaTaxa(valor);
    confimarPagamento(valor + taxa); // finalização comum
 } 
 // metodo protegido visivel pela classe e subclasses
 protected void validarPagamento(double valor){
    if(valor <= 0){
        throw new IllegalArgumentException("Valor invalido!");
    }
 }
 // metodo abstrato - sera sobrescrito pela sublasse
 protected abstract double calculaTaxa(double valor);


 protected void confimarPagamento(double Total){
    System.out.println("Pagamento confirmado.: " + Total);
 }
}
