
package DAO;

import Model.Disciplina;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public interface DisciplinaDAO {
    
    public boolean insert(Disciplina obj);
		
    public Disciplina selecionar(Integer cod);
            
    public void update(Disciplina obj);
		
    public void deletePorNumR(Integer cod);

    public List<Disciplina> listarDisciplinas();
}
