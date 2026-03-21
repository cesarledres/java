import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //condicaoComposta();
        //condicaoMultipla();
        switchCase();
    }

    public static void condicaoComposta(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        //condição simples
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        }
        else {
            System.out.println("Menor de idade.");
        }

        input.close();
    }
    public static void condicaoMultipla(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        int nota = input.nextInt();

        if (nota < 0 || nota > 100){
            System.out.println("Nota inválida");
        }
        else if (nota >= 60){
            System.out.println("Aprovado");
        }
        else if (nota >= 40){
            System.out.println("Exame");
        }
        else{
            System.out.println("Reprovado");
        }
        input.close();
    }
    public static void switchCase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        int dia = input.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}