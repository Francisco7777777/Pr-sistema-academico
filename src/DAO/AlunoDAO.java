
package DAO;

import Model.Aluno;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface AlunoDAO {
    
    void insert(Aluno obj);
		
    void update(Aluno obj);
		
    void deletePorNumR(Integer matricula);

    List<Aluno> listarProf();      // Emcontrar tudo.
}
