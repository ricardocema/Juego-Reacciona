import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	
	
	//En esta clase se encuentra lo necesario para el juego: preguntas, respuestas y botones.
	public class Final extends JFrame implements ActionListener{
		int ancho, alto;
		static JLabel Final;
		
		
		public Final(){ 
			/*A continuación se crea una ventana vacía*/
			setLayout(null);
			ancho=1000;
			alto=700;
			setBounds(0,0,ancho,alto);
			setResizable(false);
			setVisible(true);
			
		}
			/* En este método se crea el texto de la ventana final del juego */
			public void FinalJuego() {
			Final = new JLabel("Felicidades, has llegado al final del juego, obtuviste: " + General.puntaje + "puntos" + "," + GeneralAbiertos.intentos + " puntos de intento y respondiste " + General.correctas + "respuetas correctas" );
			Final.setBounds(750, 0, 200, 100);
			this.add(Final);
		}
			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}