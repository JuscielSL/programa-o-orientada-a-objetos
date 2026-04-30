// Polimorfismo com Herança: classe especializada gato do tipo Animal
public class Gato extends Animal{
    // sobrescrevendo (@override) o metodo emitirSom da classe genérica Animal
    @Override
    protected void emitirSom() {
        System.out.println("Miau! miau");
    }
}