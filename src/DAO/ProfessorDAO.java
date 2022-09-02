
package DAO;

import Model.Professor;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface ProfessorDAO {
    
    boolean insert(Professor obj);
		
    boolean update(Professor obj);
		
    void deletePorNumR(Integer numR);
    
    boolean altenticarUsuarioDAO(Professor obj);
    
    boolean verificarAdm(Professor obj);
    
    Professor selectPorNumR(Integer numRegistro);
    
    List<Professor> listarProf();      // Emcontrar tudo.
}
