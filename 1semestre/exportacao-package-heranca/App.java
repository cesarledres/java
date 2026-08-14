import br.com.sigFolha.model.Funcionario;
import br.com.sigFolha.model.Horista;
import br.com.sigFolha.model.Mensalista;

public class App {
    static void main(String[] args) {

        //Instância da Classe Genérica

        Funcionario f = new Funcionario("cesar");


        //Instância de classes filhas:
        Mensalista m = new Mensalista("João", "Pleno");
        Horista h = new Horista("Cesar", 160, 30.00);

        h.calcularSalario();
        m.calcularSalario();

        System.out.println(h.getSalario());
        System.out.println(m.getSalario());

        //polimorfismo
            //muda conforme é chamado
        f = m;
        System.out.println(f.getNome());

        f = h;
        System.out.println(f.getNome());
    }
}
