package br.edu.umfg.isp.refatorado;

public class ContaPoupancaRefatorada extends AbstractConta implements IContaRefactor{
    public ContaPoupancaRefatorada(String nome, String documento) {
        super(nome, documento);
    }
}