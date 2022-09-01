
package DAO;

import Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Francisco Mendonça
 */
public class AlunoDaoJDBC implements AlunoDAO{
    
    private Connection conn = null;
    
    public AlunoDaoJDBC(Connection conn) {
	this.conn = conn;
    }
    
    
    @Override
    public boolean insert(Aluno obj) {
        
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                "INSERT INTO aluno (matricula, nome, email, senha)"
                + " VALUES (?, ?, ?, ?)");

            st.setInt(1, obj.getMatricula());
            st.setString(2, obj.getNome());
            st.setString(3, obj.getEmail());
            st.setString(4, obj.getSenha());

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
    public boolean update(Aluno obj) {
       
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE aluno SET nome = ?, email = ?, senha = ? WHERE matricula = ?");

            st.setString(1, obj.getNome());
            st.setString(2, obj.getEmail());
            st.setString(3, obj.getSenha());
            st.setInt(4, obj.getMatricula());

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
    public void deletePorNumR(Integer matricula) {
        
    }

    @Override
    public boolean altenticarUsuarioDAO(Aluno obj) {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            //conn = Coneccao.getConnection();
            
            st = conn.prepareStatement("SELECT * FROM aluno WHERE matricula = ? AND senha = ?");

            st.setInt(1, obj.getMatricula());
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
    public Aluno selectPorNumR(Integer matricula) {
        
        PreparedStatement st = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        
        try {
            st = conn.prepareStatement("SELECT * FROM aluno WHERE matricula = ?");
            st.setInt(1, matricula);
            rs = st.executeQuery();
            
            while(rs.next()) {
                aluno.setMatricula(rs.getInt(1));
                aluno.setNome(rs.getString(2));
                aluno.setEmail(rs.getString(3));
                aluno.setSenha(rs.getString(4));
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            //DB.closeResultSet(rs);
        }
        return aluno;
    }
    
    @Override
    public List<Aluno> listarProf() {
        return null;
    }
    
}
