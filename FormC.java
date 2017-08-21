/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class FormC extends JFrame implements ActionListener {
    public Image _imagenFondo;
    public URL _fondo;
    private JFrame _ventana;
    private JTextField _num1 ,_num2 ,num3, _resul1 , _resul2 , _resul3 , _resul4,num4 ;
    private JButton _salir,_obtener;
    private Container _cont;
    private JLabel _titulo,_enum1 , _ins , _re , _enum2 , _sig1 , _sig2 , _sig3, _enum3;
    Panel p;
    
    public FormC(){
        _ventana= new JFrame("Binomio al Cuadrado");
        _ventana.setBounds(400, 100, 600, 450);
        _ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _ventana.setLocationRelativeTo(null);
        _ventana.setResizable(false);
        _ventana.setLayout(null);
        _ventana.setContentPane(new JLabel(new ImageIcon("3.jpg")));
        _cont= _ventana.getContentPane();
        
        
    }
    private void componentes(){
        _titulo= new JLabel("Formulario");
        _titulo.setBounds(200, 40, 300, 30);
        _titulo.setForeground(Color.white);
        _titulo.setFont( new Font("Cambria Math", Font.BOLD, 20));
        _cont.add(_titulo);
        
        _ins= new JLabel("Ingrese sus datos");
        _ins.setBounds(150, 90, 600, 30);
        _ins.setForeground(Color.white);
        _ins.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_ins);
        
        _enum1= new JLabel("Nombre");
        _enum1.setBounds(110, 150, 300, 30);
        _enum1.setForeground(Color.white);
        _enum1.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_enum1);
        
        _num1= new JTextField(1);
        _num1.setBounds(330, 150, 200, 30);
        _cont.add(_num1);
        _num1.addActionListener(this);
       
        _enum2= new JLabel("Ap P.");
        _enum2.setBounds(110, 200, 300, 30);
        _enum2.setForeground(Color.white);
        _enum2.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_enum2);
        
        _num2= new JTextField(1);
        _num2.setBounds(330, 200, 200, 30);
        _cont.add(_num2);
        _num2.addActionListener(this);
        
        _enum2= new JLabel("Ap m.");
        _enum2.setBounds(110, 250, 300, 30);
        _enum2.setForeground(Color.white);
        _enum2.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_enum2);
        
        num3= new JTextField(1);
        num3.setBounds(330, 250, 200, 30);
        _cont.add(num3);
        num3.addActionListener(this);
        
          _enum3= new JLabel("Escuela");
        _enum3.setBounds(110, 300, 300, 30);
        _enum3.setForeground(Color.white);
        _enum3.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_enum3);
        
        num4= new JTextField(1);
        num4.setBounds(330, 300, 200, 30);
        _cont.add(num4);
        num4.addActionListener(this);
        
        _obtener= new JButton();
        _obtener.setBounds(250, 350, 100, 40);
        _obtener.setText("<html><font face=Cambria Math> Guardar </font></html>");
        _obtener.addActionListener(this);
        _cont.add(_obtener);
        
        _salir= new JButton();
        _salir.setBounds(400, 350, 100, 40);
        _salir.setText("<html><font face=Cambria Math>Salir</font></html>");
        _salir.addActionListener(this);
        _cont.add(_salir);
    }
    
    public void prendeApaga(Boolean prendeApaga){
        componentes();
        _ventana.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== _salir){
            JOptionPane.showMessageDialog(this, "Gracias Por Usarme :)");
            System.exit(0);
        }
        /*else
        {
            if(e.getSource()== _obtener)
            {
                String num1 = _num1.getText();
                String num2 = _num2.getText();
                long num = Integer.parseInt(num1);
                long nume = Integer.parseInt(num2);
                long res1 = num*num;
                long res2 = 2*(num*nume);
                long res3 = nume*nume;
                _resul1.setText(Long.toString(res1));
                
                _resul2.setText(Long.toString(res2));
                
                _resul3.setText(Long.toString(res3));
                
                _resul4.setText(Long.toString(res1 + res2 + res3));
            }*/
                
        }
    }
    
}
