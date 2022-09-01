
package Controller;

import DAO.AlunoDAO;
import DAO.FabricaDAO;
import Model.Aluno;
import View.Adm;
import View.CadAluno;

/**
 *
 * @author Francisco Mendonça
 */
public class CadastroAlunoController {

    private final CadAluno view;
    final private AlunoDAO alunoDao = FabricaDAO.criarProAlunoDao();

    
    public CadastroAlunoController(CadAluno view) {
        this.view = view;
    }
    
    
    public void cadastrarController() {
        try {
            Integer matricula = Integer.parseInt(view.getMatricula().getText());
            String nome = this.view.getNome().getText();
            String emal = this.view.getEmail().getText();
            String senha = this.view.getSenha().getText();

            Aluno aluno = new Aluno(matricula, nome, emal, senha);

            if (alunoDao.insert(aluno)) {
                this.view.exibirMenssagem("Aluno cadastrado com sucesso!");
                limparCamposController();
            } else {
                this.view.exibirMenssagem("Erro ao cadastrado aluno!");
            }
        } catch (NumberFormatException e){
            this.view.exibirMenssagem(" Matricula digitada incorretamente. Só é "
                    + "permitido matricula com caracteres numéricos inteiros!");
        }  
    }
    
    public void pesquisarController() {
        
        try {
            Integer pesquisar = Integer.parseInt(this.view.getPesquisar().getText());
            Aluno aluno = new Aluno();
            aluno = alunoDao.selectPorNumR(pesquisar);
            
            if (aluno.getMatricula() == null) {
                this.view.exibirMenssagem("Aluno com a matrícula: " + pesquisar + " não encontrado!");
            } else {
                this.view.getMatricula().setText(String.valueOf(aluno.getMatricula()));
                this.view.getNome().setText(aluno.getNome());
                this.view.getEmail().setText(aluno.getEmail());
                this.view.getSenha().setText(aluno.getSenha());
            }
        }  
        catch (NumberFormatException e){
            this.view.exibirMenssagem(" Matricula digitada incorretamente. Só é "
                    + "permitido matricula com caracteres numéricos inteiros!");
        }
    }
    
    public void alterarController() {
        Integer matricula = Integer.parseInt(view.getMatricula().getText());
        String nome = this.view.getNome().getText();
        String emal = this.view.getEmail().getText();
        String senha = this.view.getSenha().getText();

        Aluno aluno = new Aluno(matricula, nome, emal, senha);
        if (alunoDao.update(aluno)) {
            this.view.exibirMenssagem("Dados atualizados com sucesso!");
            limparCamposController();
        } else {
            this.view.exibirMenssagem("Não foi possível atualizar os dados!");
        }
    }
    
    public void limparCamposController() {
        this.view.getMatricula().setText("");
        this.view.getNome().setText("");
        this.view.getEmail().setText("");
        this.view.getSenha().setText("");
        this.view.getPesquisar().setText("");
    }
        
    public void voltarController() {
       Adm adiministrador = new Adm();
       adiministrador.setVisible(true);
       this.view.dispose();
    }

}
