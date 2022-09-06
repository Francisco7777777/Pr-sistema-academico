
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
    public static AlunoDAO criarAlunoDao() {
	return new AlunoDaoJDBC(DB.getConnection()); 
    }
    
    // Classe alciliar que fica responsavel por intanciar os objetos: 
    public static PeriodoMatriculaDAO criarPeriodoMatriculaDao() {
	return new PeriodoMatriculaDaoJDBC(DB.getConnection()); 
    }
    
    // Classe alciliar que fica responsavel por intanciar os objetos: 
    public static SemestreDAO criarSemestreDao() {
	return new SemestreDaoJDBC(DB.getConnection()); 
    }
}
