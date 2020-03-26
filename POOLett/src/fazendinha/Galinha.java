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
public class Galinha extends Ave{
    
    private static int ovos = 0;
    private int thisOvos = 0;
    
    public Galinha(int idade, double tamanho,String corPena){
        super(idade,tamanho,false,0,corPena);//Galinha cacareja e não voa (0 de altitude)
    }
    
    //Getters
    public static int getOvos() {return ovos;}
    public int getThisovos() {return thisOvos;}
    
    //Setters
    public static void setOvos(int ovos) {Galinha.ovos = ovos;}
    public void setThisovos(int thisovos) {this.thisOvos = thisovos;}
    
    //Interface
    public void interfaceGalinha(){
        System.out.println("*****INTERFACE DA GALINHA*****");
        System.out.println("O som emitido pela galinha é um 'cacarejo'!");
        System.out.println("A galinha voa? "+ getVoa());
        System.out.println("A idade da galinha é "+ getIdade()+" anos!");
        System.out.println("O tamanho da galinha é "+ getTamanho() + " centimetros!");
        System.out.println("A cor da pena da galinha é "+getCorPena());
        //ovos
        System.out.println("Essa galinha botou "+getThisovos()+" ovos!");
        System.out.println("Todas as galinhas botaram "+getOvos()+" ovos!"); 
        
    }
    
    //Ações
    public void botarOvo(){
        if(getBotaOvo() == true){
            System.out.println("Essa galinha está botando ovo!!");
            ovos++;
            thisOvos++;
        }
        else{
            System.out.println("Essa galinha não bota ovo!!");
        }
    }
    public void voar(){
        if(getVoa() == false){
            System.out.println("A galinha não voa!");
        }
        else{
            System.out.println("A galinha está voando, pera, como assim?!");
        }
    }
    public void emitirSom(){
        System.out.println("A galinha está cacarejando: 'CocoricOoOoó!!'");
    }
    
}
