/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preoyecto;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Preoyecto {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      



Scanner datos = new Scanner(System.in);
int op=0, a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0; 
System.out.println("SELECCIONE UNA OPCION");
System.out.println("1.SUMA ");
System.out.println("2.RESTA ");
System.out.println("3.MULTIPLICACION");
System.out.println("4.DIVICION");
System.out.println("5.PERIMETRO DE UN CUADRADO");
System.out.println("6.PERIMETRO DE UN TRIANGULO");
System.out.println("7.PERIMETRO DE UN RECTANGULO");
System.out.println("8.PERIMETRO DE UN ROMBO");
System.out.println("9.PERIMETRO DE UN ROMBOIDE ");
System.out.println("10.PERIMETRO DE UN PENTAGONO");
System.out.println("INGRESE EL NUMERO DE LA OPCION SELECCIONADA ");
op = datos.nextInt();
switch(op){
case 1: System.out.println("SUMA");
       	System.out.println("INGRESE EL PRIMER NUMERO QUE DESEA SUMAR:");
       	a = datos.nextInt();
	System.out.println("INGRESE EL SEGUNDO NUMERO QUE DESEA SUMAR:");
       	b = datos.nextInt();
	c= a + b;
	System.out.println("EL RESULTADO ES: " + c);
       	break;
case 2: System.out.println("RESTA");
       	System.out.println("INGRESE EL PRIMER NUMERO QUE DESEA RESTAR:");
       	a = datos.nextInt();
	System.out.println("INGRESE EL SEGUNDO NUMERO QUE DESEA RESTAR:");
       	b = datos.nextInt();
	c= a - b;
	System.out.println("EL RESULTADO ES: " + c);
       	break;
case 3: System.out.println("MULTIPLICACION");
       	System.out.println("INGRESE EL PRIMER NUMERO QUE DESEA MULTIPLICAR:");
       	a = datos.nextInt();
	System.out.println("INGRESE EL SEGUNDO NUMERO QUE DESEA MULTIPLICAR:");
       	b = datos.nextInt();
	c= a * b;
	System.out.println("EL RESULTADO ES: " + c);
       	break;
case 4: System.out.println("DIVICION");
       	System.out.println("INGRESE EL PRIMER NUMERO QUE DESEA DIVIDIR:");
       	a = datos.nextInt();
	System.out.println("INGRESE EL SEGUNDO NUMERO QUE DESEA DIVIDIR:");
       	b = datos.nextInt();
	c= a / b;
	System.out.println("EL RESULTADO ES: " + c);
       	break;
case 5: System.out.println("PERIMETRO DE UN CUADRADO");
       	System.out.println("INGRESE EL NUMERO DE SUS LADOS");
       	a = datos.nextInt();
	b= a * 4;
	System.out.println("EL RESULTADO ES: " + b);
       	break;
case 6: System.out.println("PERIMETRO DE UN TRIANGULO");
       	System.out.println("INGRESE EL NUMERO DE SU PRIMER LADO");
       	a = datos.nextInt();
       	System.out.println("INGRESE EL NUMERO DE SU SEGUNDO LADO");
       	b = datos.nextInt();
       	System.out.println("INGRESE EL NUMERO DE SU TERCER LADO");
        c = datos.nextInt();
	d = a + b + c ;
	System.out.println("EL RESULTADO ES: " + d);
       	break;
case 7: System.out.println("PERIMETRO DE UN RECTANGULO");
       	System.out.println("INGRESE EL NUMERO DE SU PRIMEROS LADOS IGUALES");
       	a = datos.nextInt();
       	System.out.println("INGRESE EL NUMERO DE SU SEGUNDOS LADOS IGUALES");
       	b = datos.nextInt();
	c = a + a ;
	d = b + b ;
	e = c + d ;
	System.out.println("EL RESULTADO ES: " + e);
       	break;
case 8: System.out.println("PERIMETRO DE UN ROMBO");
       	System.out.println("INGRESE EL NUMERO DE SUS LADOS");
       	a = datos.nextInt();
	b= a * 4;
	System.out.println("EL RESULTADO ES: " + b);
       	break;
case 9: System.out.println("PERIMETRO DE UN ROMBOIDE");
       	System.out.println("INGRESE EL NUMERO DE SU PRIMEROS LADOS IGUALES");
       	a = datos.nextInt();
       	System.out.println("INGRESE EL NUMERO DE SU SEGUNDOS LADOS IGUALES");
       	b = datos.nextInt();
	c = a + a ;
	d = b + b ;
	e = c + d ;
	System.out.println("EL RESULTADO ES: " + e);
       	break;
case 10: System.out.println("PERIMETRO DE UN PENTAGONO");
       	System.out.println("INGRESE EL NUMERO DE SUS LADOS");
       	a = datos.nextInt();
	b= a * 5;
	System.out.println("EL RESULTADO ES: " + b);
       	break;
}
}
}
    
    

