
package DAO;

import Model.Horario;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface HorarioDAO {
    
    void insert(Horario obj);
		
    void update(Horario obj);
		
    void deletePorNumR(Integer id);

    List<Horario> listarProf();      // Emcontrar tudo.
}
