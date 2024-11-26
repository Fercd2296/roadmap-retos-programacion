/* EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 */

 public class Fercd2296 {

    public static void main(String[] args) {
        // https://www.java.com

        // Comentari de una linea

        /*
         * comentari de
         * varias lienas
         */

        String mi_variable = "variable";
        final int Contante = 22;

       //A continuación voy a escribir los tipos primitivos de variables para numeros

       byte bite = 11;
       short corto = 25;
       int entero = 38;
       long largo = 45;
       float flotante = 5.58f;
       double numDecimal = 6.63;

       //El tipo primitivo de texto sería Char, ya que String es un tipo de dato de referencia porque hacen referencia a objetos
       char caracter = 'c';
       
       //El tipo primitivo de booleano es boolean
       boolean dormido = false;

       System.out.println("Hola Mundo");

    }
}
