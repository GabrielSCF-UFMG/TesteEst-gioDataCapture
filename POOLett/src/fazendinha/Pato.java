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
public class Pato extends Ave{
    
    private static int voos = 0;
    private int thisVoos = 0;
    private static int ovos = 0;
    private int thisOvos = 0;
    
    public Pato(int idade, double tamanho,int altitude,String corPena){
        super(idade,tamanho,true,altitude,corPena);
    }  
    
    //Getters
    public static int getVoos() {return voos;}
    public int getThisvoos() {return thisVoos;}
    public static int getOvos() { return ovos;}
    public int getThisovos() {return thisOvos;}
    
    //Setters
    public static void setVoos(int voos) {Pato.voos = voos;}
    public void setThisvoos(int thisVoos) {this.thisVoos = thisVoos;}
    public static void setOvos(int ovos) {Pato.ovos = ovos;}
    public void setThisovos(int thisovos) {this.thisOvos = thisovos;}
    
    //Interface
    public void interfacePato(){
        
        System.out.println("*****INTERFACE DO PATO *****");
        System.out.println("O som emitido pelo Pato é um 'grasnido'!");
        System.out.println("O Pato voa? "+ getVoa());
        System.out.println("O Pato voa a " + getAltitude()+" metros de altitude!");
        System.out.println("A idade do pato é "+ getIdade()+" anos!");
        System.out.println("O tamanho do pato é "+ getTamanho() + " centimetros!");
        System.out.println("A cor da pena do pato é "+getCorPena());
        
        //ovos e voos
        System.out.println("Esse pato botou "+getThisovos()+" ovos!");
        System.out.println("Todos os patos botaram "+getOvos()+" ovos!");
        System.out.println("Esse pato voou "+getThisvoos()+" vezes!");
        System.out.println("Todos os patos voaram "+getVoos()+" vezes!");
        
    }
    
    //Ações
    public void botarOvo(){
        if(getBotaOvo() == true){
            System.out.println("Esse pato está botando ovo!!");
            ovos++;
            thisOvos++;
        }
        else{
            System.out.println("Esse pato não bota ovo!!");
        }
    }
    public void voar(){
        if(getVoa() == true){
            System.out.println("O pato pode voa!");
        }
        else{
            System.out.println("Infelizmente o pato não está voando!");
        }
    }
    public void emitirSom(){
        System.out.println("O pato está grasnidando: 'Quack Quack!!'");
    }
    
    
}
    
    
    
    

