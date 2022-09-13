
package Controller;

import DAO.FabricaDAO;
import DAO.DisciplinaDAO;
import DAO.HorarioDAO;
import DAO.SemestreDAO;
import Model.Disciplina;
import Model.Horario;
import Model.Semestre;
import Model.Turno;
import View.Adm;
import View.DisciplinaView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco Mendonça
 */
public class DisciplinaController {
    
    final private DisciplinaDAO disciplinaDao = FabricaDAO.criarDisciplinaDao();
    final private SemestreDAO SemestreDao = FabricaDAO.criarSemestreDao();
    final private HorarioDAO horarioDao = FabricaDAO.criarHorarioDao();
    final private DisciplinaView view;
 
    
    public DisciplinaController(DisciplinaView view) {
        this.view = view;
    }

    public void cadastrarController() {
        
        String nome = this.view.getNome().getText();
        int status = this.view.getDisciplinaStatus().getSelectedIndex();
        int cargaHoraria = Integer.parseInt(this.view.getCargaHoraria().getText());

        int semestreAtual = Integer.parseInt(this.view.getIdSemestre().getText());
        Semestre s = new Semestre();
        s.setId(semestreAtual);

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setStatus(status);
        disciplina.setCarga_horaria(cargaHoraria);
        disciplina.setSemestre(s);

        if (disciplinaDao.insert(disciplina)) {
            this.view.exibirMenssagem("Cadastro de disciplina realizado com sucesso!");
        } else {
            this.view.exibirMenssagem("Falha ao tentar cadastrar disciplina!");
        }
    }
    
    public void alterarController() {
        if (!this.view.getCodigo().getText().isEmpty()) {
            Disciplina disciplina = new Disciplina();

            Integer status = this.view.getDisciplinaStatus().getSelectedIndex();
            disciplina.setStatus(status);
            Integer codigo = Integer.parseInt(this.view.getCodigo().getText());
            disciplina.setCod(codigo);
            disciplinaDao.update(disciplina);
        } else {
            this.view.exibirMenssagem("É necessário escolher o código da disciplina."
                + " Basta pesquisar pela disciplina");
        }
    }


    public void listarDisciplinasController() {
        List <Disciplina> disciplinas = new ArrayList <>();
        disciplinas = disciplinaDao.listarDisciplinas();
        
        // É preciso um modelo para a tabela (default). 
        DefaultTableModel modelo = (DefaultTableModel) this.view.getTabelaDisciplina().getModel();
        modelo.setNumRows(0);
        
        for (Disciplina d : disciplinas) {
            modelo.addRow(new Object[]{
                d.getSemestre().getId(),
                d.getCod(),
                d.getNome(),
                d.getStatus(),
                d.getCarga_horaria(),
                d.getTodosHorarios().getDia(),
                d.getTodosHorarios().getH_inicial(),
                d.getTodosHorarios().getH_final()
            });
        }
    }

    public void selecionarController() {
        Disciplina disciplina = new Disciplina();
        int cod = Integer.parseInt(this.view.getPesquisar().getText());
        
        disciplina = disciplinaDao.selecionar(cod);
        
        this.view.getCodigo().setText(String.valueOf(disciplina.getCod()));
        this.view.getNome().setText(disciplina.getNome());
        this.view.getNome().setText(disciplina.getNome());
        this.view.getDisciplinaStatus().setSelectedIndex(disciplina.getStatus());
        this.view.getCargaHoraria().setText(String.valueOf(disciplina.getCarga_horaria()));  
    }
    
    public void inserirHorarioController() {
        if (!this.view.getCodigo().getText().isEmpty()) {
            Horario horario = new Horario();
            String turno = this.view.getTurno().getSelectedItem().toString();
            if ("manhã".equals(turno)) {
                horario.setTurno(Turno.MANHã);
            } else if ("tarde".equals(turno)) {
                horario.setTurno(Turno.TARDE);
            } else {
                horario.setTurno(Turno.NOITE);
            }

            String dia = this.view.getDiaSemana().getSelectedItem().toString();
            horario.setDia(dia);
            String horarioInicial = this.view.getHorarioInicial().getText();
            horario.setH_inicial(horarioInicial);
            String horarioFinal = this.view.getHorarioFinal().getText();
            horario.setH_final(horarioFinal);

            Disciplina d = new Disciplina();
            Integer codigo = Integer.parseInt(this.view.getCodigo().getText());
            d.setCod(codigo);
            horario.setDisciplina(d);

            if (horarioDao.insert(horario)) {
                this.view.exibirMenssagem("Cadastro de horário realizado com sucesso!");
            } else {
                this.view.exibirMenssagem("Falha ao tentar cadastrar horário!");
            }
        } else {
            this.view.exibirMenssagem("É necessário escolher o código da disciplina."
                + " Basta pesquisar pela disciplina");
        }
    }

    public void ultimoIdSemestre() {
       int id = SemestreDao.selecionarUltimoId();
       this.view.getIdSemestre().setText(String.valueOf(id));
    }

    public void voltarController() {
        Adm adiministrador = new Adm();
        adiministrador.setVisible(true);
        this.view.dispose();
    }
    
    public void limparController() {
        this.view.getNome().setText("");
        this.view.getCargaHoraria().setText("");
        this.view.getHorarioInicial().setText("");
        this.view.getHorarioFinal().setText("");
        this.view.getPesquisar().setText("");
        this.view.getCodigo().setText("");
    }

}
