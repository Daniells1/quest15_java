/*
Criar um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da
semana correspondente. Caso o usuário digite um número fora desse intervalo,
imprimir mensagem que não existe dia da semana com esse número.

 */

package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Dígite um número de 1 a 7");
            int numero = scanner.nextInt();
            switch(numero){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;

                default:
                    System.out.println("Não existe dia da semana com o número inserido");

            }
        }

}
