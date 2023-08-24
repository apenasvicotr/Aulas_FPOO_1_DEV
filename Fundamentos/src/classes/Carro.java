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
       private String cor;
       private int ano;
       private int qtdeRodas;
       private boolean temStep;
       private String situacao;
       private int velocidade;
        

    public Carro(String modelo, String marca, String cor, int ano, int qtdeRodas, boolean temStep) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.temStep = temStep;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    public void andar(int velocidade){
    this.situacao = "Andando";
    this.velocidade = velocidade;
    }
    
    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
    
    
}
