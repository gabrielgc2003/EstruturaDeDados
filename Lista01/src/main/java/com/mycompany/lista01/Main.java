/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Main {

    public static void main(String[] args) {
       int exercicio = Integer.parseInt(JOptionPane.showInputDialog("Selecione o exercicio: "));
       
       switch(exercicio){
           case 1: 
               String [] vetor = new String[10];
               String concat = "";
               for(int i = 0; i < vetor.length ;i++){
                   vetor[i] = JOptionPane.showInputDialog("Preenchendo vetor na posição " + (i+1) + " : ");
                   concat = concat + "Pos " + (i+1) + ":" + vetor[i] + "\n";
               }
               JOptionPane.showMessageDialog(null, concat);
           break;
           
           case 2:
           break;
           
           case 3:
           break;
           
           case 4:
           break;
           
           case 5:
           break;
           
           case 6:
           break;
           
           case 7:
           break;
           
           case 8:
           break;
           
           case 9:
           break;
           
           
           
       }
    }
}
