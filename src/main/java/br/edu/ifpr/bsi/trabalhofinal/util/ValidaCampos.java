/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.trabalhofinal.util;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Gabis
 */
public class ValidaCampos {
    public boolean validaTextField(JTextField campo, 
            String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
}
