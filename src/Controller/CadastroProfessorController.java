
package Controller;

import DAO.FabricaDAO;
import DAO.ProfessorDAO;
import Model.Professor;
import View.Adm;
import View.CadProf;

/**
 *
 * @author Francisco Mendonça
 */
public class CadastroProfessorController {

    private final CadProf view;
    final private ProfessorDAO professorDao = FabricaDAO.criarProfessorDao();

    public CadastroProfessorController(CadProf view) {
        this.view = view;
    }

    
    public void cadastrarController() {
       try {
            Integer numRegistro = Integer.parseInt(view.getNumRegistro().getText());
            String nome = this.view.getNome().getText();
            String emal = this.view.getEmail().getText();
            String senha = this.view.getSenha().getText();
            int adiministrador = 0;
            if (this.view.getSim().isSelected()) {
                adiministrador = 1;
            }

            Professor professor = new Professor(numRegistro, nome, emal, senha, adiministrador);
            
            if (alunoJaExiste(numRegistro)) {
                if (professorDao.insert(professor)) {
                    this.view.exibirMenssagem("Professor cadastrado com sucesso!");
                    limparCamposController();
                } else {
                    this.view.exibirMenssagem("Erro ao cadastrado professor!");
                }
            } else {
                this.view.exibirMenssagem("Já a um aluno cadastrado com essa matrícula: " + numRegistro);
            }
        } catch (NumberFormatException e){
            this.view.exibirMenssagem("Número de registro digitada incorretamente. Só é "
                    + "permitido matricula com caracteres numéricos inteiros!");
        } 
    }
    
    private boolean alunoJaExiste(Integer matricula) {
        Professor aluno01 = new Professor();
        aluno01 = professorDao.selectPorNumR(matricula);
        
        if (aluno01.getNumRegistro() == null) {
            return true;
        }
        return false;
    }
    public void pesquisarController() {
        try {
            Integer pesquisar = Integer.parseInt(this.view.getPesquisar().getText());
            Professor professor = new Professor();
            professor = professorDao.selectPorNumR(pesquisar);
            limparCamposController();
            
            if (professor.getNumRegistro() == null) {
                this.view.exibirMenssagem("Frofessor com a matrícula: " + pesquisar + " não encontrado!");
            } else {
                this.view.getNumRegistro().setEditable(false);
                this.view.getNumRegistro().setText(String.valueOf(professor.getNumRegistro()));
                this.view.getNome().setText(professor.getNome());
                this.view.getEmail().setText(professor.getEmail());
                this.view.getSenha().setText(professor.getSenha());
                
                if (professor.getAdiministrador() == 1) {
                   this.view.getSim().setSelected(true); 
                } else {
                   this.view.getNao().setSelected(true);
                }
            }
        }  
        catch (NumberFormatException e){
            this.view.exibirMenssagem("Número de registro digitada incorretamente. Só é "
                    + "permitido matricula com caracteres numéricos inteiros!");
        }
    }
    
    public void alterarController() {
        Integer numRegistro = Integer.parseInt(view.getNumRegistro().getText());
        String nome = this.view.getNome().getText();
        String emal = this.view.getEmail().getText();
        String senha = this.view.getSenha().getText();
        int adiministrador = 0;
        if (this.view.getSim().isSelected()) {
            adiministrador = 1;
        }

        Professor professor = new Professor(numRegistro, nome, emal, senha, adiministrador);
        if (professorDao.update(professor)) {
            this.view.exibirMenssagem("Dados atualizados com sucesso!");
            limparCamposController();
        } else {
            this.view.exibirMenssagem("Não foi possível atualizar os dados!");
        }
    }
    
    public void limparCamposController() {
        this.view.getNumRegistro().setEditable(true);
        
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
