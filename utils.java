/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class utils {

    

    //UTILS DE INT.
	/**
	 * Se pide al usuario un dato y se recoge en un int
	 * @param cadena (El texto que se presentara al usuario)
	 * @return el int que el usuario inserta
	 */
    public static int leerDatoEntero(String cadena) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextInt();
                enc = true;
            } catch (InputMismatchException e) {
                System.out.println("Es necesario introducir unicamente un numero entero.");
                sc.nextLine(); //Necesario para flushear el scanner
            }
        }
        
        return opc;
    }
    /**
	 * Se pide al usuario un dato y se recoge en un int
	 * @param cadena (El texto que se presentara al usuario)
	 * @param min (valor minimo para el dato solicitado)
	 * @param min (valor maximo para el dato solicitado)
	 * @return el int que el usuario inserta
	 */
    public static int leerDatoEntero(String cadena, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextInt();
                if (opc < min || opc > max) {
                    System.out.println("El valor ha de estar entre " + min + " y " + max);
                    sc.nextLine();
                } else {
                    enc = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("No se pueden introducir caracteres");
                sc.nextLine();
            }
        }
        return opc;
    }
    /**
	 * Se pide al usuario un dato y se recoge en un int
	 * @param cadena (El texto que se presentara al usuario)
	 * @param min (valor minimo para el dato solicitado)
	 * @return el int que el usuario inserta
	 */
    public static int leerDatoEnteroMin(String cadena, int min) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextInt();
                if (opc < min) {
                    System.out.println("El valor ha de estar sobre " + min);
                    sc.nextLine();
                } else {
                    enc = true;
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("No se pueden introducir caracteres");
                sc.nextLine();
            }
        }
        return opc;
    }
    /**
	 * Se genera un numero entero aleatorio entre dos valores
	 * @param min (valor minimo del numero aleatorio)
	 * @param min (valor maximo del numero aleatorio)
	 * @return el valor generado aleatoriamente
	 */
    public static int aleatorio(int min, int max) {
        int res;
        res = (int) (Math.random() * ((max - min) + 1)) + min; 
        return res;
    }

    //Utils de Double.
	/**
	 * Se pide al usuario un dato y se recoge en un double
	 * @param cadena (El texto que se presentara al usuario)
	 * @return el double que el usuario inserta
	 */
    public static double getDouble(String cadena) {
        Scanner sc = new Scanner(System.in);
        double opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextDouble();
                enc = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número. Las decimales se separan por comas.");
                sc.nextLine();
            }
        }
        return opc;
    }
    /**
	 * Se pide al usuario un dato y se recoge en un double
	 * @param cadena (El texto que se presentara al usuario)
	 * @param min (valor minimo que puede meter el usuario)
	 *@param max (valor maximo que puede meter el usuario)
	 * @return el double que el usuario inserta
	 */
    public static double doubleMinMax(String cadena, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextDouble();
                if (opc < min || opc > max) {
                    System.out.println("El valor ha de estar entre " + min + " y " + max);
                    sc.nextLine();
                } else {
                    enc = true;
                }
            } catch (InputMismatchException e) {
                
                System.out.println("No se pueden introducir caracteres");
                sc.nextLine();
            }
        }
        return opc;
    }
    /**
   	 * Se pide al usuario un dato y se recoge en un double
   	 * @param cadena (El texto que se presentara al usuario)
   	 * @param min (valor minimo que puede meter el usuario)
   	 * @return el double que el usuario inserta
   	 */
    public static double doubleMin(String cadena, double min) {
        Scanner sc = new Scanner(System.in);
        double opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextDouble();
                if (opc < min) {
                    System.out.println("El valor ha de estar sobre " + min + ".");
                    sc.nextLine();
                } else {
                    enc = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("No se pueden introducir caracteres");
                sc.nextLine();
            }
        }
        return opc;
    }
    /**
   	 * Se pide al usuario un dato y se truncan los decimales
   	 * @param double (El numero al que quitar decinales)
   	 * @return el numero con los decimales truncados
   	 */
    public static double truncar(double d) {

        return Math.round(d * 100.0) / 100.0;
    }
    //Utils de long
    /**
   	 * Se pide al usuario un dato y se recoge en un long
   	 * @param cadena (El texto que se presentara al usuario)
   	 * @param min (valor minimo que puede meter el usuario)
   	 *@param max (valor maximo que puede meter el usuario)
   	 * @return el long que el usuario inserta
   	 */
    public static long longMinMax(String cadena, long min, long max) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                opc = sc.nextInt();
                if (opc < min || opc > max) {
                    System.out.println("El valor ha de estar entre " + min + " y " + max);
                    sc.nextLine();
                } else {
                    enc = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("No se pueden introducir caracteres");
                sc.nextLine();
            }
        }
        return opc;
    }

    //Utils de char.
    /**
     * recoge un caracter introducido por teclado y lo almacena en una variable char
     * @param cadena (frase para pedir el dato al usuario)
     * @return el char que se ha almacenado
     */
    public static char leerChar(String cadena) {
        Scanner sc = new Scanner(System.in);
        char opc = 0;
        boolean enc = false;
        while (enc == false) {

            try {
                System.out.println(cadena);
                String texto = sc.nextLine();
                opc = texto.charAt(0);
                enc = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Por favor, introduce un caracter.");
                //sc.nextLine();
            }

        }
        return opc;
    }
/**
 * 
 * @param cadena (frase para pedir el dato al usuario)
 * @param opciones (un array de caracteres aceptados)
 * @return  el char que se ha almacenado
 */
    public static char leerCharEspecifico(String cadena, char[] opciones) {
        Scanner sc = new Scanner(System.in);
        char opc = 0;
          
        boolean enc = false;
        System.out.println(cadena);
        while (enc == false) {

            try {
                
                String texto = sc.nextLine();

                opc = texto.charAt(0);
                for (int i = 0; i < opciones.length; i++) {
                    if (Character.toUpperCase(opc) == Character.toUpperCase(opciones[i])) {
                        enc = true;
                    }

                }
                if (!enc) {

                    System.out.print("Opción incorrecta. Los posibles carácteres son ");
                    for (int ii = 0; ii < opciones.length; ii++) {
                        System.out.print(opciones[ii] + " ");
                    }
                    System.out.println(".");
                }
            } catch (StringIndexOutOfBoundsException e) {

            }
        }

        return Character.toUpperCase(opc);
    }
/**
 * 
 * @param cadena (frase para pedir la fecha al usuario)
 * @return fecha en una variale localdate
 */
    public static LocalDate pedirFecha(String cadena) {
        System.out.println(cadena);
        boolean enc=false;
        LocalDate lcd=null;
        while (enc == false) {
            try {
                
                int dia = utils.leerDatoEntero("Introduce el día", 1, 31);
                int mes = utils.leerDatoEntero("Introduce el mes en formato MM", 1, 12);
                int anio = utils.leerDatoEntero("Introduce el año en formato AAAA", 1900, 2100);
                lcd=LocalDate.of(anio, mes, dia);
                enc=true;
            } catch (java.time.DateTimeException e) {
                System.out.println("Esa fecha no existe.");
            }
        }
        return lcd;
    }
    
    /**
     * 
     * @param cadena (frase para pedir el dato al usuario)
     * @return cadena de texto devuelta por el usuario
     */
    public static String pedirString(String cadena){
        Scanner sc = new Scanner(System.in);
        System.out.println(cadena);
        return sc.nextLine();
    }
    
}