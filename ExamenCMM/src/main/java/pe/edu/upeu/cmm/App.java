//======================================MENU DE OPCIONES========================================00
package pe.edu.upeu.cmm;

import java.io.IOException;
import pe.edu.upeu.cmm.examen.*;
import pe.edu.upeu.cmm.utils.*;

public class App{	

    public static void main(String[] args) throws IOException {
        try {
            LeerTeclado teclado=new LeerTeclado();    
            ResolucionExamen obj=new ResolucionExamen();

            char opcion='S'; //S=SI, N=NO
            String NumAlgoritm="01";

            do{            
                NumAlgoritm = teclado.leer("",
                "Ingrese el numero de Algoritmo que desee probar: \n01=Impuestos\n02= Tablas_Muiltipli\n03= Numeros_Perfectos \n04= ExponenteX");
				
                switch(NumAlgoritm){
                case "01":
				int NumVehiculos = teclado.leer(0,"Ingrese el numero de vehiculos");
				obj.Impuestos(NumVehiculos);
				break;
				case "02":
                int Tablas = teclado.leer(0,"Introduce un numero de tablas a multiplicar: ");
				obj.Tablas_Multipli(Tablas);
				break;
				case "03": 
				obj.Numeros_Perfectos();
				break;
				case "04":
				int n = teclado.leer(0,"Ingrese la base");
				int x = teclado.leer(0,"Ingrese el exponente");
				System.out.println("El resultado es: "+obj.ExponenteX(n,x));
				break;
                default: System.out.println("La opcion No existe!!"); break;
                }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }
    }
}
