package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] cisla= new int[10];
        Scanner num= new Scanner(System.in);
        System.out.println("Zadajte 10 cisel: ");
        for(int i=0; i<cisla.length; i++){
            cisla[i]=num.nextInt();
        }
        System.out.print("Zadane cisla: ");
        for(int j=0; j<cisla.length; j++){
            System.out.print(cisla[j]+" ");
        }
    }
}