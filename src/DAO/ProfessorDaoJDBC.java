
package DAO;

import DAO.DB;
import Model.Professor;
import DAO.ProfessorDAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Francisco Mendonça
 */
public class ProfessorDaoJDBC implements ProfessorDAO{
    
    private Connection conn = null;
    
    public ProfessorDaoJDBC(Connection conn) {
	this.conn = conn;
    }

    
    @Override
    public void insert(Professor obj) {
        
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                "INSERT INTO professor (num_registro, nome, email, senha, adiministrador)"
                + " VALUES (?, ?, ?, ?, ?)");

            st.setInt(1, obj.getNumRegistro());
            st.setString(2, obj.getNome());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getSenha());
            st.setBoolean(5, obj.getAdiministrador());

            int l = st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
    }

    
    @Override
    public boolean update(Professor obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE professor SET num_registro = ?, nome = ?, email = ?, senha = ?,"
                + " adiministrador = ? WHERE num_registro = ?");

            st.setInt(1, obj.getNumRegistro());
            st.setString(2, obj.getNome());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getSenha());
            st.setBoolean(5, obj.getAdiministrador());
            st.setInt(6, obj.getNumRegistro());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        finally {
            DB.closeStatement(st);
        }
        return true;
    }

    
    @Override
    public void deletePorNumR(Integer numR) {
        
        PreparedStatement st = null;
		
        try {
            st = conn.prepareStatement("DELETE FROM professor WHERE num_registro = ?");
            st.setInt(1, numR);
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
        }
    }

    
    @Override
    public List<Professor> listarProf() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Professor> lista = new ArrayList<>();
        
        try {
            st = conn.prepareStatement("SELECT * FROM professor");
            rs = st.executeQuery();
            
            while(rs.next()) {
                Professor obj = new Professor();
                obj.setNumRegistro(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setSenha(rs.getString(4));
                obj.setAdiministrador(rs.getBoolean(5));
                
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

    @Override
    public boolean altenticarUsuarioDAO(Professor obj) {
        
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            //conn = Coneccao.getConnection();
            
            st = conn.prepareStatement("SELECT * FROM professor WHERE num_registro = ? AND senha = ?");
            
            obj.setAdiministrador(true);
            st.setInt(1, obj.getNumRegistro());
            st.setString(2, obj.getSenha());
            rs = st.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }      
        } 
        catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();
        }
    }

    @Override
    public boolean verificarAdm(Professor obj) {
        
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            //conn = Coneccao.getConnection();
            
            st = conn.prepareStatement("SELECT * FROM professor where num_registro = ? AND senha = ? AND adiministrador = 1");

            st.setInt(1, obj.getNumRegistro());
            st.setString(2, obj.getSenha());
            rs = st.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }      
        } 
        catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            //DB.closeConnection();
        }
    }

}
