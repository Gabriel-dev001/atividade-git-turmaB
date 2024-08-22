import br.edu.umfg.dip.PrincipioDeInjecaoDeDependencia;
import br.edu.umfg.isp.PrincipioSegregracaoInterfaces;
import br.edu.umfg.lsp.PrincipioSubstiruicaoLiskov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        System.out.println("EXECUTA SRP:");
//        PrincipioDeResponsabilidadeUnica.executarLegado();
//        PrincipioDeResponsabilidadeUnica.executarRefatorado();
//
//        System.out.println("\n\n");
//        System.out.println("EXECUTA OCP:");
//
//        PrincipioAbertoFechado.executarLegado();
//        PrincipioAbertoFechado.executarRefatorado();

//        PrincipioSubstiruicaoLiskov.refatorado();

        PrincipioDeInjecaoDeDependencia.legado();
        PrincipioDeInjecaoDeDependencia.refatorado();
    }
}