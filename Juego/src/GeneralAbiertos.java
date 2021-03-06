import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
	
	//En esta clase se encuentra lo necesario para el juego: Cuadros de texto:
	public class GeneralAbiertos extends JFrame implements ActionListener{
		
		JTextField Respuesta;
		protected JButton BotonComprobar, BotonConseguir;
		static JButton BotonReto;
		protected int alto, ancho;
		static String Respuesta01="Ox?geno";
		static String Respuesta021="Helio", Respuesta022="Ne?n", Respuesta023="Arg?n", Respuesta024="Xen?n", Respuesta025="Kript?n", Respuesta026="Rad?n";
		static String Respuesta031="-273.15", Respuesta032="-273", Respuesta033="-273.15K", Respuesta034="-273K", Respuesta035="-273.15 K", Respuesta036="-273 K";
		static int intentos=3;
		static JLabel pregunta;

		
		
		public GeneralAbiertos(){ 
			/*A continuaci?n se crea una ventana vac?a*/
			setLayout(null);
			ancho=1000;
			alto=700;
			setBounds(0,0,ancho,alto);
			setTitle("REACCIONA");
			getContentPane().setBackground(new Color(204,51,153));
			setResizable(false);
			setVisible(true);
			
			//Aqu? se crea el bot?n para comprobar el texto de la pregunta abierta
			BotonComprobar= new JButton("Comprobar");
			BotonComprobar.setBounds(35,500,100,40);
			BotonComprobar.addActionListener(this);
			this.add(BotonComprobar);
			
			//Aqu? se crea el bot?n para intercambiar puntos por puntos de intento			
			BotonConseguir = new JButton("Conseguir Puntos de intento");
			BotonConseguir.setBounds(400, 500, 200, 40);
			BotonConseguir.addActionListener(this);
			this.add(BotonConseguir);
			
			//Aqu? se crea el bot?n para realizar un reto y obtener puntos de intento			
			BotonReto = new JButton("Realizar reto");
			BotonReto.setBounds(620, 500, 200, 40);
			BotonReto.addActionListener(this);
			this.add(BotonReto);
						
			
			//Aqu? se crea el espacio para que el jugador introduzca la respuesta a la pregunta
			Respuesta = new JTextField();
			Respuesta.setBounds(135, 500, 200, 40);
			Respuesta.addActionListener(this);		
			this.add(Respuesta);
			
			////Aqu? se a?ade el texto que contiene el puntaje creado en la clase General
			General.puntos.setBounds(750, 0, 300, 100);
			this.add(General.puntos);
		}
			
		//A continuaci?n se dibujan las preguntas abiertas:
		//Solo se comentar? la primera de ellas, ya que las dem?s siguen la misma l?gica
		
		//Se crea la primera pregunta abierta
		public void PreguntaAbierta01() {
			//Aqu? se define el texto de la primera parte de la primera pregunta abierta
			JLabel PreguntaA01= new JLabel("?El aire est? compuesto principalmete de dos elementos,"); // Esta es la primer pregunta del juego
			//Se define la posici?n y las dimensiones del texto
			PreguntaA01.setBounds(45, 45, 650, 40);
			//Se define la fuente y el tama?o de la letra
			PreguntaA01.setFont(new Font("Tahoma", Font.PLAIN, 24));
			//Se agrega el texto de la primera parte de la primera pregunta abierta
			this.add(PreguntaA01);
			//Aqu? se crea el texto de la segunda parte de la primera pregunta abierta
			JLabel PreguntaA01_1 = new JLabel("uno de ellos es el nitr?geno y el otro es: ");
			//Se define la posici?n y las dimensiones del texto
			PreguntaA01_1.setBounds(45, 90, 650, 40);
			//Se le da una fuente y un tama?o de letra al texto
			PreguntaA01_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			//Se agrega la segunda parte del texto de la primera pregunta abierta
			this.add(PreguntaA01_1);

			//Se crea un nuevo cuadro de texto vac?o
			JLabel pregunta = new JLabel("");
			//Se agrega una imagen al cuadro de texto creado anteriormente
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-4.jpg"));
			//Se define la posici?n y las dimensiones de la imagen
			pregunta.setBounds(500, 0, 900, 400);
			//Se agrega la imagen a la ventana
			this.add(pregunta);
			
		}
		
		//Aqu? se crea la segunda pregunta abierta
		
		public void PreguntaAbierta02() {
			JLabel PreguntaA02 = new JLabel("Menciona un gas noble");
			PreguntaA02.setBounds(45, 45, 650, 40);
			PreguntaA02.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PreguntaA02);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-8.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		//Aqu? se crea la segunda pregunta abierta
		public void PreguntaAbierta03() {
			JLabel PreguntaA03 = new JLabel("?A que temperatura equivalen 0 grados celcius ");
			PreguntaA03.setBounds(45, 45, 650, 40);
			PreguntaA03.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PreguntaA03);
			
			JLabel PreguntaA03_1 = new JLabel("en la escala kelvin?");
			PreguntaA03_1.setBounds(45, 90, 650, 40);
			PreguntaA03_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(PreguntaA03_1);
					
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-12.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aqu? se crean los m?todos que se llevar?n a cabo con los intentos
		
		//Este m?todo aumenta los puntos intentos en 1
		static int Intentosnuevos(int intentos) {
			intentos=intentos+1;
			return intentos;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}
	