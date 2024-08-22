package br.edu.umfg.lsp;

import br.edu.umfg.lsp.legado.Aluno;
import br.edu.umfg.lsp.legado.AlunoEad;
import br.edu.umfg.lsp.refatorado.AbstractAluno;
import br.edu.umfg.lsp.refatorado.AlunoEadRefatorado;
import br.edu.umfg.lsp.refatorado.AlunoPresencialRefatorado;

public class PrincipioSubstiruicaoLiskov{
    public static void legado(){
        Aluno aluno = new Aluno("11", "Gabriel");
        aluno.setNotaFinal(10.0);

        AlunoEad alunoEad = new AlunoEad("22", "Luiz", "luiz@luiz.com", "senha");
        alunoEad.setNotaFinal(9.7);

    }

    public static void refatorado(){
        AlunoPresencialRefatorado aluno3 = new AlunoPresencialRefatorado("33",
                "Caio",
                7.5);

        AlunoEadRefatorado aluno4 = new AlunoEadRefatorado("44",
                "Zubioli",
                10.10,
                "Zub@zub.com",
                "senha");

        imprimir(aluno3);
        imprimir(aluno4);

    }

    private static void imprimir(AbstractAluno aluno){
        System.out.printf("%s | %s | %s \n",aluno.getRa(),
                aluno.getNome(),
                aluno.getNotaFinal());

    }
}