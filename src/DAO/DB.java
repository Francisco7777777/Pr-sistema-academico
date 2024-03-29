package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Evandro
 */
public class DB {
    
    // Objeto que sera o objeto de conecção com banco de dados do jdbc.
    private static Connection conn = null;
    
    static final String BD_URL = "jdbc:mysql://localhost:3306/dados_academico02";
    static final String USER = "root";
    static final String PASS = "nincarl7";
    
    // Gera uma conecção.
    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection(BD_URL, USER, PASS);
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    
    // Fechar a conecção.
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public static void closeStatement(Statement st) {
        if(st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void closeResultSet(ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
