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
public class VacaApp {
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int idade;
        double tamanho;
        String corPelo;
        
        //Criando a vaca 1
        System.out.println("DIGITE OS DADOS DA VACA");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Cor do pelo:");
        corPelo = cin.next();
        
        Vaca vaca1 = new Vaca(idade,tamanho,corPelo);
        //interagindo com a vaca 1
        vaca1.amamentar();
        vaca1.amamentar();
        
        
        //Criando a vaca 2
        System.out.println("DIGITE OS DADOS DA VACA");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Cor do pelo:");
        corPelo = cin.next();
        
        Vaca vaca2 = new Vaca(idade,tamanho,corPelo + " Elegante");
        //interagindo com a vaca 2
        vaca2.amamentar();
        
        
        vaca1.interfaceVaca();
        vaca2.interfaceVaca();
        
    }
    
}
