package com.mycompany.lego.login;
import TerminosYCondiciones.TerminosCondiciones;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Felipe
 */
public class Bienvenida extends JFrame implements ActionListener {
 
	private JTextField textfield1;
	private JLabel label1, label2, label3, label4;
	private JButton boton1;
        public static String texto = "";
	
	public Bienvenida(){
	  setLayout(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);//Termina el proceso de ejecución del programa.
          
	  setTitle("Bienvenido (a)");
	  getContentPane().setBackground(new Color(0,108,183));
          Image im = Toolkit.getDefaultToolkit().getImage("images/lego.png");
          setIconImage(im);
                  
          label1 = new JLabel();
          label1.setIcon(new ImageIcon("images/lego.png"));
	  label1.setBounds(125,35,85,85);
	  add(label1);

	  label2 = new JLabel("Sistema de control vacacional");
	  label2.setBounds(45,155,300,30);
	  label2.setFont(new Font("arial",1,18));
	  label2.setForeground(new Color(255,255,255));
	  add(label2);
	  
 	  label3 = new JLabel("Ingresa tu nombre:");
	  label3.setBounds(45,200,200,30);
	  label3.setFont(new Font("LEGOChalet60-Light", 1, 14));
	  label3.setForeground(new Color(255,255,255));
	  add(label3);
	  
	  label4 = new JLabel("©2022 The LEGO Group.");
	  label4.setBounds(115,375,300,30);
	  label4.setFont(new Font("LEGOChalet60-Regular",1,10) {
          });
	  label4.setForeground(new Color(255,255,255));
	  add(label4);
	  
          //CAMPO DE TEXTO DEL NOMBRE:
	  textfield1 = new JTextField();
	  textfield1.setBounds(45,240,255,25);
	  textfield1.setBackground(new Color(255,255,255));
	  textfield1.setFont(new Font("LEGOChalet60-Regular", 1, 12));
	  textfield1.setForeground(new Color(0,0,0));
	  add(textfield1);
	  
	  //DISEÑO DEL BOTÓN
	  boton1 = new JButton("Ingresar");
	  boton1.setBounds(125,280,100,30);
	  boton1.setBackground(new Color(255,213,0));
	  boton1.setFont(new Font("LEGOChalet60-Regular", 1, 14));
	  boton1.setForeground(new Color(0,108,183));
	  boton1.addActionListener(this);
	  add(boton1);       
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            texto = textfield1.getText().trim();//El método ".trim()" borra los espacios.
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            }else{
                TerminosCondiciones ventanalicencia = new TerminosCondiciones();
                ventanalicencia.setBounds(0, 0, 600, 370);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
}

