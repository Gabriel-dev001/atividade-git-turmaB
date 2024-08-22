package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.ContaCorrenteRefatorada;
import br.edu.umfg.isp.refatorado.ContaInvestimento;
import br.edu.umfg.isp.refatorado.ContaPoupancaRefatorada;

public class PrincipioSegregracaoInterfaces{
    public static void legado(){
        ContaCorrente contaCorrente = new ContaCorrente("001", "Teste01");
        contaCorrente.creditar(1000.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca("022", "Teste02");
        contaPoupanca.creditar(5000.0);
        contaPoupanca.debitar(1.0);

        System.out.println("Conta Corrente: "+contaCorrente.getSaldo());
        System.out.println("Conta Poupanca: "+contaPoupanca.getSaldo());
    }

    public static void refatorado(){
        ContaCorrenteRefatorada contaCorrenteRefatorada = new ContaCorrenteRefatorada("000111",
                "5555555");
        contaCorrenteRefatorada.creditar(500.0);

        ContaPoupancaRefatorada contaPoupancaRefatorada = new ContaPoupancaRefatorada("Teste00111",
                "54554545");
        contaPoupancaRefatorada.creditar(300.5);
        contaPoupancaRefatorada.debitar(100.55);

        ContaInvestimento contaInvestimento = new ContaInvestimento("investimento",
                "01010101");

        System.out.println("Conta Corrente: "+contaCorrenteRefatorada.getSaldo());
        System.out.println("Conta Poupanca: "+contaPoupancaRefatorada.getSaldo());
        System.out.println("Conta Investimento: "+ contaInvestimento.getSaldo());

    }
}
