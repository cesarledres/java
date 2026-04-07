import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //exerc1();
        //exerc2();
        //exerc3();
        exerc4();
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
    public static void exerc2() {
        /*
        Crie um Algoritmo que leia o valor em real e a cotação do dólar. Logo
        depois, escreva o valor correspondente em dólares. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Real (R$): ");
        double valorReal = sc.nextDouble();
        
        System.out.print("Digite a cotação do dolar: ");
        double cotacao = sc.nextDouble();
        
        Double valorDolar = valorReal * cotacao;
        System.out.printf("O valor em dolar é de $ %.2f", valorDolar);

        sc.close();
    }
    public static void exerc3() {
        /*
        Crie um Algoritmo que leia o preço do combustível e o valor a ser
        abastecido. Logo depois, exiba a quantidade de litros.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do combustível (R$/L): ");
        double precoCombustivel = sc.nextDouble();

        System.out.print("Digite o valor abastecido: ");
        double valorAbastecido = sc.nextDouble();

        double qtdLitros = valorAbastecido / precoCombustivel;

        System.out.printf("A quantidade de litros abastecida é de %.2f", qtdLitros);
        System.out.print(" L");
    }
    public static void exerc4() {
        /*
        Uma empresa contrata um pedreiro com a diária de R$150,00. Crie um
        Algoritmo que leia a quantidade de dias trabalhados e logo depois exiba
        o valor a ser pago com o desconto de 7% do INSS e 15% do IR
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias trabalhados: ");
        int diasTrabalhados = sc.nextInt();

        double salarioBruto = diasTrabalhados * 150;
        double descontoINSS = salarioBruto * 0.07;
        double descontoIR = salarioBruto * 0.15;
        double salarioLiq = salarioBruto - descontoINSS - descontoIR;

        System.out.printf("O salário bruto é de R$ %.2f", salarioBruto);
        System.out.println();
        System.out.printf("O desconto do INSS é de R$ %.2f", descontoINSS);
        System.out.println();
        System.out.printf("O desconto do IR é de R$ %.2f", descontoIR);
        System.out.println();
        System.out.printf("Sendo o salário líquido: R$ %.2f", salarioLiq);

        sc.close();
    }
}
