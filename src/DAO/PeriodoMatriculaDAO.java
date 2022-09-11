
package DAO;

import Model.PeriodoMatricula;
import java.util.List;



/**
 *
 * @author Francisco Mendonça
 */
public interface PeriodoMatriculaDAO {
    
    public boolean insert(PeriodoMatricula obj);
    
    public void update(PeriodoMatricula obj);
    
    public List<PeriodoMatricula> listarPeriodoMatricula();
}
