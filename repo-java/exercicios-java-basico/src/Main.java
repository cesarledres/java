import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exerc1();
        //exerc2();
        //exerc3();
        //exerc4();
        //exerc5();
        //exerc6();
        //exerc7();
        //exerc8();
    }

    public static void exerc1() {
        /*
        Crie um program em Java que solicite o nome e exiba a mensagem "Olá" logo depois o nome digitado.
         */

        //Definindo apelido para scanner
        Scanner sc = new Scanner(System.in);

        //print + input
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        //print final
        System.out.println("Olá " + nome);

        sc.close();
    }

    public static void exerc2() {
        /*
        Crie um programa que solicite dois valores numéricos. O mesmo deverá
        calcular e exibir:
        a. A soma dos dois valores
        b. A multiplicação dos dois valores
        c. A subtração dos dois valores
        d. A divisão dos dois valores
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("A soma dos dois números é " + (num1 + num2));
        System.out.println("A subtração dos dois números é " + (num1 - num2));
        System.out.println("A multiplicação dos dois números é " + (num1 * num2));
        System.out.println("A divisão dos dois números é " + (num1 / num2));

        sc.close();
    }

    public static void exerc3() {
        /*
        Crie um programa que solicite o peso e altura de uma determinada
        pessoa e calcule o seu IMC (Índice de Massa Corpórea). A fórmula: IMC = peso / altura * altura
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double alturaQuadrado = Math.pow(altura, 2);
        System.out.println(alturaQuadrado);

        double imc = peso / alturaQuadrado;

        System.out.printf("O IMC é %.2f", imc);

        sc.close();
    }

    public static void exerc4() {
        /*
        Crie um programa que receba o salário de um funcionário e calcule o
        novo salário com um aumento de 15%. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário: ");
        double salario = sc.nextDouble();

        double salarioNovo = salario * 1.15;

        System.out.printf("O sálario reajustado com 15%% é de R$ %.2f", salarioNovo);

        sc.close();
    }
    
    public static void exerc5() {
        /*
        Uma loja paga aos seus vendedores:
        a. Salário base de R$ 1.800,00
        b. Comissão fixa de R$ 150,00 por produto vendido
        c. 3% sobre o valor total das vendas
        Escreva um programa que solicite:
        • Nome do vendedor
        • Quantidade de produtos vendidos
        • Valor total das vendas
        O programa deve calcular e exibir o salário final.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe a quantidade de produtos vendidos: ");
        int qtdVendido = sc.nextInt();

        System.out.println("Informe o valor total das vendas: ");
        double valorVendas = sc.nextDouble();

        double salarioBase = 1800;
        double valorPorVendido = 150 * qtdVendido;
        double PercTotalVendas = 0.03 * valorVendas;

        double salarioTotal = salarioBase + valorPorVendido + PercTotalVendas;

        System.out.printf("O salário total de é de R$ %.2f ", salarioTotal);

        sc.close();
    }

    public static void exerc6() {
        /*
        Escreva um programa que receba dois números inteiros e troque seus
        valores utilizando uma terceira variável auxiliar. Exiba os valores antes e
        depois da troca.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a variável A:");
        int a = sc.nextInt();

        System.out.println("Digite a variável B:");
        int b = sc.nextInt();
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        int c = a;
        a = b;
        b = c;

        System.out.println("Depois da troca:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        sc.close();
    }

    public static void exerc7() {
        /*
        Escreva um programa que receba:
        • Distância percorrida (km)
        • Quantidade de combustível gasto (litros)
        Calcule e exiba o consumo médio do veículo (km/l).
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em km:");
        double qtdKm = sc.nextDouble();

        System.out.println("Digite a quantidade de combustivel gasto: ");
        double qtdLitros = sc.nextDouble();
        
        double consumoLitroPorKm = qtdKm / qtdLitros;

        System.out.printf("O consumo médio de litro por km do veículo é de %.2f", consumoLitroPorKm);
        System.out.print(" km/l");

        sc.close();
    }

    public static void exerc8() {
        /*
        Escreva um programa que receba um valor em horas e converta para:
        Minutos e Segundos
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora:");
        double hora = sc.nextDouble();

        double minutos = hora * 60;
        double segundos = hora * 3600;

        System.out.printf("Horas para minutos: %.2f", minutos);
        System.out.println();
        System.out.printf("Horas para segundos: %.2f", segundos);

        sc.close();
    }
}