
package DAO;

import Model.PeriodoMatricula;
import Model.Semestre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Francisco Mendonça
 */
public class PeriodoMatriculaDaoJDBC implements PeriodoMatriculaDAO{

    private Connection conn = null;
    
    public PeriodoMatriculaDaoJDBC(Connection conn) {
	this.conn = conn;
    }
    
    @Override
    public boolean insert(PeriodoMatricula obj) {
        
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                "INSERT INTO periodo_matricula (professor_status, aluno_status)"
                + " VALUES (?, ?)");

            st.setInt(1, obj.getProfessorStatus());
            st.setInt(2, obj.getAlunoStatus());

            int l = st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
        return true;
    }

    @Override
    public void update(PeriodoMatricula obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE periodo_matricula SET professor_status = ?, aluno_status = ?, WHERE id = ?");
            
            st.setInt(1, obj.getProfessorStatus());
            st.setInt(2, obj.getAlunoStatus());
            st.setInt(3, obj.getId());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public List<PeriodoMatricula> listarPeriodoMatricula() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<PeriodoMatricula> lista = new ArrayList<>();
        
        try {
            st = conn.prepareStatement("SELECT * FROM periodo_matricula");
            rs = st.executeQuery();
            
            while(rs.next()) {
                PeriodoMatricula obj = new PeriodoMatricula();
                obj.setId(rs.getInt(1));
                obj.setProfessorStatus(rs.getInt(2));
                obj.setAlunoStatus(rs.getInt(3));
                obj.setSemetre((Semestre) rs.getObject(4));
                
                lista.add(obj);
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return lista;
    }
    
}
