
/** *
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 *
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;

public class Problema4_Jugadores {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String listaJugadores = "Lista de jugadores\n";
        String nombre, posicion, pregunta = "no";
        int edad, contador = 1;
        double estatura, sumaEdad = 0, sumaEstatura = 0, promEdad, promEstatura;
        
        while (true) {
            System.out.println("DATOS DEL JUGADOR");
            System.out.print("INGRESE NOMBRE: ");
            nombre = tcl.nextLine();
            
            System.out.print("INGRESE POSICION: ");
            posicion = tcl.nextLine();
            
            System.out.print("INGRESE EDAD: ");
            edad = tcl.nextInt();
            
            System.out.print("INGRESE ESTATURA(MTS): ");
            estatura = tcl.nextDouble();
            tcl.nextLine();
            
            sumaEdad += edad;
            sumaEstatura += estatura;
            
            listaJugadores +=(String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura));

            System.out.print("DESEA INGRESAR MAS JUGADORES?(SI/NO): ");
            pregunta = tcl.nextLine();
            if (pregunta.equalsIgnoreCase("NO")) {
                break;
            }
            contador++;
        }
        promEdad = (sumaEdad / contador);
        promEstatura = (sumaEstatura / contador);
        System.out.print(listaJugadores);
        System.out.printf("Promedio de edades: %.1f\n", promEdad);
        System.out.printf("Promedio de estaturas: %.2f\n", promEstatura);

        
    }

}
/**
 * *
 * run: 
 * DATOS DEL JUGADOR 
 * INGRESE NOMBRE: Jesus Rivas 
 * INGRESE POSICION: Extremo
 * INGRESE EDAD: 18 
 * INGRESE ESTATURA(MTS): 1,6 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): SI 
 * DATOS DEL JUGADOR 
 * INGRESE NOMBRE: Patricio Rivas
 * INGRESE POSICION: Defensa 
 * INGRESE EDAD: 17 
 * INGRESE ESTATURA(MTS): 1,75 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): SI 
 * DATOS DEL JUGADOR
 * INGRESE NOMBRE: Angel Aguilar 
 * INGRESE POSICION: Defensa 
 * INGRESE EDAD: 18 
 * INGRESE ESTATURA(MTS): 1,77 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): SI 
 * DATOS DEL JUGADOR INGRESE
 * NOMBRE: Ricardo Cabanilla 
 * INGRESE POSICION: Extremo 
 * INGRESE EDAD: 23 
 * INGRESE ESTATURA(MTS): 1,68 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): SI 
 * DATOS DEL JUGADOR INGRESE NOMBRE: Jorge Sanchez 
 * INGRESE POSICION: Delantero 
 * INGRESE EDAD: 20 
 * INGRESE ESTATURA(MTS): 1,7 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): SI
 * DATOS DEL JUGADOR
 * INGRESE NOMBRE: Nicolas Gaibor 
 * INGRESE POSICION: Arquero
 * INGRESE EDAD: 18 
 * INGRESE ESTATURA(MTS): 1,82 
 * DESEA INGRESAR MAS JUGADORES?(SI/NO): NO
 *
 * INFORMACION JUGADORES 
 * 1. Jesus Rivas -Extremo-, edad 18, estatura 1,60 
 * 2. Patricio Rivas -Defensa-, edad 17, estatura 1,75 
 * 3. Angel Aguilar -Defensa-, edad 18, estatura 1,77 
 * 4. Ricardo Cabanilla -Extremo-, edad 23, estatura 1,68
 * 5. Jorge Sanchez -Delantero-, edad 20, estatura 1,70 
 * 6. Nicolas Gaibor -Arquero-, edad 18, estatura 1,82 
 * Promedio de edades: 19,0 
 * Promedio de estaturas: 1,72
 */
