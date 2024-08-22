package br.edu.umfg.dip.refatorado;

public interface IEmailService{
    void enviarEmail(String remetente,
                     String destinatario,
                     String mensagem);
}
