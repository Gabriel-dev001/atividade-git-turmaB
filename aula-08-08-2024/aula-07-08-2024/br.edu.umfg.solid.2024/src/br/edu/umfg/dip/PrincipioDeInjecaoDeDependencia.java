package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UserServive;
import br.edu.umfg.dip.refatorado.EmailServiceRafatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;

public class PrincipioDeInjecaoDeDependencia{
    public static void legado(){
        UserServive userServive = new UserServive();
        userServive.registrarUsuario("gabrielzinho123@.com");
    }

    public static void refatorado(){
        IEmailService emailService = new EmailServiceRafatorado();
        UserServiceRefatorado usuarioService = new UserServiceRefatorado(emailService);

        usuarioService.registrar("gabrielzinhorafatora.com@gmail.com");

        

    }
}
