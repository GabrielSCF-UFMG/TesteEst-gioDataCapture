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
public class Vaca extends Mamífero{
    
    private static int amamentos = 0;
    private int thisAmamentos = 0;
    
    public Vaca(int idade, double tamanho,String corPelo){
        super(idade,tamanho,false,0,corPelo);
    }

    //Getters
    public static int getAmamentos() {return amamentos;}
    public int getThisAmamentos() {return thisAmamentos;}
    //Setters
    public static void setAmamentos(int amamentos) {Vaca.amamentos = amamentos;}
    public void setThisAmamentos(int thisAmamentos) {this.thisAmamentos = thisAmamentos;}
    
    //Interface
    public void interfaceVaca(){
        System.out.println("*****INTERFACE DA VACA*****");
        System.out.println("O som emitido pela vaca é um 'mugido'!");
        System.out.println("A vaca voa? "+ getVoa());
        System.out.println("A idade da vaca é "+ getIdade()+" anos!");
        System.out.println("O tamanho da vaca é "+ getTamanho() + " centimetros!");
        System.out.println("A cor do pelo da vaca é "+getCorPelo());
        //Amamentação
        System.out.println("Essa vaca amamentou "+getThisAmamentos()+" vezes!");
        System.out.println("Todas as vacas amamentaram "+getAmamentos()+" vezes!");
        
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
            System.out.println("A vaca está voando, pera, como assim?!");
        }else{
            System.out.println("Essa cava não voa!(Ainda bem...)");
        }
    }
    public void emitirSom(){
        System.out.println("A vaca está 'mugindo': 'Muuuh'!!");
    }
}
