
package DAO;

import Model.Semestre;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface SemestreDAO {
    
    void insert(Semestre obj);
		
    void update(Semestre obj);
		
    void deletePorNumR(Integer id);

    List<Semestre> listarProf();      // Emcontrar tudo.
}
