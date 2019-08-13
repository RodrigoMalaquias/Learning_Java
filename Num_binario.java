/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num_binario;

import javax.swing.JOptionPane;

/**
 
 @author Rodrigo
 */
public class Num_binario {

    private int decimal;
    String resposta;
    
    public Num_binario (int decimal) {
        this.decimal = decimal;
        resposta = new String();
    }
    public int convint(){
        int bin;
        bin = Integer.parseInt(resposta);
        return bin;     
    }
    public int getconv(){
        while(decimal > 0){
            resposta = resposta+(decimal % 2);
            decimal = decimal / 2;
        }
        return convint();
    }
    
    public static void main(String[] args) {
       
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Qual número decimal você deseja converter?"));
        
         Num_binario binario1 = new Num_binario(pergunta); 
         binario1.getconv();
         
         JOptionPane.showMessageDialog(null, "Ele em binário é " + binario1.getconv());
    }
    
}
