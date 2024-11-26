/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
*/

public class Fercd2296 {
   
    // Variable Local
    public int variableLocal = 10;
    {
        System.out.println(variableLocal);
    }

    // Sin parámetros ni retorno
    public static void Saludar() {
        System.out.println("¡Hola Mundo!");
    }

    // Con uno o varios parámetros, sin retorno
    public static void mostrarNombre(String nombre) {
        System.out.println("Mi nombre es: " + "Carlos Paredes");
    }

    // Con retorno y parámetros
    public static void Suma(int x, int b) {
        System.out.println(x + b);
    }

    // Funciones dentro de funciones (Java no permite anidarlas directamente)
    public static String funcionPrincipal() {
        class Interna {
            public String funcionInterna() {
                return ("Soy una funcion interna");
            }
        }
        Interna interna = new Interna();
        return interna.funcionInterna();
    }

    // Uso de funciones predefinidas
    public static int longitudTexto(String texto) {
        return texto.length();// Utiliza el método predefinido length()
    }

    // Dificultad extra (FizzBuzz)
    public static int fizzBuzz(String cadena1, String cadena2) {
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(cadena1 + cadena2); // Múltiplo de 3 y 5
            } else if (i % 3 == 0) {
                System.out.println(cadena1); // Múltiplo de 3
            } else if (i % 5 == 0) {
                System.out.println(cadena2); // Múltiplo de 5
            } else {
                System.out.println(i); // No múltiplo de 3 ni de 5
                contador++;
            }
        }

        return contador;
    }

}
