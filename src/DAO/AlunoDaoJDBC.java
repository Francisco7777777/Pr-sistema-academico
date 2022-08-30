
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
    public void insert(Aluno obj) {
        
    }

    @Override
    public void update(Aluno obj) {
       
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
            DB.closeConnection();
        }
    }

    @Override
    public List<Aluno> listarProf() {
        return null;
    }
    
}
