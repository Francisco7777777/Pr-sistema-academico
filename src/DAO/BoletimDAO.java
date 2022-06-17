
package DAO;

import Model.Boletim;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface BoletimDAO {
    
    void insert(Boletim obj);
		
    void update(Boletim obj);
		
    void deletePorNumR(Integer id);

    List<Boletim> listarProf();      // Emcontrar tudo.
}
