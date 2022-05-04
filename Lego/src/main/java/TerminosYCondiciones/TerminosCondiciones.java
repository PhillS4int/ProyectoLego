package TerminosYCondiciones;
import com.mycompany.lego.login.Bienvenida;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import models.VentanaPrincipal;

/**
 *
 * @author Felipe
 */
public class TerminosCondiciones extends JFrame implements ActionListener, ChangeListener{
    
  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;
  String nombre = "";
    
    //CONSTRUCTOR:
    public TerminosCondiciones(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Termina la ejecución del programa al cerrar la ventana.
        setTitle("Licencia de uso");
        Image im = Toolkit.getDefaultToolkit().getImage("images/lego.png");
        setIconImage(im);
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.texto;
        
        //TÍTULO DE TÉRMINOS Y CONDICIONES
        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("arial",1,14));
        label1.setForeground(Color.BLACK);
        add(label1);
        
        //Área de texto de los términos y condiciones:
        textarea1 = new JTextArea();
        textarea1.setEditable(false);//Con "false" no deja editar el texto dentro del área de texto.
        textarea1.setFont(new Font("LEGOChalet60-Regular",0,9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE EL CONDE SANTA." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  EL CONDE SANTA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (EL CONDE SANTA), NO SE HACE RESPONSABLE DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.legostore.com.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 560, 200);
        add(scrollpane1);
        
        //CASILLA DE VERIFICACIÓN:
        check1 = new JCheckBox("Yo " + nombre + " he leído y acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        //BOTÓN 1 "CONTINUAR":
        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
        
        //BOTÓN 2 "NO ACEPTO"
        boton2 = new JButton("No acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
        
        //IMAGEN DEL LADO DERECHO
        ImageIcon imagen = new ImageIcon("images/lego.png");
        label2 = new JLabel(imagen); 
        label2 = new JLabel((Icon) imagen);
        label2.setBounds(484, 243, 85, 85);
        add(label2);
        
    }
    
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
            ventanaprincipal.setBounds(0, 0, 640, 540);
            ventanaprincipal.setVisible(true);
            ventanaprincipal.setResizable(false);
            ventanaprincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if(e.getSource() == boton2){
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }        
    }
}
