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
public class MorcegoApp {
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int idade;
        double tamanho;
        int altitude;
        String corPelo;
        
        
        //Criando o morcego 1
        System.out.println("DIGITE OS DADOS DO MORCEGO");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Altitude que voa em metros:");
        altitude = cin.nextInt();
        System.out.println("Cor do pelo:");
        corPelo = cin.next();
        
        Morcego morcego1 = new Morcego(idade,tamanho,altitude,corPelo);
        //interagindo com o morcego 1
        morcego1.amamentar();
        morcego1.amamentar();
        morcego1.voar();
        morcego1.voar();
        
        //Criando o morcego 2
        System.out.println("DIGITE OS DADOS DO MORCEGO");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Altitude que voa em metros:");
        altitude = cin.nextInt();
        System.out.println("Cor do pelo:");
        corPelo = cin.next();
        
        Morcego morcego2 = new Morcego(idade,tamanho,altitude,corPelo + " Escuro");
        //interagindo com o morcego 2
        morcego2.amamentar();
        morcego2.voar();
        
        
        morcego1.interfaceMorcego();
        morcego2.interfaceMorcego();
        
    }
    
}
