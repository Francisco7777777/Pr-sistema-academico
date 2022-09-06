
package Controller;

import DAO.FabricaDAO;
import DAO.SemestreDAO;
import View.Adm;
import View.SemestreView;
import Model.Semestre;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Mendonça
 */
public class SemestreController {

    private final SemestreView view;
    private final SemestreDAO semestreDao = FabricaDAO.criarSemestreDao();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private List<Semestre> semestre = new ArrayList<>();
    
    public SemestreController(SemestreView view) {
        this.view = view;
    }

    public void cadastrarSeController() {

        String sdInicial = view.getDataInicial().getText();
        String sdFinal = view.getDataFinal().getText();
        Date data_ini;
        Date data_fnl;
        Semestre semestre = new Semestre();
        
        try {
            data_ini = (sdf.parse(sdInicial));
            data_fnl = (sdf.parse(sdFinal));
            
            semestre.setData_inicial(data_ini);
            semestre.setData_final(data_fnl);
            
            Integer status = view.getStatus().getSelectedIndex();
            semestre.setStatus(status);
            
        } catch (ParseException ex) {
            Logger.getLogger(SemestreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        semestreDao.insert(semestre);
    }
    
    public void alterarController() {
        String sdInicial = view.getDataInicial().getText();
        String sdFinal = view.getDataFinal().getText();
        Date data_ini;
        Date data_fnl;
        Semestre semestre = new Semestre();
        
        try {
            data_ini = (sdf.parse(sdInicial));
            data_fnl = (sdf.parse(sdFinal));
            
            semestre.setId(Integer.parseInt(view.getId().getText()));
            semestre.setData_inicial(data_ini);
            semestre.setData_final(data_fnl);
            Integer status = view.getStatus().getSelectedIndex();
            
            semestre.setStatus(status);
        } catch (ParseException ex) {
            Logger.getLogger(SemestreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        semestreDao.update(semestre);
    }
    
    public void listarController() {
        semestre = semestreDao.listarSemestre();
        DefaultTableModel modelo = (DefaultTableModel) this.view.getTabelaSemestre().getModel();
        modelo.setNumRows(0);
        
        for (int i = 0; i < semestre.size(); i++) {
            modelo.addRow(new Object[]{
                semestre.get(i).getId(),
                semestre.get(i).getData_inicial(),
                semestre.get(i).getData_final(),
                semestre.get(i).getStatus()
            });
        }
    }
    
    public void capiturarRegistroController() {
         
        int linha = this.view.getTabelaSemestre().getSelectedRow();
        Semestre semestre01 = new Semestre();                   
   
        int id = (int) this.view.getTabelaSemestre().getValueAt(linha, 0);
        semestre01 = semestreDao.selecionarPorId(id);

        this.view.getId().setText(String.valueOf(semestre01.getId()));
        this.view.getDataInicial().setText(sdf.format(semestre01.getData_inicial()));
        this.view.getDataFinal().setText(sdf.format(semestre01.getData_final()));
        this.view.getStatus().setSelectedIndex(semestre01.getStatus());
    }
    
    public void voltarController() {
       Adm adiministrador = new Adm();
       adiministrador.setVisible(true);
       this.view.dispose();
    }

    public void limparController() {
        this.view.getId().setText("");
        this.view.getDataInicial().setText("");
        this.view.getDataFinal().setText("");
    }
    
}
