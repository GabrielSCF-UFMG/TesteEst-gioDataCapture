/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazendinha;

/**
 *
 * @author gabri
 */
public class Animal { //Classe pai, super-classe
    
    //Todos os animais têm esses atributos
    private int idade;
    private double tamanho;
    private boolean voa; //Alguns animais voam
    private int altitude;
    
    public Animal(int idade, double tamanho, boolean voa,int altitude){
        this.idade = idade;
        this.tamanho = tamanho;
        this.voa = voa;
        this.altitude = altitude;
      
    }
    
    //Métodos getters
    public int getIdade(){return idade;};
    public double getTamanho(){return tamanho;}
    public boolean getVoa(){return voa;}
    public int getAltitude(){return altitude;};
    
    //Métodos setters
    public void setIdade(int id){this.idade = id;}
    public void setTamanho(double tam){this.tamanho = tam;}
    public void setVoa(boolean voa){this.voa = voa;}
    public void setAltitude(int altitude){this.altitude = altitude;}
    
    public void emitirSom(){
        System.out.println("O animal está emitindo seu som.");
    }
    
}
