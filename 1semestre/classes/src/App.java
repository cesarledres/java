public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        //definição de atributos publicos
        v1.cor="Branco";
        v1.marca="Ford";
        v1.modelo="EcoSport";

        //exibindo dados dos atributos que pertecem aos objetos
        System.out.println(v1.cor+" "+v1.marca+" "+v1.modelo);

        //no caso do v2 os dados estão vazios
        System.out.println(v2.cor+" "+v2.marca+" "+v2.modelo);

        //exibindo o indentificador do objeto (cada objeto tem o seu)
        System.out.println(v1);
        System.out.println(v2);

        //é possivel criar varios objetos com uma classe, mas cada objeto é unico
        v2.cor="Laranja";
        v2.marca="Renault";
        v2.modelo="Kwid";

        System.out.println(v2.cor+" "+v2.marca+" "+v2.modelo);

        
        Veiculo v3 = new Veiculo();
        //é possivel fazer compartilhamento de caracteristicas
        v3 = v1;
        System.out.println(v3.cor+" "+v3.marca+" "+v3.modelo);
        
        //caso o objeto original seja alterado, a copia (v3) tambem é modificado
        v1.modelo="Ka";
        System.out.println(v3.cor+" "+v3.marca+" "+v3.modelo);

        //o por que nao usa atributos somente na main
        String marca="VW";
        String modelo="Gol";
        String cor="Laranja";

        //se colocar novamente na variavel/atributo será substituido
        /*
        String marca="VW";
        String modelo="Gol";
        String cor="Laranja";

        da erro
        */

        // preciso alterar o nome do atributo
            //hard-code = codigo fixo/engessado, má pratica
        String marca1="VW";
        String modelo1="Gol";
        String cor1="Laranja";

        //chamando o metodo dentro do sout e ele esta apenas exibindo
        System.out.println(v1.validaQuantidadePortas(1));
        System.out.println(v1.validaQuantidadePortas(4));

        //criando uma variavel para receber o retorno metodo
        boolean retorno = v1.validaQuantidadePortas(5);
        System.out.println(retorno);

        //chamando metodo para mostrar atributos publicos de veiculo
        v1.imprimir();
    }
}
