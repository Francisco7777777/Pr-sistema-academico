
package DAO;

import Model.Disciplina;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface DisciplinaDAO {
    
    void insert(Disciplina obj);
		
    void update(Disciplina obj);
		
    void deletePorNumR(Integer cod);

    List<Disciplina> listarProf();      // Emcontrar tudo.
}
