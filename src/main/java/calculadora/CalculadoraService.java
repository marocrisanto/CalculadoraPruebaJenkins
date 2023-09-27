
package calculadora;

import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. 
Si no, se hace la división y se devuelve el resultado al main.
 */

//Clase de servicio para manipular objetos de la clase Operacion.
public class CalculadoraService {
 
   // d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Calculadora crearOperacion(){
        Scanner leer = new Scanner(System.in);
        //Solicitamos los datos al usuario y los guardamos en la variable local
        System.out.println("Ingrese el primer numero");
        int numero1 = leer.nextInt();
         System.out.println("Ingrese el segundo numero");
        int numero2 = leer.nextInt();
        return new Calculadora(numero1, numero2);
    } 
    
    //i) Método para mostrar el resultado de una suma.
    public void mostrarSuma(Calculadora operacion){
        int suma = operacion.sumar();
        System.out.println("La suma de los números es: "+suma);
    }
    
    //j) Método para mostrar el resultado de una resta.
    public void mostrarResta(Calculadora operacion){
        int resta = operacion.restar();
        System.out.println("La suma de los números es: "+resta);
    }
    
    //k) Método para mostrar el resultado de una multiplicación.
    public void mostrarMultiplicacion(Calculadora operacion){
        int multiplicacion = operacion.multiplicar();
        System.out.println("La multiplicacion de los números es: "+multiplicacion);
    }
    
    //l) Método para mostrar el resultado de una división.
    public void mostrarDivision(Calculadora operacion){
        int division = operacion.dividir();
        System.out.println("La división de los números es: "+division);
    }
}
