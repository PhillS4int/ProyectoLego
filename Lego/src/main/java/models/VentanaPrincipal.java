package models;
import com.mycompany.lego.login.Bienvenida;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Felipe
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    //VARIABLES
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo ;
    private JMenuItem miCalculo, miAzul, miNaranja, miVerde, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,label1Apellido,label2Apellido,
            labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
    private JTextField txtNombreTrabajador,txt1Apellido,txt2Apellido;
    private JComboBox<String> comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAdministrador = "";
    
    //CONSTRUCTOR:
    public VentanaPrincipal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Termina la operación del programa al cerrar la ventana.
        setTitle("Ventana principal");
        getContentPane().setBackground(new Color(0,108,183));
        Image im = Toolkit.getDefaultToolkit().getImage("images/lego.png");
        setIconImage(im);
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.texto;
        
        //BARRA DE MENÚ
        mb = new JMenuBar();
        mb.setBackground(new Color(0,108,183));
        setJMenuBar(mb);
        
        //MENÚ OPCIONES
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(Color.WHITE);
        menuOpciones.setFont(new Font("arial",1,14));
        menuOpciones.setForeground(Color.WHITE);
        mb.add(menuOpciones);
        
        //MENÚ CALCULAR
        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(0,0,0));
        menuCalcular.setFont(new Font("arial",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);
        
        //MENÚ ACERCA DE
        menuAcercaDe = new JMenu("A cerca de");
        menuAcercaDe.setBackground(new Color(0,0,0));
        menuAcercaDe.setFont(new Font("arial",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);
        
        //MENÚ CAMBIAR COLOR DE FONDO
        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("arial",1,14));
        menuColorFondo.setForeground(new Color(0,0,0));
        menuOpciones.add(menuColorFondo);
        
        //MENÚ CÁLCULO DE VACACIONES
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("arial",1,14));
        miCalculo.setForeground(new Color(0,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);
        
        //ÍTEMS DEL CAMBIO DE COLORES EN LA INTERFAZ.
        
        //Azul
        miAzul = new JMenuItem("Azul");
        miAzul.setFont(new Font("arial",1,14));
        miAzul.setForeground(new Color(0,0,0));
        menuColorFondo.add(miAzul);
        miAzul.addActionListener(this);
        
        //Verde
        miVerde = new JMenuItem("Verde");
        miVerde.setFont(new Font("arial",1,14));
        miVerde.setForeground(new Color(0,0,0));
        menuColorFondo.add(miVerde);
        miVerde.addActionListener(this);
        
        //Naranja
        miNaranja = new JMenuItem("Naranja");
        miNaranja.setFont(new Font("arial",1,14));
        miNaranja.setForeground(new Color(0,0,0));
        menuColorFondo.add(miNaranja);
        miNaranja.addActionListener(this);
        
        //NUEVO
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("arial",1,14));
        miNuevo.setForeground(new Color(0,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
        //EL CREADOR
        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("arial",1,14));
        miElCreador.setForeground(new Color(0,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);
        
        //SALIR
        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("arial",1,14));
        miSalir.setForeground(new Color(0,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        
        //******L A B E L S***********
        
        //Label Icono
        ImageIcon imagen = new ImageIcon("images/lego.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 85, 85);
        add(labelLogo);
        
        //Label Bienvenido
        labelBienvenido = new JLabel("Bienvenido (a) " + nombreAdministrador);
        labelBienvenido.setBounds(210, 30, 300, 50);
        labelBienvenido.setFont(new Font("arial",1,25));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);
        
        //Label descripción de la ventana
        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones.");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("arial",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);
        
        //Label nombres completos
        labelNombre = new JLabel("Nombres completos:");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("arial",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);
        
        //Campo de texto para el nombre del trabajador
        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new java.awt.Color(255,255,255));
        txtNombreTrabajador.setFont(new java.awt.Font("arial", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNombreTrabajador);
        
        //Primer apellido
        label1Apellido = new JLabel("Primer apellido:");
        label1Apellido.setBounds(25,248,180,25);
        label1Apellido.setFont(new Font("arial", 1, 12));
        label1Apellido.setForeground(new Color(255, 255, 255));
        add(label1Apellido);
        
        txt1Apellido = new JTextField();
        txt1Apellido.setBounds(25,273,150,25);
        txt1Apellido.setBackground(new java.awt.Color(255,255,255));
        txt1Apellido.setFont(new java.awt.Font("arial", 1, 14));
        txt1Apellido.setForeground(new java.awt.Color(0, 0, 0));
        add(txt1Apellido);
        
        //Segundo apellido
        label2Apellido = new JLabel("Segundo apellido:");
        label2Apellido.setBounds(25,308,180,25);
        label2Apellido.setFont(new Font("arial", 1, 12));
        label2Apellido.setForeground(new Color(255, 255, 255));
        add(label2Apellido);
        
        txt2Apellido = new JTextField();
        txt2Apellido.setBounds(25,334,150,25);
        txt2Apellido.setBackground(new java.awt.Color(255,255,255));
        txt2Apellido.setFont(new java.awt.Font("arial", 1, 14));
        txt2Apellido.setForeground(new java.awt.Color(0, 0, 0));
        add(txt2Apellido);
        
        //DEPARTAMENTO 
        labelDepartamento = new JLabel("Selecciona el departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("arial",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);
        
        comboDepartamento = new JComboBox<>();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new java.awt.Color(255,255,255));
        comboDepartamento.setFont(new java.awt.Font("arial",1,14));
        comboDepartamento.setForeground(new java.awt.Color(0,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al cliente");
        comboDepartamento.addItem("Departamento de logística");
        comboDepartamento.addItem("Departamento de gerencia");
        
        //ANTIGUEDAD (AÑOS DE TRABAJO)
        labelAntiguedad = new JLabel("Selecciona años de trabajo:");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("arial",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);
        
        comboAntiguedad = new JComboBox<>();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(255,255,255));
        comboAntiguedad.setFont(new java.awt.Font("arial",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(0,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 o más años de servicio");
        
        //MOSTRAR EL RESULTADO DEL CÁLCULO
        labelResultado = new JLabel("Resultado del cálculo:");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("arial",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setFont(new Font("arial",1,11));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setText("\n Este es el resultado del cálculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220, 333, 385, 90);
        add(scrollpane1);
        
        //PIE DE PÁGINA CON DERECHOS RESERVADOS (FOOTER)
        labelFooter = new JLabel("©2022 The LEGO Group | Todos los derechos reservados.");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new java.awt.Font("arial",1,12));
        labelFooter.setForeground(new java.awt.Color(255,255,255));
        add(labelFooter);       
    }
    
    //ACCIÓN EJECUTADA
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == miCalculo){//Ejecuta toda la funcionalidad de la pestaña "Vacaciones".
            String nombreTrabajador = txtNombreTrabajador.getText();
            String A1 = txt1Apellido.getText();
            String A2 = txt2Apellido.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if(nombreTrabajador.equals("") || A1.equals("") || A2.equals("") ||
                    Departamento.equals("") || Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
                
            }else{
                //DPTO. DE ATENCIÓN AL CLIENTE
                if(Departamento.equals("Atención al cliente")){
                    if(Antiguedad.equals("1 año de servicio")){//1 Año de servicio.
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en " + Departamento + " con " + Antiguedad +
                                          "\n recibe 6 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){//2 a 6 años de servicio.
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en " + Departamento + " con " + Antiguedad +
                                          "\n recibe 14 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o más años de servicio")){//7 años o más.
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en " + Departamento + " con " + Antiguedad +
                                          "\n recibe 20 días de vacaciones.");
                    }
                }
                //DPTO. DE LOGÍSTICA
                if(Departamento.equals("Departamento de logística")){
                    if(Antiguedad.equals("1 año de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 7 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 15 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o más años de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 22 días de vacaciones.");
                    }
                }
                //DPTO. DE GERENCIA
                if(Departamento.equals("Departamento de gerencia")){
                    if(Antiguedad.equals("1 año de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 10 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 20 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o más años de servicio")){
                        textarea1.setText("\n El/La trabajador (a) " + nombreTrabajador + " " + A1 + " " + A2 +
                                          "\n quien labora en el " + Departamento + " con " + Antiguedad +
                                          "\n recibe 30 días de vacaciones.");
                    }
                }
                
            }
        }
        //CAMBIO DE COLOR EN LA INTERFAZ
        
        //INTERFAZ DE COLOR AZUL
        if(e.getSource() == miAzul){
            getContentPane().setBackground(new Color(0,108,183));            
        }
        //INTERFAZ DE COLOR NARANJA
        if(e.getSource() == miNaranja){
            getContentPane().setBackground(new Color(238,117,0));        
        }
        //INTERFAZ DE COLOR VERDE
        if(e.getSource() == miVerde){
            getContentPane().setBackground(new Color(0,150,62));            
        }
        //MÉTODO PARA LIMPIAR LOS CAMPOS Y AÑADIR INFORMACIÓN NUEVA
        if(e.getSource() == miNuevo){
            txtNombreTrabajador.setText("");
            txt1Apellido.setText("");
            txt2Apellido.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");            
        }
        if(e.getSource() == miSalir){            
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null, "Desarrollado por Luis Felipe Santamaría D.\n"+ 
                                                "              (El Conde Santa)");
            
        }
    }
}
