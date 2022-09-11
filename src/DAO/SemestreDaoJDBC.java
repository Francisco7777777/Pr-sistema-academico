
package DAO;

import Model.Semestre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Francisco Mendonça
 */
public class SemestreDaoJDBC implements SemestreDAO{
    
    private Connection conn = null;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public SemestreDaoJDBC(Connection conn) {
	this.conn = conn;
    }
    
    @Override
    public void insert(Semestre obj) {
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                
                "INSERT INTO semestre (data_inicil, data_final, periodo_matricula_professor,"
                    + " periodo_matricula_aluno, status)"
                    + " VALUES ('" + sdf.format(obj.getData_inicial()) + "','" + 
                    sdf.format(obj.getData_final()) + "', ?, ?, ?)");
            
            st.setInt(1, obj.getPeriodoMatriculaProfessor());
            st.setInt(2, obj.getPeriodoMatriculaAluno());
            st.setInt(3, obj.getStatus());

            int l = st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
    }
    
    @Override
    public void update(Semestre obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE semestre SET "
                    + "data_inicil = '" +sdf.format(obj.getData_inicial())+ "', "
                    + "data_final = '" +sdf.format(obj.getData_final())+ "', "
                    + "periodo_matricula_professor = ?, periodo_matricula_aluno = ?, "
                    + "status = ? WHERE id = ?");
            
            st.setInt(1, obj.getPeriodoMatriculaProfessor());
            st.setInt(2, obj.getPeriodoMatriculaAluno());
            st.setInt(3, obj.getStatus());
            st.setInt(4, obj.getId());
            
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
    }
    
    @Override
    public Semestre selecionarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Semestre semestre = new Semestre();
        
        try {
            st = conn.prepareStatement("SELECT * FROM semestre WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            while(rs.next()) {
                semestre.setId(rs.getInt(1));
                semestre.setData_inicial(rs.getDate(2));
                semestre.setData_final(rs.getDate(3));
                semestre.setPeriodoMatriculaProfessor(rs.getInt(4));
                semestre.setPeriodoMatriculaAluno(rs.getInt(5));
                semestre.setStatus(rs.getInt(6));
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return semestre;
    }
    
    @Override
    public List<Semestre> listarSemestre() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Semestre> lista = new ArrayList<>();
        
        try {
            st = conn.prepareStatement("SELECT * FROM semestre");
            rs = st.executeQuery();
            
            while(rs.next()) {
                Semestre obj = new Semestre();
                obj.setId(rs.getInt(1));
                obj.setData_inicial(rs.getDate(2));
                obj.setData_final(rs.getDate(3));
                obj.setPeriodoMatriculaProfessor(rs.getInt(4));
                obj.setPeriodoMatriculaAluno(rs.getInt(5));
                obj.setStatus(rs.getInt(6));
                
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
