/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    
       private String modelo;
       private String marca;
       private CorEnum cor;
       private int ano;
       private int qtdeRodas;
       private boolean temStep;
       private String situacao;
       private int velocidade;
       private int marcha;
       private boolean estaEmRe;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdeRodas, boolean temStep, int marcha, boolean estaEmRe) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.temStep = temStep;
        this.marcha = marcha;
        this.estaEmRe = estaEmRe;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
        
    public void andar(int velocidade){
    this.situacao = "Andando";
    this.velocidade = velocidade;
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha){
    int diferenca = novaMarcha.getNumeroMarcha();
    
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
            
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", temStep=" + temStep + ", situacao=" + situacao + ", velocidade=" + velocidade + ", marcha=" + marcha + ", estaEmRe=" + estaEmRe + '}';
    }
    
    
    
    
    
}
