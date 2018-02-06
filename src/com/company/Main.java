package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int eil;
        int stulp;
        System.out.println("Iveskite eiluciu kieki: ");
        eil = in.nextInt();
        System.out.println("Iveskite stulpeliu kieki: ");
        stulp = in.nextInt();

        for (int i = 0; i < eil; i++){
            //System.out.print("0");
            for (int j = 0; j < stulp; j++){
                if (i == j){
                    System.out.print("  0");
                }
                else {
                    System.out.print("  #");
                }

            }

            System.out.println();
        }
    }
}
