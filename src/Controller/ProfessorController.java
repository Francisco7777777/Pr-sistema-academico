
package Controller;

import View.DisciplinasView;
import View.ProfessorView;
import javax.swing.text.View;

/**
 *
 * @author Francisco Mendonça
 */
public class ProfessorController {

    private final ProfessorView view;

    public ProfessorController(ProfessorView view) {
        this.view = view;
    }

    public void telaMatricularDisciplinas() {
        DisciplinasView disciplinas = new DisciplinasView();
        disciplinas.setVisible(true);
        view.dispose();
    }
    
}
