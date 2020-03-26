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
public class Morcego extends Mamífero {
    
    private static int amamentos = 0;
    private int thisAmamentos = 0;
    private static int voos = 0;
    private int thisVoos = 0;
    
    public Morcego(int idade, double tamanho,int altitude,String corPelo){
        super(idade,tamanho,true,altitude,corPelo);
    }
    
    //Getters
    public static int getVoos() {return voos;}
    public int getThisvoos() {return thisVoos;}
    public static int getAmamentos() {return amamentos;}
    public int getThisAmamentos() {return thisAmamentos;}
    //Setters
    public static void setVoos(int voos) {Morcego.voos = voos;}
    public void setThisvoos(int thisVoos) {this.thisVoos = thisVoos;}
    public static void setAmamentos(int amamentos) {Morcego.amamentos = amamentos;}
    public void setThisAmamentos(int thisAmamentos) {this.thisAmamentos = thisAmamentos;}
    
    //Interface
    public void interfaceMorcego(){
        System.out.println("*****INTERFACE DO MORCEGO*****");
        System.out.println("O som emitido pelo morcego é um 'farfalho'!");
        System.out.println("O morcego voa? "+ getVoa());
        System.out.println("A idade do morcego é "+ getIdade()+" anos!");
        System.out.println("O tamanho do morcego é "+ getTamanho() + " centimetros!");
        System.out.println("A cor do pelo do morcego é "+getCorPelo());
        //Amamentação
        System.out.println("Esse morcego amamentou "+getThisAmamentos()+" vezes!");
        System.out.println("Todas os morcegos amamentaram "+getAmamentos()+" vezes!");
        System.out.println("Esse morcego voou "+getThisvoos()+" vezes!");
        System.out.println("Todos os morcegos voaram "+getVoos()+" vezes!");
        
    }
    
    
    //Ações
    public void amamentar(){
        if(getAmamenta() == true){ 
            System.out.println("O morcego está amamentando!");
            thisAmamentos++;
            amamentos++;
        }else{
            System.out.println("Esse morcego não amamenta!");
        }
        
    }
    public void voar(){
        if(getVoa() == true){
            System.out.println("O morcego está voando!");
            thisVoos++;
            voos++;
        }else{
            System.out.println("Esse morcego não voa!");
        }
        
    }
    public void emitirSom(){
        System.out.println("O morcego está 'farfalhando'!");
    }
    
}
