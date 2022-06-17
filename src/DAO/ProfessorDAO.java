
package DAO;

import Model.Professor;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface ProfessorDAO {
    
    void insert(Professor obj);
		
    void update(Professor obj);
		
    void deletePorNumR(Integer numR);

    List<Professor> listarProf();      // Emcontrar tudo.
}
