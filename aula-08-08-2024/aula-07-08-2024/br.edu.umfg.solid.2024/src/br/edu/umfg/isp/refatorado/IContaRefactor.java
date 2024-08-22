package br.edu.umfg.isp.refatorado;

public interface IContaRefactor{
    void creditar(Double valor);
    void debitar(Double valor);
    Double getSaldo();
}
