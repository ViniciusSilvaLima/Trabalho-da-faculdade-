/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystical.figtrigom;
import javax.swing.JOptionPane;
import com.mystical.triangulo;
/**
 *
 * @author VINICIUSSILVALIMA
 */
public class principal {
    
    public static void main(String[] args){
        triangulo x = new triangulo();
        triangulo y = new triangulo();
        x.a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
        x.b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
        x.c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor C: "));
        
        y.a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
        y.b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
        y.c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor c: "));
        
        double pY = (x.a+x.b+x.c)/2;
        double areaY = Math.sqrt(pY*(pY-y.a)*(pY-y.b)*(pY-y.c));
        
        double pX = (x.a+x.b+x.c)/2;
        double areaX = Math.sqrt(pX*(pX-x.a)*(pX-x.b)*(pX-x.c));
        
        if(areaX>areaY){
            JOptionPane.showConfirmDialog(null,"A maior area é a x" + areaX);
        }
        else if(areaY>areaX){
            JOptionPane.showConfirmDialog(null,"A maior area é a y" + areaY);
        }
        else{
             JOptionPane.showConfirmDialog(null,"As areas são iguais");
        }
            
    }
}
