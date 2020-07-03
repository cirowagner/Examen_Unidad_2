//============================================RESOLUCION DE EXAMEN============================================================================
package pe.edu.upeu.cmm.examen;
import pe.edu.upeu.cmm.utils.LeerTeclado;

public class ResolucionExamen{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	
	LeerTeclado leerT = new LeerTeclado();
//1 ===========================================================================================================================================
	public void IMPUESTOS_POR_VEHICULOS(int NumVehiculos){
	System.out.println(ANSI_RED+"---IMPUESTOS---"+ANSI_RESET); 
    System.out.println(); 	
	
	int CostoVehiculo = 0, Categoria = 0;
	double Impuesto1 = 0, Impuesto2 = 0, Impuesto3 = 0, ImpuestoTotal = 0;
	
	int x = 1;
	
    while(x <= NumVehiculos){
	
		Categoria = leerT.leer(0,"Ingrese la categoria del vehiculo numero "+x);
		System.out.println();
		CostoVehiculo = leerT.leer(0,"Ingrese el costo de vehiculo numero "+x);
		System.out.println();
		
		if(Categoria == 1){
			Impuesto1 = CostoVehiculo * 0.10;
			System.out.println(ANSI_GREEN+"El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto1+" Soles"+ANSI_RESET);
			System.out.println("------------------------------------------------------------------------------------------------------");
		
		}else if(Categoria == 2){
			Impuesto2 = CostoVehiculo * 0.07;
			System.out.println(ANSI_GREEN+"El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto2+" Soles"+ANSI_RESET);
		    System.out.println("------------------------------------------------------------------------------------------------------");
		
		}else{
			Impuesto3 = CostoVehiculo * 0.05;
			System.out.println(ANSI_GREEN+"El costo del vehiculo numero "+x+" es de: S/"+CostoVehiculo+" Soles y el impuesto a pagar por este es de: S/"+Impuesto3+" Soles"+ANSI_RESET);
			System.out.println("------------------------------------------------------------------------------------------------------");
        }
         x++;
  }
    System.out.println();
    ImpuestoTotal = Impuesto1 + Impuesto2 + Impuesto3;
	System.out.println("El impuesto total a pagar es de: S/"+ImpuestoTotal+" Soles");
	System.out.println("=======================================================================");
	System.out.println(ANSI_RED+"---END---"+ANSI_RESET);
    System.out.println(); 
}

//2 =============================================================================================================================================

    public void TABLAS_DE_MULTIPLICACION(int Tablas){
		
	 int i;
		
		int x = 0, n = 1;
		while(x < Tablas){
	    System.out.println("-------------");
		System.out.println(); 
        System.out.println("============");		
        System.out.println(ANSI_RED+"Tabla del " + n+""+ANSI_RESET);
		System.out.println("============");
		
        for(i = 1; i<=10; i++){
             System.out.println(ANSI_GREEN+""+n + " * " + i + " = " + n*i+""+ANSI_RESET); 
        }
		i++;
		n++;
		x++;
	   }
	   System.out.println(ANSI_RED+"---END---"+ANSI_RESET);
	   System.out.println(); 
	 }
//3==============================================================================================================================================

    public void NUMEROS_PERFECTOS(){
	System.out.println(ANSI_RED+"---LOS CUATRO PRIMEROS NUMEROS PERFECTOS---"+ANSI_RESET); 
    System.out.println(); 
	
	double NumPerfect = 0;
	
	int x = 1, n = 2;
	
	while(x <= 6){
	if(n == 2){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println(ANSI_GREEN+"El primer numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,3"+ANSI_RESET);
	System.out.println("-------------------------------------------------------------------------------------"); 
	
	}else if(n == 3){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println(ANSI_GREEN+"El segundo numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,7,14"+ANSI_RESET);
	System.out.println("-----------------------------------------------------------------------------------------"); 
	
	}else if(n == 5){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println(ANSI_GREEN+"El tercer numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,8,16,31,62,124,248"+ANSI_RESET);
	System.out.println("----------------------------------------------------------------------------------------------------"); 
	
	}else if(n == 7){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println(ANSI_GREEN+"El cuarto numero perfecto es: "+NumPerfect+" y sus numeros enteros divisores son 1,2,4,8,16,32,64,127,254,508,1016,2032,4064"+ANSI_RESET);
	System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
	}
	x++;
	n++;
	}
  System.out.println(ANSI_RED+"---END---"+ANSI_RESET);
  System.out.println(); 	
  }

//4============================================================================================================================================

public int ExponenteX(int num, int exp){ 
	int Resultado = 0;
	
    if (exp <= 0){
        Resultado = 1;
	}else{
		Resultado = num*ExponenteX(num,(exp-1));
	}
	return Resultado;
  } 
//Fin Resolucion de Examen=====================================================================================================================
 }


























