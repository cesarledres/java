import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //exerc1();
        //exerc2();
        //exerc3();
        //exerc4();
        //exerc5();
        //exerc6();
        //exerc7();
        //exerc8();
        //exerc9();
        //exerc10();
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
    public static void exerc5() {
        /*
        Crie um algoritmo que leia o valor de um produto e calcule o valor final
        com acréscimo de 8%. Exiba o valor do acréscimo e o valor final
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        double acrescimo = valorProduto * 0.08;
        double valorFinal = valorProduto + acrescimo;

        System.out.printf("O valor do acréscimo é de R$ %.2f", acrescimo);
        System.out.println();
        System.out.printf("O valor final do produto é de R$ %.2f", valorFinal);
        
        sc.close();
    }
    public static void exerc6() {
        /*
        Crie um algoritmo que leia: O valor em reais e a cotação do euro. Logo
        depois, exiba o valor convertido em euros.
        */
    }
    public static void exerc7() {
        /*
        Crie um algoritmo que leia: A quantidade de kWh consumidos e o valor
        do kWh. Logo depois, calcule e exiba o valor total da conta de energia.
        */

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double qtdKWh = sc.nextDouble();

        System.out.print("Digite o valor do kWh: ");
        double valorKWh = sc.nextDouble();

        double valorTotal = valorKWh * qtdKWh;

        System.out.printf("O valor total da conta é de R$ %.2f", valorTotal);

        sc.close();
    }
    public static void exerc8() {
        /*
        Cálculo de Média Escolar: P1, P2 e P3 são as provas. A P1 e P2 tem
        peso de 40% da média final e a P3 60%. Exiba as notas e a média final
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da P1: ");
        int p1 = sc.nextInt();

        System.out.print("Digite o valor da P2: ");
        int p2 = sc.nextInt();
        
        System.out.print("Digite o valor da P3: ");
        int p3 = sc.nextInt();

        double peso1 = p1 * 2;
        double peso2 = p2 * 2;
        double peso3 = p3 * 6;
        double media = (peso1 + peso2 + peso3) / 10;

        System.out.printf("A média das notas é de %.2f", media);

        sc.close();
    }
    public static void exerc9() {
        /*
        Crie um algoritmo que leia a idade de uma pessoa em anos e exiba essa
        idade em dias.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int idadeAnos = sc.nextInt();

        int idadeDias = idadeAnos * 365;

        System.out.println("A idade em dias é aproximadamente: " + idadeDias);

        sc.close();
    }
    public static void exerc10() {
        /*
        Crie um algoritmo que leia: Valor do produto e a Quantidade de parcelas.
        Considere juros de 2% ao mês e exiba o valor total a pagar
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        double qtdParcelas = sc.nextDouble();

        double valorTotal = valorProduto * Math.pow(1.02, qtdParcelas);

        System.out.printf("O valor total a pagar é de R$ %.2f", valorTotal);

        sc.close();
    }
}
