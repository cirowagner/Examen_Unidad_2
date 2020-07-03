//======================================MENU DE OPCIONES====================================================================================00
package pe.edu.upeu.cmm;

import java.io.IOException;
import pe.edu.upeu.cmm.examen.*;
import pe.edu.upeu.cmm.utils.*;

public class App{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) throws IOException {
        try {
            LeerTeclado teclado=new LeerTeclado();    
            ResolucionExamen obj=new ResolucionExamen();

            char opcion='S'; //S=SI, N=NO
            String NumAlgoritm="01";

            do{          
				System.out.println(ANSI_PURPLE+"---¡HOLA!---"+ANSI_RESET);
                NumAlgoritm = teclado.leer("",
                ANSI_GREEN+"Ingrese el numero de Algoritmo que desee probar: \n"+
				"01= IMPUESTOS_POR_VEHICULOS\n"+
				"02= TABLAS_DE_MULTIPLICACION\n"+
				"03= NUMEROS_PERFECTOS\n"+
				"04= ExponenteX"+ANSI_RESET);
				
                switch(NumAlgoritm){
                case "01":
				int NumVehiculos = teclado.leer(0,ANSI_RED+"Ingrese el numero de vehiculos"+ANSI_RESET);
				obj.IMPUESTOS_POR_VEHICULOS(NumVehiculos);
				break;
				case "02":
                int Tablas = teclado.leer(0,ANSI_RED+"Introduce un numero de tablas a multiplicar"+ANSI_RESET);
				obj.TABLAS_DE_MULTIPLICACION(Tablas);
				break;
				case "03": 
				obj.NUMEROS_PERFECTOS();
				break;
				case "04":
				int num = teclado.leer(0,ANSI_RED+"Ingrese la base"+ANSI_RESET);
				int exp = teclado.leer(0,ANSI_RED+"Ingrese el exponente"+ANSI_RESET);
				System.out.println(ANSI_RED+"El resultado es: "+obj.ExponenteX(num,exp)+ANSI_RESET);
				break;
                default: System.out.println("La opcion No existe!!"); break;
                }   
                System.out.println();
                opcion=teclado.leer(' ', "|---¿Desea Probar mas Algoritmos?---> S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
		System.out.println();
		System.out.println(ANSI_PURPLE+"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"zzz    <---ESO ES TODO¡GRACIAS!--->       zzz"+ANSI_RESET);
		System.out.println(ANSI_PURPLE+"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+ANSI_RESET);
    }
}
