package br.edu.umfg.dip.legado;

public class UserServive{
    private final String DEFAULT_EMAIL = "minha.empresa@.com";

    private EmailService emailService;

    public UserServive(){
        this.emailService = new EmailService();
    }

    public void registrarUsuario(String email){
        String mensagem = "Bem vindo, ao meu mundo!";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);


    }
}
