
package Controller;

import DAO.FabricaDAO;
import DAO.PeriodoMatriculaDAO;
import Model.PeriodoMatricula;
import View.Adm;
import View.PeriodoMatriculaView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Mendonça
 */
public class PeriodoMatriculaController {
    
    final private PeriodoMatriculaDAO periodoMatriculaDao = FabricaDAO.criarPeriodoMatriculaDao();
    final private PeriodoMatriculaView view;
    
    private List<PeriodoMatricula> periodoMatricula = new ArrayList<>();

    
    public PeriodoMatriculaController(PeriodoMatriculaView view) {
        this.view = view;
    }

    public void cadastrarController() {
        PeriodoMatricula perMatricula = new PeriodoMatricula();
        perMatricula.setProfessorStatus(1);
        perMatricula.setAlunoStatus(0);
        periodoMatriculaDao.insert(perMatricula);
    }
    
    public void alterarController() {
        int linha = this.view.getTabelaPerMat().getSelectedRow();
        if (linha < 0) {
            this.view.exibirMenssagem("Você deve selecione uma linha para auterar os dados.");
        } else {
            PeriodoMatricula perMatricula = new PeriodoMatricula();
            
            int id = (int) this.view.getTabelaPerMat().getValueAt(linha, 0);
            
            perMatricula.setId(id);
            perMatricula.setProfessorStatus(this.view.getProfessorStatus().getSelectedIndex());
            perMatricula.setAlunoStatus(this.view.getAlunoStatus().getSelectedIndex());
            
            periodoMatriculaDao.update(perMatricula);
        }
    }
    
    public void getListarPeriodoMatriculaController() {
        periodoMatricula = periodoMatriculaDao.listarPeriodoMatricula();
        
        // É preciso um modelo para a tabela (default). 
        DefaultTableModel modelo = (DefaultTableModel) this.view.getTabelaPerMat().getModel();
        modelo.setNumRows(0);
        
        for (int i = 0; i < periodoMatricula.size(); i++) {
            modelo.addRow(new Object[]{
                periodoMatricula.get(i).getId(),
                periodoMatricula.get(i).getProfessorStatus(),
                periodoMatricula.get(i).getAlunoStatus(),
                periodoMatricula.get(i).getSemetre()
            });
        }
    }

    public void voltarController() {
        Adm adiministrador = new Adm();
        adiministrador.setVisible(true);
        this.view.dispose();
    }

}
