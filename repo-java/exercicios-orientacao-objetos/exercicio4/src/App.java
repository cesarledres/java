public class App {
    public static void main(String[] args) throws Exception {
        /*
        Crie uma classe Lampada com um atributo booleano ligada. Implemente
        os métodos ligar() e desligar() que alteram esse estado, e um método
        mostrarEstado() que imprime se a lâmpada está acesa ou apagada.
        */

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
