
package DAO;

/**
 * @author Francisco Mendonça
 * 
 */
public class FabricaDAO {
    // Classe alciliar que fica responsavel por intanciar os objetos: 
    public static ProfessorDAO criarProfessorDao() {
	return new ProfessorDaoJDBC(DB.getConnection()); 
    }
    
    // Classe alciliar que fica responsavel por intanciar os objetos: 
    public static AlunoDAO criarProAlunoDao() {
	return new AlunoDaoJDBC(DB.getConnection()); 
    }
}
