public class App {
    public static void main(String[] args) throws Exception {
        /*
        Implemente a classe Veiculo conforme visto em aula, adicionando os
        atributos modelo, marca e velocidade. Crie dois objetos (ex: ferrari e
        fusca) e demonstre que eles possuem estados independentes na
        memória.
        */

        Veiculo fusca = new Veiculo();
        Veiculo ferrari = new Veiculo();

        fusca.modelo = "1990";
        fusca.marca = "fulana";
        fusca.velocidade = 100;

        ferrari.modelo = "2020";
        ferrari.marca = "ferrari";
        ferrari.velocidade = 300;

        System.out.println(fusca.modelo + ", " + fusca.marca + ", " + fusca.velocidade);
        System.out.println(ferrari.modelo + ", " + ferrari.marca + ", " + ferrari.velocidade);
    }
}
