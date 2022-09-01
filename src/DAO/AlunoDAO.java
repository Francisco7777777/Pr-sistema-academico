
package DAO;

import Model.Aluno;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface AlunoDAO {
    
    boolean insert(Aluno obj);
		
    boolean update(Aluno obj);
		
    void deletePorNumR(Integer matricula);
    
    Aluno selectPorNumR(Integer matricula);

    boolean altenticarUsuarioDAO(Aluno obj);
    
    List<Aluno> listarProf();      // Emcontrar tudo.
}
