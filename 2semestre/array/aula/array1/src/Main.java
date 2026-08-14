public class Main {
    static void main(String[] args) {
        //inicialização direta: recebe os elementos no inicio
        int [] numeros = {10, 20, 30, 40, 50};

        //tamanho definido: nao recebe os elementos no inicio
        String [] nomes = new String[3];

        //Acesso direto:

        nomes[0]= "cesar";

        numeros[0]=100;

        //acesso pelo elemento do vetor
        System.out.println(numeros[0]);;
        System.out.println(nomes[0]);

        //acesso sequencial:
            //ele funciona por causa de um laço de repetição
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " : " + numeros[i]);
        }

        System.out.println("Tamanho do vetor: " + numeros.length);

        //MATRIZ

        //matriz 3x3 = 9 elementos
        int[][] matriz = {
                {21, 57, 18}, //linha 0
                {13, 8, 26}, //linha 1
                {17, 7, 8},  //linha 2
        };

        //matriz 2x4 = 8 elementos
        String[][] alunos = new String [2][4]; //[linha][coluna]

        // acessando elementos da matriz
        System.out.println(matriz[2][1]);
        System.out.println(alunos[0][0]);

        alunos[0][0] = "cesar lenda";

        //recupera quantidade de linhas
        System.out.println(alunos.length);

        //recupera a quantidade de colunas
        System.out.println(alunos[0].length);

        //acesso sequencial
        //da linha
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(""+i+":"+"");
                System.out.println(matriz[i][j]);
            }
        }
    }
}