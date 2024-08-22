package br.edu.umfg.dip.refatorado;

import br.edu.umfg.dip.refatorado.IEmailService;

public class UserServiceRefatorado{
    private final String DEFAULT_EMAIL = "minha.empresa@.com";

    private IEmailService emailService;

    public UserServiceRefatorado(IEmailService emailService){
        this.emailService = emailService;
    }

    public void registrar(String email){
        String mensagem = "Bem vindo, ao meu mundo!!!";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);
    }

}
