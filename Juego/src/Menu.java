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

public class Menu extends JFrame {
	
	// En esta seccion se crea el cuadro de texto y el espacio para escribir el nombre, además de la variable nombre, la cual almacenará los caracteres introducidos por el usuario

	private JPanel contentPane;
	private JTextField textFieldNombre;
	static String Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("REACCIONA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Aquí se agrega el título del juego"
		JLabel JLabelTitulo = new JLabel(" BIENVENIDO A REACCIONA!");
		JLabelTitulo.setForeground(new Color(255, 255, 0));
		JLabelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		JLabelTitulo.setBounds(230, 11, 450, 50);
		contentPane.add(JLabelTitulo);
		
		//Aquí se agrega el texto que nos pide introducir el nombre
		JLabel lblNewLabel = new JLabel("Introduce tu nombre\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(25, 126, 238, 37);
		contentPane.add(lblNewLabel);
		
		//Aquí se agrega el espacio para introducir el nombre
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(277, 126, 421, 37);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		//Aquí se agrega el botón para iniciar el juego
		JButton btnNewButton = new JButton("JUGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame MenuJuego=new Menu();
				//Se cierra la ventana menu para dar inicio al juego
				MenuJuego.setVisible(false);
				//La variable nombre almacena el valor introducido por el usuario
				Nombre=textFieldNombre.getText().trim();
				JOptionPane.showMessageDialog(null, "Bienvenido al juego " + Nombre);
				//Se crea el Nivel 1, que es el nivel inicial del juego
				JFrame Nivel1= new Nivel();
				//Se hace visible la ventana Nivel1
				Nivel1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(313, 283, 142, 44);
		contentPane.add(btnNewButton);
	}
}
