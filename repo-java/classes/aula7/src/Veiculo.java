public class Veiculo {

    //definição de atributos
    public String cor;
    public String modelo;
    public String marca;
    public String placa;

    //private só fica disponivel para essa classe
    private int quantidadePortas;
    private int velocidade;
    private double potenciaMotor;


    public boolean validaQuantidadePortas(int qtd) {
        if (qtd < 2 || qtd > 4) {
            return false;
        } else {
            quantidadePortas = qtd;
            return true;
        }
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade Portas: " + quantidadePortas);
    }
}