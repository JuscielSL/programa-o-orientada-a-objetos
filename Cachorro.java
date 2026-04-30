// Herança: criando um classe especializada
// que estende (extends) a classe genérica Animal
public class Cachorro extends Animal{
    @Override
    protected void emitirSom() {
        System.out.println("Au au! au");
    }
}