
package sistema_academico;


import Model.Professor;
import DAO.FabricaDAO;
import DAO.ProfessorDAO;
import java.util.List;
//import java.util.List;

/**
 * @author Evandro
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        
        ProfessorDAO professorDao = FabricaDAO.criarProfessorDao();
        /*
        System.out.println("=====  Teste 1: Professor Insert =====");
	Professor professor = new Professor(12398754, false, "Artul", "artul@email", "12377733");
        professorDao.insert(professor);
        
        System.out.println("=====  Teste 2: Professor Delete =====");
        professorDao.deletePorNumR(12398754);
        */
        System.out.println("=====  Teste 3: Professor Select =====");
        List<Professor> lista = professorDao.listarProf();
        for (Professor obj : lista) {
            System.out.println(obj.getNumRegistro() + ", " + obj.getNome() + ", " 
                + obj.getEmail() + ", " + obj.getSenha() + ", " + obj.getAdiministrador()); 
        }
        /*
        System.out.println("=====  Teste 4: Professor Update =====");
        Professor professor01 = new Professor(12398754, false, "Lara", "lara@Gemail.com", "33377711");
        professorDao.update(professor01);
        */
    }
}
