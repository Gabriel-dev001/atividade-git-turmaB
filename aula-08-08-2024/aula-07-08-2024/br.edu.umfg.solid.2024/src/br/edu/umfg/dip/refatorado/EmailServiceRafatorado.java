package br.edu.umfg.dip.refatorado;

public class EmailServiceRafatorado implements  IEmailService{
    @Override
    public void enviarEmail(String remetente, String destinatario, String mensagem) {
        System.out.printf("De: %s\n", remetente );
        System.out.printf("Para: %s\n", destinatario);
        System.out.printf("Mensagem: %s\n", mensagem);
    }
}
