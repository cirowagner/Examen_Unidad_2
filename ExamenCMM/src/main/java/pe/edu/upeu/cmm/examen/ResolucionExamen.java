//============================================RESOLUCION DE EXAMEN============================================================================
package pe.edu.upeu.cmm.examen;
import pe.edu.upeu.cmm.utils.LeerTeclado;

public class ResolucionExamen{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	LeerTeclado leerT = new LeerTeclado();
//1 ===========================================================================================================================================
	public void Impuestos(int NumVehiculos){
	System.out.println("---IMPUESTOS---"); 
    System.out.println(); 	
	
	int CostoVehiculo = 0, Categoria = 0;
	double Impuesto1 = 0, Impuesto2 = 0, Impuesto3 = 0, ImpuestoTotal = 0;
	
	int x = 1;
	
    while(x <= NumVehiculos){
	
		Categoria = leerT.leer(0,"Ingrese la categoria del vehiculo numero "+x);
		CostoVehiculo = leerT.leer(0,"Ingrese el costo de vehiculo numero "+x);
		
		if(Categoria == 1){
			
			Impuesto1 = CostoVehiculo*0.10;
			System.out.println("El costo del vehiculo numero "+x+" es de "+CostoVehiculo+" y el impuesto a pagar por este es de: "+Impuesto1);
			
		}else if(Categoria == 2){
			Impuesto2 = CostoVehiculo * 0.07;
			System.out.println("El costo del vehiculo numero "+x+" es de "+CostoVehiculo+" y el impuesto a pagar por este es de: "+Impuesto2);
		
		}else{
			Impuesto3 = CostoVehiculo * 0.05;
			System.out.println("El costo del vehiculo numero "+x+" es de "+CostoVehiculo+" y el impuesto a pagar por este es de: "+Impuesto3);
        }
         x++;
  }
    ImpuestoTotal = Impuesto1 + Impuesto2 + Impuesto3;
	System.out.println("El impuesto total a pagar es de: "+ImpuestoTotal);
}

//2 =============================================================================================================================================

    public void Tablas_Multipli(int Tablas){
	
	 int i;
		System.out.println();
		
		int x = 0, n = 1;
		while(x < Tablas){
	    System.out.println("-------------");
		System.out.println(); 
        System.out.println("============");		
        System.out.println(ANSI_GREEN+"Tabla del " + n+""+ANSI_RESET);
		System.out.println("============");
		
        for(i = 1; i<=10; i++){
             System.out.println(ANSI_GREEN+""+n + " * " + i + " = " + n*i+""+ANSI_RESET); 
        }
		i++;
		n++;
		x++;
	   }
	 }
//3============================================================================================================================================

    public void Numeros_Perfectos(){

	double NumPerfect = 0;
	
	int x = 1, n = 2;
	
	while(x <= 6){
	if(n == 2){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El primer numero perfecto es: "+NumPerfect);
	
	}else if(n == 3){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El segundo numero perfecto es: "+NumPerfect);
	
	}else if(n == 5){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El tercer numero perfecto es: "+NumPerfect);
	
	}else if(n == 7){
	NumPerfect = Math.pow(2,n-1)*(Math.pow(2,n)-1);
	System.out.println("El cuarto numero perfecto es: "+NumPerfect);
	}
	x++;
	n++;
	}	
  }

//4============================================================================================================================================

public int ExponenteX(int n, int x){
	
	int Resultado = 0;
	
    if (x <= 0){
        Resultado = 1;
	}else{
		Resultado = n*ExponenteX(n,(x-1));
	}
	return Resultado;
  }
//Fin Resolucion de Examen=====================================================================================================================
 }


























