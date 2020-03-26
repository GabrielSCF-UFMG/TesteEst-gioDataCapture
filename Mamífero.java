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
public class Mamífero extends Animal{
    
    private String corPelo;
    private static boolean amamenta = true;
    
    public Mamífero(int idade, double tamanho, boolean voa,int altitude,String corPelo){
        super(idade,tamanho,voa,altitude);
        this.corPelo = corPelo;
    }

    //Métodos getters
    public String getCorPelo() {return corPelo;}
    public static boolean getAmamenta() {return amamenta;}
    
    //Métodos setters
    public void setCorPelo(String corPelo) { this.corPelo = corPelo;}
    public static void setAmamenta(boolean amamenta) {Mamífero.amamenta = amamenta;}
    
    
    //Ações
    public void amamentar(){
        if(getAmamenta() == true){ 
            System.out.println("O mamífero está amamentando!");
        }else{
            System.out.println("Esse mamífero não amamenta!");
        }
    }
    public void voar(){
        if(super.getVoa() == true){
            System.out.println("O mamífero está voando!");
        }else{
            System.out.println("Esse mamífero não voa!");
        }
    }
    public void emitirSom(){
        System.out.println("O mamífero está emitindo seu som!");
    }
    
    
}
