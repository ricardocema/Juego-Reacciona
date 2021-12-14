import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
	
	//En esta clase se encuentra lo necesario para el juego: preguntas, respuestas y botones.
	public class General extends JFrame implements ActionListener{
		//Se crean los botones de opciones "A", "B", "C" y el botón para avanzar en el tutorial
		protected JButton BotonA, BotonB, BotonC, BotonAvanzar;
		//Se crean las variables correctas, incorrectas y puntaje, las cuales son estáticas para poder ser usadas en otras clases
		static int correctas, incorrectas, puntaje, correcto;
		protected int alto, ancho;
		//Se crean los cuadros de texto que serán usados
		static JLabel puntos, imagen1, imagen2, pregunta;
		
		
		public General(){ 
			/*A continuación se crea una ventana vacía*/
			setLayout(null);
			ancho=1000;
			alto=700;
			setBounds(0,0,ancho,alto);
			setTitle("REACCIONA");
			getContentPane().setBackground(new Color(204,51,153));
			setResizable(false);
			setVisible(true);
			
			
			/* En este método se crean los botones de respuesta:*/ 
			/*Botón A*/
			BotonA=new JButton("A");
			BotonA.setBounds(45, 500, 200, 100);
			BotonA.addActionListener(this);
			BotonA.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(BotonA);
			
			//Boton B:
			BotonB=new JButton("B");
			BotonB.setBounds(355, 500, 200, 100);
			BotonB.addActionListener(this);
			BotonB.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(BotonB);
			
			//Boton C:
			BotonC=new JButton("C");
			BotonC.setBounds(655, 500, 200, 100);
			BotonC.addActionListener(this);
			BotonC.setFont(new Font("Tahoma", Font.PLAIN, 24));
			add(BotonC);
			
			//BotonAvanzar:
			BotonAvanzar = new JButton("Avanzar");
			BotonAvanzar.setBounds(655,500,200,100);
			BotonAvanzar.addActionListener(this);
			this.add(BotonAvanzar);
			BotonAvanzar.setVisible(false);
			
			
			//Cuadro de puntaje:
			puntos = new JLabel("Puntos: " + puntaje + " ,   Puntos de intento: " + GeneralAbiertos.intentos);
			puntos.setBounds(750, 0, 300, 100);
			puntos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this.add(puntos);
			
			
			
		
	}
		// A continuación se da inicio al tutorial del juego, solo se comentará la primera instrucción ya que las demás siguen la misma lógica
		//Primera instrucción
		public void instruccion1() {
		//Se crea un cuadro de texto vacío
		JLabel imagen01 = new JLabel ("");
		//Se agrega una imagen en el cuadro de texto vacío que se encuentra en el directorio que se indica debajo"
		imagen01.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\prof-membrana-1.jpg"));
		//Se definen las dimensiones de la imagen
		imagen01.setBounds(0, 0, 1000, 700);
		this.add(imagen01);
		//Se quitan los botoes "A", "B" y "C" y el puntaje de la ventana, ya que son innecesarios en la sección de tutorial
		BotonA.setVisible(false);
		BotonB.setVisible(false);
		BotonC.setVisible(false);
		BotonAvanzar.setVisible(true);
		puntos.setVisible(false);
		}
		
		//Segunda instrucción
		public void instruccion2() {
			JLabel imagen02 = new JLabel ("");
			imagen02.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\prof-membrana-2.jpg"));
			imagen02.setBounds(0, 0, 1000, 700);
			this.add(imagen02);
			BotonA.setVisible(false);
			BotonB.setVisible(false);
			BotonC.setVisible(false);
			BotonAvanzar.setVisible(true);
			puntos.setVisible(false);
			}
		
		//Tercera instruccion
		public void instruccion3() {
			JLabel imagen03 = new JLabel ("");
			imagen03.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\prof-membrana-3.jpg"));
			imagen03.setBounds(0, 0, 1000, 700);
			this.add(imagen03);
			BotonA.setVisible(false);
			BotonB.setVisible(false);
			BotonC.setVisible(false);
			BotonAvanzar.setVisible(true);
			puntos.setVisible(false);
			}
		
		//Cuarta instrucción
		public void instruccion4() {
			JLabel imagen04 = new JLabel ("");
			imagen04.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\prof-membrana-4.jpg"));
			imagen04.setBounds(0, 0, 1000, 700);
			this.add(imagen04);
			BotonA.setVisible(false);
			BotonB.setVisible(false);
			BotonC.setVisible(false);
			BotonAvanzar.setVisible(true);
			puntos.setVisible(false);
			}
		
		//Aquí acaba el tutorial y se da inicio a las preguntas de selección múltiple
		
		//A continuación se definen las ventanas que contienen las preguntas.
		//Sólo se comentará la primera pregunta de selección múltiple, ya que las demás siguen la misma lógica
		//Aquí se crea la primera pregunta
		public void PreguntaSeleccion1(){
			//Se define el texto de la pregunta en un cuadro de texto
			JLabel Pregunta1= new JLabel("¿Cuál es el símbolo químico del hidrógeno?"); // Esta es la primer pregunta del juego
			//Se definen las coordenadas y las dimensiones del texto
			Pregunta1.setBounds(45, 45, 650, 40);
			//Se agrega una fuente al texto, en este caso se usó el tipo de letra Tahoma y el tamaño de letra 24
			Pregunta1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			//Se agrega el texto a la ventana
			this.add(Pregunta1);
	
			//Aquí se agrega la primera opción de respuesta
			JLabel a= new JLabel("A) Hi");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			//Aquí se agrega la segunda opción de respuesta		
			JLabel b = new JLabel("B) H");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			//Aquí se agrega la tercera opción de respuesta
			JLabel c = new JLabel("C) H2");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			//Aquí se agrega la imagen de los beakers, la cual varía en cada nivel
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-1.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		//Aquí se crea la pregunta de selección 2
		public void PreguntaSeleccion2() {
			JLabel Pregunta2 = new JLabel("Qué elemento tiene como símbolo la letra C");
			Pregunta2.setBounds(45, 45, 650, 40);
			Pregunta2.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta2);
			
			JLabel a= new JLabel("A) Carbono");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Cloro");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Cesio");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-2.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
			
		}
		//Aquí se crea la tercera pregunta
		public void PreguntaSeleccion3() {
			JLabel Pregunta3 = new JLabel("Cuál es el el símbolo químico del oxígeno");
			Pregunta3.setBounds(45, 45, 650, 40);
			Pregunta3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta3);
			
			JLabel a= new JLabel("A) O");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Og");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Ox");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-3.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
			
		}
		
		//Aquí se crea la cuarta pregunta
		public void PreguntaSeleccion4() {
			JLabel Pregunta3 = new JLabel("¿Cuál es la fórmula química del agua?");
			Pregunta3.setBounds(45, 45, 650, 40);
			Pregunta3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta3);
			
			JLabel a= new JLabel("A) HO");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) H2O2");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) H2O");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-5.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea la quinta pregunta
		public void PreguntaSeleccion5() {
			JLabel Pregunta4 = new JLabel("¿Cuál es la fórmual química de la sal de cocina?");
			Pregunta4.setBounds(45, 45, 650, 40);
			Pregunta4.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta4);
			
			JLabel a= new JLabel("A) Cloro de sodio");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Cloruro de sodio");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Clorudo de sodio");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-6.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea la sexta pregunta
		public void PreguntaSeleccion6() {
			JLabel Pregunta5 = new JLabel("¿Cuál de los siguientes no es un metal?");
			Pregunta5.setBounds(45, 45, 650, 40);
			Pregunta5.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta5);
			
			JLabel a= new JLabel("A) Platino");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Bromo");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Oro");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-7.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea la séptima pregunta
		public void PreguntaSeleccion7() {
			JLabel Pregunta6 = new JLabel("¿A que temperatura ebulle el agua?");
			Pregunta6.setBounds(45, 45, 650, 40);
			Pregunta6.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta6);
			
			JLabel a= new JLabel("A) 100 grados fahrenheit");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) 100 grados kelvin");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) 100 grados celcius ");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-9.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea la octava pregunta
		public void PreguntaSeleccion8() {
			JLabel Pregunta7 = new JLabel("¿Al mezclar agua con aceite se genera una mezcla: ?");
			Pregunta7.setBounds(45, 45, 650, 40);
			Pregunta7.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta7);
			
			JLabel a= new JLabel("A) Homogenea");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Heterogénea");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Química");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-10.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea la novena pregunta
		public void PreguntaSeleccion9() {
			JLabel Pregunta8 = new JLabel("¿El agua es: ?");
			Pregunta8.setBounds(45, 45, 650, 40);
			Pregunta8.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta8);
			
			JLabel a= new JLabel("A) Un compuesto");
			a.setBounds(55, 380, 650, 20);
			a.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(a);
			
			JLabel b = new JLabel("B) Un elemento");
			b.setBounds(55, 410, 650, 20);
			b.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(b);
			
			JLabel c = new JLabel("C) Una mezcla");
			c.setBounds(55, 440, 650, 20);
			c.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(c);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-11.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
		}
		
		//Aquí se crea el mensaje cuando se finaliza el juego pregunta
		public void PreguntaSeleccion10() {
			JLabel Pregunta9 = new JLabel("¡Felicidades, " + Menu.Nombre + " has completado todas las preguntas ");
			Pregunta9.setBounds(45, 45, 650, 40);
			Pregunta9.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta9);
			
			JLabel Pregunta9_1 = new JLabel("¡de forma correcta ");
			Pregunta9_1.setBounds(45, 90, 650, 40);
			Pregunta9_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			this.add(Pregunta9_1);
			
			BotonA.setVisible(false);
			BotonB.setVisible(false);
			BotonC.setVisible(false);
			
			JLabel pregunta = new JLabel("");
			pregunta.setIcon(new ImageIcon("C:\\Users\\Eco\\Documents\\ingenier\u00EDa de software\\tercer semestre\\paradigmas de programaion\\juego poo\\im\u00E1genes\\pregunta-12.jpg"));
			pregunta.setBounds(500, 0, 900, 400);
			this.add(pregunta);
			
			//Aquí se crean los métodos que se llevarán a cabo con el puntaje
			
			//Este método aumenta la variable correctas en 1
		}
		
		static int correcto(int correctas) {
			correctas++;
			return correctas;
		}
		
		//Este método aumenta el puntaje en 5
		static int Maspuntos(int puntaje) {
			puntaje=puntaje+5;
			return puntaje;
		}
		
		//Este método disminuye el puntaje en 3 si el puntaje es mayor que 3, de lo contrario, iguala el puntaje a 0
		static int Menospuntos(int puntaje) {
			if(puntaje<3) {
				puntaje=0;
			}
				else {
					puntaje=puntaje-3;
				}
			return puntaje;
		}
		
		//Este método disminuye el puntaje en 2		
		static int Puntosnuevos(int puntaje) {
			puntaje=puntaje-2;
			return puntaje;
		}
		
		//FIN DEL JUEGO
			
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}
	}
