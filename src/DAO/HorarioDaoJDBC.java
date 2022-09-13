
package DAO;

import Model.Horario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Francisco Mendonça
 */
public class HorarioDaoJDBC implements HorarioDAO{
    
    private Connection conn = null;
    
    
    public HorarioDaoJDBC(Connection conn) {
	this.conn = conn;
    }
    
    
    @Override
    public boolean insert(Horario obj) {
         PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement(
                "INSERT INTO horario (turno, dia, h_inicial, h_final, disciplina_cod)"
                + " VALUES (?, ?, ?, ?, ?)");

            st.setString(1, obj.getTurno().toString().toLowerCase());
            st.setString(2, obj.getDia());
            st.setString(3, obj.getH_inicial());
            st.setString(4, obj.getH_final());
            st.setInt(5, obj.getDisciplina().getCod());

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
    
}
