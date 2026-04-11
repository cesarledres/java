public class Pet {
    public String nome;
    public int fome;

    public int comer(){
        return fome -= 50;
    }

    public void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + fome);
    }
}
