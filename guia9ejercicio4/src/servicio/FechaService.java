/*
-Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

-Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date();

-El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
   Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
   
        public Date fechaNacimiento(int dia,int mes,int anio){                                 
            return new Date(anio-1900,mes-1,dia);
        }
        public Date fechaActual(){            
            return new Date();
        }            
        public int diferencia(Date fecha1, Date fechaActual){
           int edad;           
            edad = fechaActual().getYear()-fecha1.getYear();            
            return edad-1;           
        }  
}
