/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
*/

public class Fercd2296 {

    public static void main(String[] args) {
        // Operadores Aritmeticos
        System.out.println("Suma " + (5 + 2));
        System.out.println("Resta " + (5 - 2));
        System.out.println("Multiplicacion " + (5 * 2));
        System.out.println("Divicion " + (5 / 2));
        System.out.println("Modulo " + (5 % 2));

        // Operadores de Comparacion
        System.out.println("Igualdad " + (5 == 5));
        System.out.println("Diferencia " + (3 != 5));
        System.out.println("Menor que " + (5 < 5));
        System.out.println("Mayor que " + (5 > 5));
        System.out.println("Menor igual " + (5 <= 5));
        System.out.println("Mayor igual " + (5 >= 5));

        // Operadores Logicos
        boolean x = true , b = false;
        System.out.println("AND " + (x && b));
        System.out.println("OR " + (x || b));
        System.out.println("NOT " + (!x));

        // Operadores de Asignacion
        int a = 5;
        a += 10;
        a -= 4;
        System.out.println("Asignaciones: " + a );

         // Estructuras de Control Iterativas
         System.out.println("Bucle For:");
         for (int i = 0; i < 5; i++) {
             System.out.println(i);
         }
 
         System.out.println("Bucle While:");
         int contador = 0;
         while (contador < 5) {
             System.out.println(contador);
             contador++;
         }
 
         // Estructuras de Control de Excepciones
         try {
             int resultado = a / 0; // División por cero, lanza ArithmeticException
         } catch (ArithmeticException e) {
             System.out.println("¡Error! División por cero.");
         }
 
         // Opcional
         for (int i = 10; i <= 55; i++) {
             if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                 System.out.println(i);
             }
         }

    }
    
}