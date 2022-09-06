
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

    final private CadAluno view;
    final private AlunoDAO alunoDao = FabricaDAO.criarAlunoDao();

    
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

            if (alunoJaExiste(matricula)) {
                if (alunoDao.insert(aluno)) {
                    this.view.exibirMenssagem("Aluno cadastrado com sucesso!");
                    limparCamposController();
                } else {
                    this.view.exibirMenssagem("Erro ao cadastrado aluno!");
                }
            } else {
                this.view.exibirMenssagem("Aluno já cadastrado com essa matrícula: " + matricula);
            }
        } catch (NumberFormatException e){
            this.view.exibirMenssagem("Matricula digitada incorretamente. Só é "
                    + "permitido matricula com caracteres numéricos inteiros!");
        }  
    }
    
    private boolean alunoJaExiste(Integer matricula) {
        Aluno aluno01 = new Aluno();
        aluno01 = alunoDao.selectPorMatricula(matricula);
        
        if (aluno01.getMatricula() == null) {
            System.out.println("null aqui");
            return true;
        }
        return false;
    }
    
    public void pesquisarController() {
        
        try {
            Integer pesquisar = Integer.parseInt(this.view.getPesquisar().getText());
            Aluno aluno = new Aluno();
            aluno = alunoDao.selectPorMatricula(pesquisar);
            
            if (aluno.getMatricula() == null) {
                this.view.exibirMenssagem("Aluno com a matrícula: " + pesquisar + " não encontrado!");
            } else {
                this.view.getMatricula().setEditable(false);
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
        
        System.out.println("null - verdadeiro");
        if(alunoDao.update(aluno)) {
            this.view.exibirMenssagem("Dados atualizados com sucesso!");
            limparCamposController();
        } else {
            this.view.exibirMenssagem("Não foi possível atualizar os dados!");
        }
    }
    
    public void limparCamposController() {
        this.view.getMatricula().setEditable(true);
        
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
