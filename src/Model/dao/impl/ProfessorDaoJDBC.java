
package Model.dao.impl;

import Model.Professor;
import modeo.dao.ProfessorDAO;
import java.sql.Connection;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Professor obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletePorNumR(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Professor encontrarPorNumR(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Professor> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
