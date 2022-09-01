
package Controller;

import DAO.AlunoDAO;
import DAO.FabricaDAO;
import DAO.ProfessorDAO;
import Model.Aluno;
import Model.Professor;
import View.Adm;
import View.Login;
import View.Prof;
import View.TeAluno;

/**
 *
 * @author Francisco Mendonça
 */
public class LoginController {
    
    // Assim a viw login será acessivel de qualquer ponto dessa classe.
    final private Login view;
    final private ProfessorDAO professorDao = FabricaDAO.criarProfessorDao();
    final private AlunoDAO alunoDao = FabricaDAO.criarProAlunoDao();

    // Para que esse controller seja criado ele pressisa receber a tela.
    public LoginController(Login view) {
        this.view = view;
    }

    public void altenticarUsuarioController() {
        try {
            // A variável usuari resebe da view o texto que estar no campo usuario.
            Integer usuario = Integer.parseInt(view.getUsuario().getText());
            String senha = String.valueOf(view.getSenha().getPassword());

            if (1 == verificarNivelDeAcesso(usuario)) {
                Professor usuarioModelo = new Professor();
                usuarioModelo.setNumRegistro(usuario);
                usuarioModelo.setSenha(senha);

                if (professorDao.altenticarUsuarioDAO(usuarioModelo) && professorDao.verificarAdm(usuarioModelo)) {
                    Adm adiministrador = new Adm();        // Tela do adiministrador.
                    adiministrador.setVisible(true);       // Abrir tela.
                    this.view.dispose();                   // Fechar a tela anterior.

                } else if (professorDao.altenticarUsuarioDAO(usuarioModelo)) {
                    Prof professor = new Prof();
                    professor.setVisible(true);       // Abrir tela.
                    this.view.dispose();
                } else {
                    this.view.exibirMenssagem("Usuario ou senha invalido!");
                }
            } 
            if (2 == verificarNivelDeAcesso(usuario)) {
                Aluno usuarioModelo = new Aluno();
                usuarioModelo.setMatricula(usuario);
                usuarioModelo.setSenha(senha);

                if (alunoDao.altenticarUsuarioDAO(usuarioModelo)) {
                    TeAluno aluno = new TeAluno();        // Tela do adiministrador.
                    aluno.setVisible(true);           // Abrir tela.
                    this.view.dispose();                   // Fechar a tela anterior.
                }
            }
        } catch (NumberFormatException e) {
            this.view.exibirMenssagem(" Usuário digitado incorretamente. Só é permitido "
                    + "usuário com caracteres numéricos inteiros!");
        }
    }
    
    private int verificarNivelDeAcesso(int usuario) {
        int nivelDeAcesso = usuario < 100000000 ? 1 : 2;
        return nivelDeAcesso;
    }
    
    public void limparTelaController() {
        view.getUsuario().setText("");
        view.getSenha().setText("");
    }

    public void sairController() {
        System.exit(0);          // Fecha todo o sistema.
    }
}
