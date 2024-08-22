package br.edu.umfg.dip.legado;

public class EmailService{
    public void enviarEmail(String remetente,
                            String destinatario,
                            String message){

        System.out.printf("De: %s\n", remetente );
        System.out.printf("Para: %s\n", destinatario);
        System.out.printf("Mensagem: %s\n", message);
    }


}
