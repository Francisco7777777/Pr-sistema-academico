
package Model;

import java.util.logging.Logger;

/**
 *
 * @author Francisco Mendonça
 */
public enum Turno {
    MANHã("manhã"),
    TARDE("tarde"),
    NOITE("noite");
    
    private String turno;

    private Turno(final String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return turno;
    }
    
}
