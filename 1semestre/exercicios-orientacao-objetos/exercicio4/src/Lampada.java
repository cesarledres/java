public class Lampada {
    public boolean ligada;

    public boolean ligar() {
        return ligada = true;
    }

    public boolean desligar() {
        return ligada = false;
    }

    public void mostrarEstado() {
        System.out.println(ligada);
    }
}
