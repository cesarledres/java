import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //criando uma lista ordenada
        List<String> nomes = new ArrayList<>();

        //adicionando elementos na lista
        nomes.add("cesar");
        nomes.add("eu dnv");
        nomes.add("anastacio");

        //recuperando valores
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));

        //alterar um elemento na lista

        nomes.set(0, "cesinha");

        //remover pelo indice
        nomes.remove(1);

        //remover pelo conteudo
        nomes.remove("anastacio");

        System.out.println(nomes);
    }
}