/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lição2;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Lição2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = sc.nextLine();

        System.out.println("digite o nome da sua escola");
        String escola = sc.nextLine();
        double média = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("digite sua nota");

            while (true) {

                nota = sc.nextInt();
                if (nota >= 0 && nota <= 10) {
                    break;
                }

            }

            média = média + nota;

        }
        System.out.println("sua média é " + média / 6);

    }
}
