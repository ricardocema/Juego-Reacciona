import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
	
	//En esta clase se encuentra lo necesario para el juego: preguntas, respuestas y botones.
	public class Retos extends JFrame implements ActionListener{
		
		//Se crean los botones necesarios para las ventanas de los juegos de reto
		protected JButton BotonVerificar;
		protected int alto, ancho;
		//Se crean 5 cuadros de texto en los cuales el usuario podr� escribir la letra para tratar de completar la palabra
		JTextField Letra1, Letra2, Letra3, Letra4, Letra5;
		
		
		public Retos(){ 
			/*A continuaci�n se crea una ventana vac�a*/
			setLayout(null);
			ancho=1000;
			alto=700;
			setBounds(0,0,ancho,alto);
			setTitle("REACCIONA");
			getContentPane().setBackground(new Color(204,51,153));
			setResizable(false);
			setVisible(true);
			
			//A continuaci�n se crean el bot�n de verificar
			//Se agrega un texto que estar� contenido en el bot�n
			BotonVerificar= new JButton("Verificar");
			//Se define la posici�n y las dimensiones del bot�n
			BotonVerificar.setBounds(35,500,100,40);
			//Se usa el evento ActionListener al bot�n
			BotonVerificar.addActionListener(this);
			//Se agrega el bot�n a la ventana
			this.add(BotonVerificar);
			
			//Se crea un texto que estar� presente en todas y cada una de las ventanas
			JLabel PreguntaR1 = new JLabel("Completa la palabra: ");
			//Se define la posici�n y las dimensiones de lal texto
			PreguntaR1.setBounds(45, 45, 650, 40);
			//Se le da una fuente y un tama�o al texto
			PreguntaR1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			//Se agrega la pregunta a la ventana
			this.add(PreguntaR1);
			
		}
		//A continuaci�n se crean las preguntas de reto. Solo se comentar� la primera de ellas ya que las dem�s siguen la misma l�gica
		public void PreguntaReto01() {
			//Se crea el texto de la primera pregunta
			JLabel PistaR1 = new JLabel("Pista: Es el primer elemento de la tabla peri�dica: ");
			PistaR1.setBounds(45, 90, 650, 40);
			PistaR1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PistaR1);
			//Aqu� se crea un texto que contiene la letra H
			JLabel LetraC1 = new JLabel("H");
			LetraC1.setBounds(45, 300, 40, 40);
			LetraC1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC1);
			
			//Aqu� se crea un espacio para que el jugador escriba la letra correspondiente
			Letra1 = new JTextField();
			Letra1.setBounds(70, 300, 40, 40);
			Letra1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra1);
			
			//Aqu� se crea un texto con la letra D
			JLabel LetraC2 = new JLabel("D");
			LetraC2.setBounds(120, 300, 40, 40);
			LetraC2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC2);
			
			//Aqu� se crea un espacio para que el jugador escriba la letra correspondiente
			Letra2 = new JTextField();
			Letra2.setBounds(150, 300, 40, 40);
			Letra2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra2);
			
			//Aqu� se crea un espacio para que el jugaro escriba la letra correspondiente
			Letra3 = new JTextField();
			Letra3.setBounds(200, 300, 40, 40);
			Letra3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra3);
			
			//Aqu� se crea un texto con la letra G
			JLabel LetraC3 = new JLabel("G");
			LetraC3.setBounds(240, 300, 40, 40);
			LetraC3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC3);

			//Aqu� se crea un espacio para que el jugaro escriba la letra correspondiente
			Letra4 = new JTextField();
			Letra4.setBounds(260, 300, 40, 40);
			Letra4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra4);
			
			//Aqu� se crea un espacio para que el jugaro escriba la letra correspondiente
			Letra5 = new JTextField();
			Letra5.setBounds(310, 300, 40, 40);
			Letra5.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra5);
			
			//Aqu� se crea un texto con la letra O
			JLabel LetraC4 = new JLabel("O");
			LetraC4.setBounds(350, 300, 40, 40);
			LetraC4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC4);			
		}
		
		//Aqu� se crea la segunda pregunta de Reto
		public void PreguntaReto02() {
			
			JLabel PistaR1 = new JLabel("Pista: Es la uni�n de o m�s �tomos: ");
			PistaR1.setBounds(45, 90, 650, 40);
			PistaR1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PistaR1);
			
			JLabel LetraC1 = new JLabel("M");
			LetraC1.setBounds(45, 300, 40, 40);
			LetraC1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC1);
			
			Letra1 = new JTextField();
			Letra1.setBounds(70, 300, 40, 40);
			Letra1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra1);
			
			JLabel LetraC2 = new JLabel("L");
			LetraC2.setBounds(120, 300, 40, 40);
			LetraC2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC2);
			
			Letra2 = new JTextField();
			Letra2.setBounds(150, 300, 40, 40);
			Letra2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra2);
			
			Letra3 = new JTextField();
			Letra3.setBounds(200, 300, 40, 40);
			Letra3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra3);
			
			JLabel LetraC3 = new JLabel("U");
			LetraC3.setBounds(240, 300, 40, 40);
			LetraC3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC3);

			Letra4 = new JTextField();
			Letra4.setBounds(260, 300, 40, 40);
			Letra4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra4);
			
			JLabel LetraC4 = new JLabel("A");
			LetraC4.setBounds(300, 300, 40, 40);
			LetraC4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC4);			
		}
		//Aqu� se crea la tercera pregunta de Reto
		public void PreguntaReto03() {
			JLabel PistaR1 = new JLabel("Pista: Part�cula con carga negativa: ");
			PistaR1.setBounds(45, 90, 650, 40);
			PistaR1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PistaR1);
			
			JLabel LetraC1 = new JLabel("E");
			LetraC1.setBounds(45, 300, 40, 40);
			LetraC1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC1);
			
			Letra1 = new JTextField();
			Letra1.setBounds(70, 300, 40, 40);
			Letra1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra1);
			
			JLabel LetraC2 = new JLabel("E");
			LetraC2.setBounds(120, 300, 40, 40);
			LetraC2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC2);
			
			Letra2 = new JTextField();
			Letra2.setBounds(150, 300, 40, 40);
			Letra2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra2);
			
			Letra3 = new JTextField();
			Letra3.setBounds(200, 300, 40, 40);
			Letra3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra3);
			
			JLabel LetraC3 = new JLabel("R");
			LetraC3.setBounds(240, 300, 40, 40);
			LetraC3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC3);

			Letra4 = new JTextField();
			Letra4.setBounds(260, 300, 40, 40);
			Letra4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Letra4);
			
			JLabel LetraC4 = new JLabel("N");
			LetraC4.setBounds(300, 300, 40, 40);
			LetraC4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(LetraC4);	
		}
		
		
		
		


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}