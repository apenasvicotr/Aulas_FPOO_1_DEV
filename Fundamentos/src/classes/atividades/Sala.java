package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Sala {

    private int cadeiras;
    private int mesas;
    private int sala;
    private boolean projetor;
    private int computadores;
    private String status;

    public Sala(int cadeiras, int mesas, int sala, boolean projetor, int computadores) {
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.sala = sala;
        this.projetor = projetor;
        this.computadores = computadores;
        this.status = "Indiferente";
    }

    public void abrirSala() {
        this.status = "Aberta";
    }

    public void fecharSala() {
        this.status = "Fechada";
    }

    @Override
    public String toString() {
        return "Sala{" + "cadeiras=" + cadeiras + ", mesas=" + mesas + ", sala=" + sala + ", projetor=" + projetor + ", computadores=" + computadores + ", status=" + status + '}';
    }

}
