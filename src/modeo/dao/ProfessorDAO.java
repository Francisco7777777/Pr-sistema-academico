
package modeo.dao;

import Model.Professor;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface ProfessorDAO {
    
    void insert(Professor obj);
		
    void update(Professor obj);
		
    void deletePorNumR(Integer id);

    Professor encontrarPorNumR(Integer id);

    List<Professor> findAll();      // Emcontrar tudo.
}
