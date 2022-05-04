package com.mycompany.lego;
import TerminosYCondiciones.TerminosCondiciones;
import com.mycompany.lego.login.Bienvenida;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import models.VentanaPrincipal;

/**
 *
 * @author Felipe
 */
public class Main {
    public static void main(String[] args){
        
        //VENTANA DEL LOGIN (BIENVENIDA):
	Bienvenida ventanabienvenida = new Bienvenida();
	ventanabienvenida.setBounds(0,0,350,450);
	ventanabienvenida.setVisible(true);
	ventanabienvenida.setResizable(false);
	ventanabienvenida.setLocationRelativeTo(null);
        
        //VENTANA DE TÉRMINOS Y CONDICIONES:
//        TerminosCondiciones ventanalicencia = new TerminosCondiciones();
//        ventanalicencia.setBounds(0, 0, 600, 370);
//        ventanalicencia.setVisible(true);
//        ventanalicencia.setResizable(false);
//        ventanalicencia.setLocationRelativeTo(null);
//        
        //VENTANA PRINCIPAL:
//        VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
//        ventanaprincipal.setBounds(0, 0, 640, 540);
//        ventanaprincipal.setVisible(true);
//        ventanaprincipal.setResizable(false);
//        ventanaprincipal.setLocationRelativeTo(null);
        
    }
}
    
  
  

