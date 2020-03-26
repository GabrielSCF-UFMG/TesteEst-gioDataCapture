/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazendinha;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class GalinhaApp {
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int idade;
        double tamanho;
        String corPena;
        
        //Criando a galinha 1
        System.out.println("DIGITE OS DADOS DA GALINHA");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Cor da pena:");
        corPena = cin.next();
        
        Galinha galinha1 = new Galinha(idade,tamanho,corPena);
        //interagindo com a galinha 1
        galinha1.botarOvo();
        galinha1.botarOvo();
        
        //Criando a galinha2
        System.out.println("DIGITE OS DADOS DA GALINHA ");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Cor da pena:");
        corPena = cin.next();
        
        Galinha galinha2 = new Galinha(idade,tamanho,corPena + " Brilhante");
        galinha2.botarOvo();
        //interagindo com a galinha 2
        galinha1.interfaceGalinha();
        galinha2.interfaceGalinha();
        
    }
    
}
