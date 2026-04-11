public class App {
    public static void main(String[] args) throws Exception {
        /*
        Crie uma classe Pet com atributos nome e fome (int). Implemente um
        método comer() que diminui o nível de fome e um método status() que
        exibe as informações do animal
        */

        Pet dog = new Pet();

        dog.nome = "negão";
        dog.fome = 100;

        dog.status();

        dog.comer();

        dog.status();
    }
}
