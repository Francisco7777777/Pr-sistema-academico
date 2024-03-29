
package DAO;

import Model.Semestre;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface SemestreDAO {
    
    public void insert(Semestre obj);
		
    public void update(Semestre obj);
    
    public int selecionarUltimoId();
		
    //public void delete(Integer id);

    public Semestre selecionarPorId(Integer id);
    
    public List<Semestre> listarSemestre();
}
