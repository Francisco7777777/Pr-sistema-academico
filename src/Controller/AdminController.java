
package Controller;

import View.Adm;
import View.CadAluno;
import View.CadProf;
import View.PeriodoMatriculaView;
import View.SemestreView;

/**
 *
 * @author Francisco Mendonça
 */
public class AdminController {

    private final Adm view;

    public AdminController(Adm view) {
        this.view = view;
    }

    public void telaCadastroProfessor() {
        CadProf cProfessor = new CadProf();
        cProfessor.setVisible(true);
        this.view.dispose();
    }

    public void telaCadastroAluno() {
        CadAluno cAluno = new CadAluno();
        cAluno.setVisible(true);
        this.view.dispose();
    }

    public void telaPeriodoMatricula() {
        PeriodoMatriculaView periodoMatricula = new PeriodoMatriculaView();
        periodoMatricula.setVisible(true);
        this.view.dispose();
    }

    public void telaSemestre() {
       SemestreView semestre = new SemestreView();
       semestre.setVisible(true);
       this.view.dispose();
    }
    
}
