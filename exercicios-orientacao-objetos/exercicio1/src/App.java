public class App {
    public static void main(String[] args) throws Exception {
        /*
        Crie uma classe chamada Aluno que contenha os atributos nome, idade
        e cidade. No método main de uma classe App, instancie um objeto desta
        classe e atribua valores aos seus atributos.
        */

        Aluno aluno1 = new Aluno();

        aluno1.nome = "César";
        aluno1.idade = 17;
        aluno1.cidade = "São Paulo";

        System.out.println(aluno1.nome + ", " + aluno1.idade + ", " + aluno1.cidade);
    }   
}
