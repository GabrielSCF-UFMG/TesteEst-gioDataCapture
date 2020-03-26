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
public class Ave extends Animal{
    
    private String corPena;
    private static boolean botaOvo = true;//todas e apenas as aves botam ovo!!
    
    public Ave(int idade, double tamanho, boolean voa,int altitude,String corPena){
        super(idade,tamanho,voa,altitude);//som,voa
        this.corPena = corPena;
        
    }
 
    //Métodos getters
    public String getCorPena() {return corPena;}
    public static boolean getBotaOvo() {return botaOvo;}
    
    
    //Métodos setters
    public void setCorPena(String corPena) {this.corPena = corPena;}
    public static void setBotaOvo(boolean botaOvo){Ave.botaOvo = botaOvo;}
    
    
    //Ações
    public void botarOvo(){
        
        if(getBotaOvo() == true){
            System.out.println("Essa ave está botando ovo!!");
        }else{
            System.out.println("Essa ave não bota ovo!!");
        }
    
    }
    public void voar(){
        if(super.getVoa() == true){
            System.out.println("A ave está voando!");
        }else{
            System.out.println("Essa ave não voa!");
        }
    }
    public void emitirSom(){
        System.out.println("A ave está emitindo seu som.");
    }
    
    
    
    
}
