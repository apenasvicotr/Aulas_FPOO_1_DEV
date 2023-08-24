/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    //Atributos, são as caracteristicas da bicicleta
    private int qtdeRodas;
    private boolean marchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean freio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    public Bicicleta() {
    }
   
    
    //construtor com argumentos
    public Bicicleta(int qtdeRodas, boolean marchas, int qtdeMarchas, String modelo, boolean freio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.marchas = marchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.freio = freio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    //Ações da Bicicleta
    public void andar(int velocidade){
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar(){
    this.situacao = "Freiando";
    this.velocidade -= 1;
    }
    
    public boolean verificarFreio() {
    return this.freio;
    }

    // toString

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", marchas=" + marchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", freio=" + freio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
    
    
}
