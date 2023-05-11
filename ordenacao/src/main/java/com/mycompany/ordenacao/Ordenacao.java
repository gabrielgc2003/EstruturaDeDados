/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacao;

/**
 *
 * @author gabri
 */
public class Ordenacao {

    public static void main(String[] args) {
        int[] vetor = {30,20,10,40};
        
        int chave, j;
        for (int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            for(j = (i-1);  (j >= 0 && vetor[j] > chave); j--){
                System.out.println("\n" +vetor[j]);
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.println("\n" +vetor[i]);
        }
    }
}
