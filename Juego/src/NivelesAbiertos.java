//Aqu? se importan las librer?as necesarias para la ejecuci?n del juego, en este caso, se usar?n las librer?as necesarias para usar SWING.
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

//PREGUNTA 1
public class NivelesAbiertos extends GeneralAbiertos implements ActionListener{
	public NivelesAbiertos() {
		super();
		PreguntaAbierta01();
	}
}