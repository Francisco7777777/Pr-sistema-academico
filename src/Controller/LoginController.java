
package Controller;

import View.Login;

/**
 *
 * @author Francisco Mendonça
 */
public class LoginController {
    
    // Assim a viw login será acessivel de qualquer ponto dessa classe.
    private final Login view;

    // Para que esse controller seja criado ele pressisa receber a tela.
    public LoginController(Login view) {
        this.view = view;
    }
}
