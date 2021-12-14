import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Instrucciones extends JFrame {
	static JLabel imagen1;
	protected int ancho,alto;
	public Instrucciones() {
	setLayout(null);
	ancho=1000;
	alto=700;
	setBounds(0,0,ancho,alto);
	setResizable(false);
	}
	public void Instruccion1(){
		JLabel imagen1 = new JLabel();
		imagen1.setIcon(null);
		
	}
}