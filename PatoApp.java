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


public class PatoApp {
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);

        int idade;
        double tamanho;
        int altitude;
        String corPena;
        
        //Criando o pato 1
        System.out.println("DIGITE OS DADOS DO PATO");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Altitude que voa em metros:");
        altitude = cin.nextInt();
        System.out.println("Cor da pena:");
        corPena = cin.next();
        
        Pato pato1 = new Pato(idade,tamanho,altitude,corPena);
        //interagindo com o pato 1
        pato1.botarOvo();
        pato1.voar();
        pato1.botarOvo();
        
        //Criando o pato 2
        System.out.println("DIGITE OS DADOS DO PATO");
        System.out.println("Idade:");
        idade = cin.nextInt();
        System.out.println("Tamanho em centímetros:");
        tamanho = cin.nextFloat();
        System.out.println("Altitude que voa em metros:");
        altitude = cin.nextInt();
        System.out.println("Cor da pena:");
        corPena = cin.next();
        
        Pato pato2 = new Pato(idade,tamanho,altitude,corPena + "Brilhante");
        //interagindo com o pato 2
        pato1.botarOvo();
        pato1.voar();
        
        pato2.interfacePato();
        pato1.interfacePato();
        
    }
}
