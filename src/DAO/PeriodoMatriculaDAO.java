
package DAO;

import Model.PeriodoMatricula;
import java.util.List;



/**
 *
 * @author Francisco Mendonça
 */
public interface PeriodoMatriculaDAO {
    
    boolean insert(PeriodoMatricula obj);
    
    void update(PeriodoMatricula obj);
    
    List<PeriodoMatricula> listarPeriodoMatricula();
}
