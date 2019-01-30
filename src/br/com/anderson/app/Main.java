package br.com.anderson.app;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        double peso = 0.0, altura =  0.0;
        
        Scanner enter = new Scanner(System.in);
                
        System.out.println("Digite seu Peso: " + enter);
        peso = Double.parseDouble(enter.nextLine());
        
        System.out.println("Digite sua Altura:" + enter);
        altura = Double.parseDouble(enter.nextLine());
        
        System.out.println("Resultado do seu IMC: " + new DecimalFormat("#.##").format(peso / (altura * altura)));        
    }    
}
