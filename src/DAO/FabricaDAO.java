
package DAO;

import Model.dao.impl.ProfessorDaoJDBC;
import DB.DB;

/**
 * @author Francisco Mendonça
 * 
 */
public class FabricaDAO {
    // Classe alciliar que fica responsavel por intanciar os objetos: 
    public static ProfessorDAO criarProfessorDao() {
	return new ProfessorDaoJDBC(DB.getConnection()); 
    }
}
