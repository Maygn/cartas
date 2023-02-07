package ejercicio7;
//clase carta y atributos
public class Carta {
String palo;
String valor;
double puntaje;

//constructor, sin parametros, usando por defecto valores random
public Carta() {
	this.palo = generarPalo(); //llama metodo para randomizar palo
	this.valor = generarValor(); //llama metodo para randomizar numero
}
//getters y setters
public String getPalo() {
	return palo;
}

public void setPalo(String palo) {
	this.palo = palo;
}

public String getValor() {
	return valor;
}

public void setValor(String valor) {
	this.valor = valor;
}


public double getPuntaje() {
	return puntaje;
}

public void setPuntaje(int puntaje) {
	this.puntaje = puntaje;
}

/**
 * genera un palo aleatorio en base a correlacionar palos con numeros del 1 al 4
 * @return el nombre del palo en una cadena de texto
 */
public String generarPalo() {
	String aReturnar="";
	int palo=utils.aleatorio(1, 4); 
	switch (palo) {
	case 1: aReturnar="Copas";
	break;
	case 2:aReturnar="Bastos";
	break;
	case 3: aReturnar="Espadas";
	break;
	case 4: aReturnar="Oros";
	break;
	}
	return aReturnar;
}
/**
 * genera un valor de carta al azar y asigna el atributo de puntos que vale la carta en el juego
 * @return cadena de texto con el valor o figura de la carta
 */
public String generarValor() {
	String aReturnar="";
	int valor=utils.aleatorio(1, 12);
	System.out.println("BB"+valor);
	switch (valor) {
	case 1: aReturnar="As";
	this.puntaje=valor;
	break;
	case 2:aReturnar="2";
	this.puntaje=valor;
	break;
	case 3: aReturnar="3";
	this.puntaje=valor;
	break;
	case 4: aReturnar="4";
	this.puntaje=valor;
	break;
	case 5: aReturnar="5";
	this.puntaje=valor;
	break;
	case 6:aReturnar="6";
	this.puntaje=valor;
	break;
	case 7: aReturnar="7";
	this.puntaje=valor;
	break;
	case 8: aReturnar="8";
	this.puntaje=valor;
	break;
	case 9: aReturnar="9";
	this.puntaje=valor;
	break;
	case 10:aReturnar="Sota";
	this.puntaje=0.5;
	break;
	case 11: aReturnar="Caballo";
	this.puntaje=0.5;
	break;
	case 12: aReturnar="Rey";
	this.puntaje=0.5;
	break;
	}
	return aReturnar;
}

/**
 * junta el nombre de la carta completa en un solo string
 * @return string con la carta
 */
public  String generarCarta() {
	String newCarta= this.valor+" de "+this.palo;
	return newCarta;
}
}


