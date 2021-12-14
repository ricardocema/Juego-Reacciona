//Aqu� se importan las librer�as necesarias para la ejecuci�n del juego, en este caso, se usar�n las librer�as necesarias para usar SWING.
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;


//Aqu� se implementan los m�todos usados en las clases General, GeneralAbiertos y Retos.
//Solo se comentar� la primera pregunta de selecci�n, la primera instrucci�n de la clase tutorial, la primera pregunta abierta y la primera pregunta de Reto, ya que las dem�s siguen la misma l�gica
//PREGUNTA 1
//Aqu� se crea la clase Nivel y se hace referencia a que se estar� usando la clase General, ya que es la que contiene los m�todos que se usar�n
class Nivel extends General implements ActionListener{
	public Nivel() {
		super();
		//Se llama al m�todo preguntaSeleccion1
		PreguntaSeleccion1();
		
	}
	//Se usa el evento ActionEvent en los botones de respuesta
	public void actionPerformed(ActionEvent e) {
		//Se indica lo que se realizar� cuando se de click en el boton correcto
		if (e.getSource().equals(BotonB)) {
			//Se invoca el m�todo Maspuntos, el cual aumenta el puntaje en 5
			puntaje=Maspuntos(puntaje);
			//Se invoca el m�todo correcto, el cual aumenta la variable correctas en 1
			correctas=correcto(correctas);
			//Se despliega un mensaje indicando que la respuesta fue correcta, adem�s indica el puntaje y en n�mero de respuestas correctas hasta el momento
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			//Se cierra la ventana para que no se acumulen
			this.setVisible(false);
			//Se crea una nueva clase instruccion1
			instruccion01 instruccion01 = new instruccion01();
			
		}
		//Se indica lo que pasa cuando el se hace click en un bot�n incorrecto
		if(e.getSource().equals(BotonA)) {
			//Se invoca el m�todo Menospuntos, el cual disminuye el puntaje en 3
			puntaje=Menospuntos(puntaje);
			//Se despliega un mensaje indicando que la respuesta fue correcta, adem�s indica el puntaje y en n�mero de respuestas correctas hasta el momento
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			//Se cierra la ventana para que no se acumulen
			this.setVisible(false);
			//Se crea una nueva clase instruccion1
			instruccion01 instruccion01 = new instruccion01();

		}
		//Se indica lo que pasa cuando el se hace click en un bot�n incorrecto
		if(e.getSource().equals(BotonC)) {
			//Se invoca el m�todo Menospuntos, el cual disminuye el puntaje en 3
			puntaje=Menospuntos(puntaje);
			//Se despliega un mensaje indicando que la respuesta fue correcta, adem�s indica el puntaje y en n�mero de respuestas correctas hasta el momento
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			//Se cierra la ventana para que no se acumulen
			this.setVisible(false);
			//Se crea una nueva clase instruccion1
			instruccion01 instruccion01 = new instruccion01();
			
		}
		
	}
	
}

	

//A continuaci�n se crea la primera instrucci�n

//INSTRUCCION 1
//Se crea la nueva clase instruccion1
class instruccion01 extends General implements ActionListener{
	public instruccion01() {
		super();
		instruccion1();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonAvanzar)) {
			this.setVisible(false);
			instruccion02 instruccion02 = new instruccion02();
			
		}
	}
}

//INSTRUCCION 2
class instruccion02 extends General implements ActionListener{
	public instruccion02() {
		super();
		instruccion2();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonAvanzar)) {
			this.setVisible(false);
			instruccion03 instruccion03 = new instruccion03();
			
		}
	}
}

//INSTRUCCION 3
class instruccion03 extends General implements ActionListener{
	public instruccion03() {
		super();
		instruccion3();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonAvanzar)) {
			this.setVisible(false);
			instruccion04 instruccion04 = new instruccion04();
			
		}
	}
}


//INSTRUCCION 4
class instruccion04 extends General implements ActionListener{
	public instruccion04() {
		super();
		instruccion4();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonAvanzar)) {
			this.setVisible(false);
			Nivel01 Nivel01 = new Nivel01();
			
		}
	}
}



//PREGUNTA 2
class Nivel01 extends General implements ActionListener{
	public Nivel01() {
		super();
		PreguntaSeleccion2();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonA)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel02 Nivel02 = new Nivel02();
			
		}
		if(e.getSource().equals(BotonB)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel02 Nivel02 = new Nivel02();

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel02 Nivel02 = new Nivel02();
			
		}
		
	}
	
}

//PREGUNTA 03

class Nivel02 extends General implements ActionListener{
	public Nivel02() {
		super();
		PreguntaSeleccion3();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonA)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio01 Desafio01 = new Desafio01();
			
		}
		if(e.getSource().equals(BotonB)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio01 Desafio01 = new Desafio01();

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio01 Desafio01 = new Desafio01();
			
		}
		
	}
	
}


//A continuaci�n se crea la primera pregunta abierta
//PREGUNTA ABIERTA 01
//Se crea la clase Desafio01 y se indica que se usar� la clase GeneralAbiertos
class Desafio01 extends GeneralAbiertos implements ActionListener{
	public Desafio01() {
		super();
		PreguntaAbierta01();
	}
	//Se usa el evento ActionEvent en los botones
	public void actionPerformed(ActionEvent e) {
		//Si se hace click en el bot�n comprobar:
		if (e.getSource().equals(BotonComprobar)) {
			//Si la respuesta introducida en el cuadro de texto concuerda con la respuesta almacenada en la variable Respuesta01, la variable intentos aumenta en 2
			if(Respuesta.getText().toLowerCase().contentEquals(Respuesta01.toLowerCase())) {
				intentos=intentos+2;
				//Se despliega un mensaje indicando que se respondi� la respuesta de forma correcta, adem�s indica los puntos de intento restantes y el puntaje
				JOptionPane.showMessageDialog(null, "Respuesta correcta. Aprobaste el primer desaf�o y te quedan " + intentos + " puntos de intentos restantes y " + General.puntaje + " puntos");
				//Se crea la nueva clase Nivel03
				Nivel03 Nivel03 = new Nivel03();
				//Se cierra la ventana actual para evitar que se acumulen.
				this.setVisible(false);
			}
			//Si la respuesta introducida no concuerda con el texto almacenado en la variable Respuesta01, entonces la variable intentos disminuye en 1
			else {
				intentos=intentos-1;
				//Se despliega un mensaje indicando que se fall� en la respuesta y adem�s indica cuantos puntos de intento quedan.
				JOptionPane.showMessageDialog(null, "Respuesta incorrecta, te quedan " + intentos + "  Puntos de intentos restantes" );
				//Si los intentos llegan a 0, y se vuelve a introducir una respuesta equivocada, se suma un punto para evitar que la variable intentos sea negativa
				if(intentos==0) {
					intentos=intentos+1;
					//Se despliega un mensaje indicando que se fall� en el desaf�o y que debemos intercambiar puntos si queremos continuar jugando
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta. No completaste el primer desaf�o y no tienes m�s puntos de intentos para avanzar. Intercambia puntos por de intento para seguir avanzando");
				}
			}
		}
		//Aqu� se indica lo que pasa si se hace click en el bot�n conseguir
		if (e.getSource().equals(BotonConseguir)) {
			//Si el puntaje es menor a 2, no ser� posible obtener puntos de intento, ya que los puntos de intento corresponden a la mitad del puntaje, por lo tanto, el juego se cerrar�
			if(General.puntaje<2) {
				JOptionPane.showMessageDialog(null, "No tienes puntos para intercambiar. El juego se cerrar�" + General.puntaje);
				this.setVisible(false);
			}
			else {
				//Si por el contrario, se tienen puntos, ser�n divididos entre dos y se obtendr� este valor como puntos de intento
				//Se invoca el m�todo IntentosNuevos
				intentos=Intentosnuevos(intentos);
				//Se invoca el m�todo Puntosnuevos
				General.puntaje=General.Puntosnuevos(General.puntaje);
				JOptionPane.showMessageDialog(null, "Tus nuevos puntos de intento son: " + intentos + "y tu nuevo puntaje es de :" + General.puntaje);
				}
		}
		//Si se hace click en el bot�n de reto, se crear� la clase Reto1
		if (e.getSource().equals(BotonReto)) {
			Reto1 Reto1 = new Reto1();
		}
	}
}
//Aqu� se indica lo que ocurre si se hace click en el bot�n de reto
//RETO 1
//Se crea la clase Reto1
class Reto1 extends Retos implements ActionListener{
	public Reto1() {
		super();
		//Se llama al m�todo PreguntaReto01
		PreguntaReto01();
		
	}
	//Se indica lo que sucede al hacer click en el bot�n verificar
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonVerificar)) {
			//Si cada uno de los cuadros de texto concuerda con las variables Letra1, Letra2, Letra3, Letra4 y Letra5, se despliega un mensaje indicando que la respuesta es correcta y se obtendr� un punto de intentos
			if(Letra1.getText().contentEquals("I") && Letra2.getText().contentEquals("R") && Letra3.getText().contentEquals("O") && Letra4.getText().contentEquals("E") && Letra5.getText().contentEquals("N")) {
				JOptionPane.showMessageDialog(null, "Correcto, obtuviste un punto de intentos");
				//Se cierra la ventana para evitar que se acumulen
				this.setVisible(false);
				//Se agrega un punto de intentos
				GeneralAbiertos.intentos++;
				//Se elimina el bot�n de reto de la ventana para que no pueda volver a ser usado
				GeneralAbiertos.BotonReto.setVisible(false);
		}
			else {
				//Por el contrario, si la respuesta es incorrecta, se despliega el mensaje indicando que no se obtuvieron puntos de intento
				JOptionPane.showMessageDialog(null, "Incorrecto, no obtuviste puntos de intento");
				//Se cierra la ventana del reto
				this.setVisible(false);
				//Se elimina el bot�n de reto para que no pueda volver a ser usado
				GeneralAbiertos.BotonReto.setVisible(false);
			}
	}
}
	
}


//Nivel 04
class Nivel03 extends General implements ActionListener{
	public Nivel03() {
		super();
		PreguntaSeleccion4();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonC)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel04 Nivel04 = new Nivel04();
			
		}
		if(e.getSource().equals(BotonA)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel04 Nivel04 = new Nivel04();

		}
		if(e.getSource().equals(BotonB)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel04 Nivel04 = new Nivel04();
		}
		
	}
	
}

//Nivel 05
class Nivel04 extends General implements ActionListener{
	public Nivel04() {
		super();
		PreguntaSeleccion5();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonB)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel05 Nivel05 = new Nivel05();
			
		}
		if(e.getSource().equals(BotonA)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel05 Nivel05 = new Nivel05();

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel05 Nivel05 = new Nivel05();
		}
		
	}
	
}

//Nivel 06
class Nivel05 extends General implements ActionListener{
	public Nivel05() {
		super();
		PreguntaSeleccion6();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonB)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio02 Desafio02= new Desafio02();
			
		}
		if(e.getSource().equals(BotonA)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio02 Desafio02= new Desafio02();

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio02 Desafio02= new Desafio02();
		}
		
	}
	
}

//PREGUNTA ABIERTA 02

class Desafio02 extends GeneralAbiertos implements ActionListener{
	public Desafio02() {
		super();
		PreguntaAbierta02();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonComprobar)) {
			if(Respuesta.getText().contentEquals(Respuesta021.toLowerCase()) || Respuesta.getText().contentEquals(Respuesta022.toLowerCase()) || Respuesta.getText().contentEquals(Respuesta023.toLowerCase()) || Respuesta.getText().contentEquals(Respuesta024.toLowerCase()) || Respuesta.getText().contentEquals(Respuesta025.toLowerCase()) || Respuesta.getText().contentEquals(Respuesta026.toLowerCase())) {
				intentos=intentos+2;
				JOptionPane.showMessageDialog(null, "Respuesta correcta. Aprobaste el primer desaf�o y te quedan " + intentos + " puntos de intentos restantes y " + General.puntaje + " puntos");
				Nivel06 Nivel06 = new Nivel06();
				this.setVisible(false);
			}
			else {
				intentos=intentos-1;
				JOptionPane.showMessageDialog(null, "Respuesta incorrecta, te quedan " + intentos + "  Puntos de intentos restantes" );
				if(intentos==0) {
					intentos=intentos+1;
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta. No completaste el primer desaf�o y no tienes m�s puntos de intentos para avanzar. Intercambia puntos por de intento para seguir avanzando");
				}
			}
		}
		if (e.getSource().equals(BotonConseguir)) {
			if(General.puntaje<2) {
				JOptionPane.showMessageDialog(null, "No tienes puntos para intercambiar. El juego se cerrar�");
				this.setVisible(false);
			}
			else {
				intentos=Intentosnuevos(intentos);
				General.puntaje=General.Puntosnuevos(General.puntaje);
				JOptionPane.showMessageDialog(null, "Tus nuevos puntos de intento son: " + intentos + "y tu nuevo puntaje es de :" + General.puntaje);
				}
		}
		if (e.getSource().equals(BotonReto)) {
			Reto2 Reto2 = new Reto2();
		}
	}
}

//RETO2
class Reto2 extends Retos implements ActionListener{
	public Reto2() {
		super();
		PreguntaReto02();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonVerificar)) {
			if(Letra1.getText().contentEquals("O") && Letra2.getText().contentEquals("E") && Letra3.getText().contentEquals("C") && Letra4.getText().contentEquals("L")) {
				JOptionPane.showMessageDialog(null, "Correcto, obtuviste un punto de intentos");
				this.setVisible(false);
				GeneralAbiertos.intentos++;
				GeneralAbiertos.BotonReto.setVisible(false);
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrecto, no obtuviste puntos de intento");
				this.setVisible(false);
				GeneralAbiertos.BotonReto.setVisible(false);
			}
		}
	}
}


//PREGUNTA 7
class Nivel06 extends General implements ActionListener{
	public Nivel06() {
		super();
		PreguntaSeleccion7();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonC)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel07 Nivel07 = new Nivel07();
			
		}
		if(e.getSource().equals(BotonA)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel07 Nivel07 = new Nivel07();

		}
		if(e.getSource().equals(BotonB)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel07 Nivel07 = new Nivel07();
		}
		
	}
	
}
//PREGUNTA 8
class Nivel07 extends General implements ActionListener{
	public Nivel07() {
		super();
		PreguntaSeleccion8();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonB)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel08 Nivel08 = new Nivel08();
			
		}
		if(e.getSource().equals(BotonA)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel08 Nivel08 = new Nivel08();

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Nivel08 Nivel08 = new Nivel08();
		}
		
	}
	
}

//PREGUNTA 9
class Nivel08 extends General implements ActionListener{
	public Nivel08() {
		super();
		PreguntaSeleccion9();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonA)) {
			puntaje=Maspuntos(puntaje);
			correctas=correcto(correctas);
			JOptionPane.showMessageDialog(null, "Correcto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio03 Desafio03 = new Desafio03();
			
			
		}
		if(e.getSource().equals(BotonB)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio03 Desafio03 = new Desafio03();		

		}
		if(e.getSource().equals(BotonC)) {
			puntaje=Menospuntos(puntaje);
			
			JOptionPane.showMessageDialog(null, "Incorrecto, tu puntaje es de: " + puntaje + " y llevas " + correctas + " preguntas correctas");
			this.setVisible(false);
			Desafio03 Desafio03 = new Desafio03();
			
		}
		
	}
	
}

//PREGUNTA ABIERTA 03

class Desafio03 extends GeneralAbiertos implements ActionListener{
	public Desafio03() {
		super();
		PreguntaAbierta03();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonComprobar)) {
			if(Respuesta.getText().contentEquals(Respuesta031) || Respuesta.getText().contentEquals(Respuesta032) || Respuesta.getText().contentEquals(Respuesta033) || Respuesta.getText().contentEquals(Respuesta034) || Respuesta.getText().contentEquals(Respuesta035) || Respuesta.getText().contentEquals(Respuesta036)) {
				intentos=intentos+2;
				JOptionPane.showMessageDialog(null, "Respuesta correcta. Aprobaste el primer desaf�o y te quedan " + intentos + " puntos de intentos restantes y " + General.puntaje + " puntos");
				Nivel06 Nivel06 = new Nivel06();
				this.setVisible(false);
				Nivel09 Nivel09 = new Nivel09();
			}
			else {
				intentos=intentos-1;
				JOptionPane.showMessageDialog(null, "Respuesta incorrecta, te quedan " + intentos + "  Puntos de intentos restantes" );
				if(intentos==0) {
					intentos=intentos+1;
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta. No completaste el primer desaf�o y no tienes m�s puntos de intentos para avanzar. Intercambia puntos por de intento para seguir avanzando");
				}
			}
		}
		if (e.getSource().equals(BotonConseguir)) {
			if(General.puntaje<2) {
				JOptionPane.showMessageDialog(null, "No tienes puntos para intercambiar. El juego se cerrar�");
				this.setVisible(false);
			}
			else {
				intentos=Intentosnuevos(intentos);
				General.puntaje=General.Puntosnuevos(General.puntaje);
				JOptionPane.showMessageDialog(null, "Tus nuevos puntos de intento son: " + intentos + "y tu nuevo puntaje es de :" + General.puntaje);
				}
		}
		if(e.getSource().equals(BotonReto)) {
			Reto3 Reto3 = new Reto3();
		}
	}
}

//RETO 3

class Reto3 extends Retos implements ActionListener{
	public Reto3() {
		super();
		PreguntaReto03();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(BotonVerificar)) {
			if(Letra1.getText().contentEquals("L") && Letra2.getText().contentEquals("C") && Letra3.getText().contentEquals("T") && Letra4.getText().contentEquals("O")) {
				JOptionPane.showMessageDialog(null, "Correcto, obtuviste un punto de intentos");
				this.setVisible(false);
				GeneralAbiertos.intentos++;
				GeneralAbiertos.BotonReto.setVisible(false);
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrecto, no obtuviste puntos de intento");
				this.setVisible(false);
				GeneralAbiertos.BotonReto.setVisible(false);
			}
		}
	}
}



// FINAL JUEGO
class Nivel09 extends General implements ActionListener{
	public Nivel09() {
		super();
		PreguntaSeleccion10();
	}
}


