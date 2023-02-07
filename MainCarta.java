package ejercicio7;

public class MainCarta {

	public static void main(String[] args) {
		//crear carta nueva
		Carta carta1=new Carta();
		double puntaje=0;
		
		
		//crear variable para ir sumando los puntos de las cartas, añadir el de la carta creada
			puntaje+= carta1.getPuntaje();
		//decir al usuario que carta tiene y cuanto vale
			System.out.println("Has obtenido un " + carta1.getValor()+ " de " +carta1.getPalo()+". \n Tu puntaje total es " + puntaje);
				
			
		//condiciones para generar cartas nuevas: no haberte pasado de 7.5 Y pedir una carta nueva
		while(puntaje<7.5&&utils.leerDatoEntero("Quieres seguir jugando? Elige 1 para coger otra carta y 2 para plantarte", 1, 2)==1) {
			//generar otra carta
			carta1=new Carta(); 
			//sumar puntaje al total
			puntaje+= carta1.getPuntaje(); 
			//informar al usuario
			System.out.println("Has obtenido un " + carta1.generarCarta() + " tu puntaje total es " + puntaje);
			
			
			
		}
			
			//mensajes de final de partida
			if(puntaje<7.5) {
				System.out.println("te rajaste, cobarde");}
			else if (puntaje>7.5) System.out.println("has perdido");
			else System.out.println("has ganado");
		
		
		
		
		
	}



	
	
	
	
	
	
	}