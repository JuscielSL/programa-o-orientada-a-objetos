public class TestePolimorfismo {
    public static void main(String[] args) {
        // um array de Animal pode guardar qualquer
        // subclasse de Animal
        Animal[] pets = { new Cachorro(), new Gato() };
        // percorrendo os elementos (objetos) do array
        for (Animal p: pets) {
            // O java decide em tempo de execuçãp qual som tocar
            p.emitirSom();
            p.respirar();
        }
    }
}