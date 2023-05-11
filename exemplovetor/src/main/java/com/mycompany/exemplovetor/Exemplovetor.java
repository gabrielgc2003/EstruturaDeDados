/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetor;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Exemplovetor {

    public static void main(String[] args) {
        int n = 8, m =2 ;
        String vetorNomes[][] = new String[m][n];
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                vetorNomes[j][i] = "Olá " + j + "  " + i;
            }
        }
        JOptionPane.showMessageDialog(null, vetorNomes);
    }
}
