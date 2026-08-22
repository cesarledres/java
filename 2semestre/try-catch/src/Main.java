import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        exemplo5();
    }

    public static void exemplo1() {
        /*
        int res = 10/0;
        System.out.println(res);
        System.out.println("Fim da execução");
        */
        try {
            int res = 10 / 0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Erro de lógica: " + e.getMessage());
        }
        System.out.println("Fim da execução");
    }

    public static void exemplo2(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Sua idade é: " + idade);
        }catch (InputMismatchException e){
            System.out.println("Erro: digite a idade em números");
        }
    }

    public static void exemplo3(){
        int [] numeros = {10, 20, 30};
        try{
            System.out.println(numeros[4]);
            System.out.println("O tamanho do vetor é: " + numeros.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A posição informada não existe");
        }
    }

    public static void exemplo4(){
        String nome = null;
        try {
            System.out.println(nome.toUpperCase());
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void exemplo5(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite o seu peso: ");
            double peso = sc.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = sc.nextDouble();

            double imc = peso / (altura * altura);
            System.out.println("O seu imc é: " + imc);
        }catch (InputMismatchException e){
            System.out.println("Digite apenas números");
        }catch (ArithmeticException e){
            System.out.println("Não é possivel dividir por zero");
        }
    }
}