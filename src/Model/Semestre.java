package Model;

import java.util.Date;

/**
 *
 * @author Eugênio Oliveira
 */
public class Semestre {
    private int id;
    private Date data_inicial;
    private Date data_final;
    private boolean status;

    public Semestre() {
        
    }

    public Semestre(int id, Date data_inicial, Date data_final, boolean status) {
        this.id = id;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public Date getData_final() {
        return data_final;
    }

    public boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
