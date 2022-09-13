
package DAO;

import Model.Disciplina;
import Model.Horario;
import Model.Semestre;
import Model.Turno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Francisco Mendonça
 */
public class DisciplinaDaoJDBC implements DisciplinaDAO{

    private Connection conn = null;
    
    public DisciplinaDaoJDBC(Connection conn) {
	this.conn = conn;
    }

    @Override
    public List<Disciplina> listarDisciplinas() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Disciplina> lista = new ArrayList<>();
        
        try {
            st = conn.prepareStatement("select d.semestre_id, d.cod, d.nome, d.status, "
                + "d.carga_horaria, h.dia, h.turno, h.h_inicial, h.h_final "
                + "from disciplina as d join horario as h on (d.cod = h.disciplina_cod)");
            
            rs = st.executeQuery();
            
            while(rs.next()) {
                Disciplina disciplina = new Disciplina();
                Horario horario = new Horario();
                Semestre s = new Semestre();
                
                s.setId(rs.getInt("d.semestre_id"));
                disciplina.setSemestre(s);
                
                disciplina.setCod(rs.getInt("d.cod"));
                disciplina.setNome(rs.getString("d.nome"));
                disciplina.setStatus(rs.getInt("d.status"));
                disciplina.setCarga_horaria(rs.getInt("d.carga_horaria"));
                
                horario.setDia(rs.getString("h.dia"));
                horario.setH_inicial(rs.getString("h.h_inicial"));
                horario.setH_final(rs.getString("h.h_final"));
                disciplina.setTodosHorarios(horario);
                
                lista.add(disciplina);
            }
            return lista;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    @Override
    public boolean insert(Disciplina obj) {
        
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                "INSERT INTO disciplina (nome, status, carga_horaria, semestre_id)"
                + " VALUES (?, ?, ?, ?)");

            st.setString(1, obj.getNome());
            st.setInt(2, obj.getStatus());
            st.setInt(3, obj.getCarga_horaria());
            st.setInt(4, obj.getSemestre().getId());

            int l = st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Disciplina selecionar(Integer cod) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Disciplina disciplina = new Disciplina();
        
        try {
            st = conn.prepareStatement("SELECT * FROM disciplina WHERE cod = ?");
            st.setInt(1, cod);
            rs = st.executeQuery();
            
            if (rs.next()) {
                disciplina.setCod(rs.getInt(1));
                disciplina.setNome(rs.getString(2));
                disciplina.setStatus(rs.getInt(3));
                disciplina.setCarga_horaria(rs.getInt(4));
            }
            return disciplina;
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return null;
    }
    
    @Override
    public void update(Disciplina obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE disciplina SET status = ? WHERE cod = ?");
            
            st.setInt(1, obj.getStatus());
            st.setInt(2, obj.getCod());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deletePorNumR(Integer cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
