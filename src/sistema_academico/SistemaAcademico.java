
package sistema_academico;
/*
import java.util.Scanner;
import Model.Aluno;
import Model.Professor;
*/

import dao.DB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author Evandro
 */
public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner Obj = new Scanner(System.in);
        
        //Entradas de texto
        System.out.println("Digite o nome: ");
        String nome = Obj.nextLine();
        
        System.out.println("Digite o email: ");
        String email = Obj.nextLine();
        
        System.out.println("Digite a senha: ");
        String senha = Obj.nextLine();
        
        //Entradas numericas
        System.out.println("Digite o Matricula: ");
        Integer matricula = Obj.nextInt();
        
        System.out.println("Digite se é um adimistrador");
        boolean boo = Obj.nextBoolean();
        
        Aluno aluno01 = new Aluno(matricula, nome, email, senha);
        System.out.println(aluno01.getNome() + " " + aluno01.getEmail() + " " + aluno01.getSenha());
        
        Professor professor = new Professor(matricula, boo, nome, email, senha);
        System.out.println(professor.getNome() + " " + professor.getEmail() + " "
            + professor.getSenha() + " " + professor.getAdiministrador());
        
        Obj.close();
        */
        
        Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
		
	try {
            conn = DB.getConnection();           // Abrindo uma conecção.
            st = conn.createStatement();  // Instanciei um objeto o "st".
			
            rs = st.executeQuery("select * from professor");
			
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ", " + rs.getString(2)    
                + ", " + rs.getString(3) + ", " + rs.getString(4)+ ", "
                + rs.getBoolean(5));
            }
	}
	catch (SQLException e) {
            e.printStackTrace();
		}
	finally {
            DB.closeResultSet(rs);	
            DB.closeStatement(st);
            DB.closeConnection();
	}
    }

}
