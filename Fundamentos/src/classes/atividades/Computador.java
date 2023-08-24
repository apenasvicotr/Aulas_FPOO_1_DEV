package classes.atividades;

import java.nio.channels.Pipe;

/**
 *
 * @author Aluno
 */
public class Computador {
    
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int capacidadeDiscoRigido;
    private String sistemaOperacional;
    private String status;

    public Computador(MemoriaEnum memoria, ProcessadorEnum processador, int capacidadeDiscoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
        this.status = "Desligado";
    }

    public void ligarComputador(){
    this.status = "Ligado";
    }
    
    public void desligarComputador(){
    this.status = "Desligado";
    }
    
    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
    
    
}
