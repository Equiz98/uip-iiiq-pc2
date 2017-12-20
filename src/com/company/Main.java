package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("Ingresa año que desea saber si es bisiesto: ");
        ano = sc.nextInt();
        if((ano % 4 == 0 && ano % 400 == 0)){
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }
	// write your code here
    }
}
