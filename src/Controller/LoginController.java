
package Controller;

import Model.Professor;
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

    public void altenticarUsuario() {
        
        // A variável usuari resebe da view o texto que estar no campo usuario.
        String usuario = view.getUsuario().getText();
        String senha = String.valueOf(view.getSenha().getPassword());

        Professor usuarioModelo = new Professor();
    }
    
    public void limparTela() {
        view.getUsuario().setText("");
        view.getSenha().setText("");
    }
}
