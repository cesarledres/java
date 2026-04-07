import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        exerc1();
    }
    public static void exerc1() {
        /*
        Crie um Algoritmo que leia o valor de um produto e calcule o desconto
        de 5% e exiba esse valor. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Infome o valor do produto: ");
        double valor = sc.nextDouble();

        double valorDesconto = valor * 0.95;

        System.out.printf("O valor com 5%% de desconto desse produto é de R$ %.2f", valorDesconto);

        sc.close();
    }

    
}
