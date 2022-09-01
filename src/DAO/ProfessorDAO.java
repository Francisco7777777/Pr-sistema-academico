
package DAO;

import Model.Professor;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface ProfessorDAO {
    
    void insert(Professor obj);
		
    boolean update(Professor obj);
		
    void deletePorNumR(Integer numR);
    
    boolean altenticarUsuarioDAO(Professor obj);
    
    boolean verificarAdm(Professor obj);
    
    List<Professor> listarProf();      // Emcontrar tudo.
}
