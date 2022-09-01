
package Controller;

import View.Adm;
import View.CadProf;

/**
 *
 * @author Francisco Mendonça
 */
public class CadastroProfessorController {

    private final CadProf view;

    public CadastroProfessorController(CadProf view) {
        this.view = view;
    }

    
    public void limparCamposController() {
        view.getNumRegistro().setText("");
        view.getNome().setText("");
        view.getEmail().setText("");
        view.getSenha().setText("");
        view.getSim().setSelected(false);
        view.getNao().setSelected(false);
        view.getPesquisar().setText("");
    }
    
    public void voltarController() {
       Adm adiministrador = new Adm();
       adiministrador.setVisible(true);
       this.view.dispose();
    }
    
}
