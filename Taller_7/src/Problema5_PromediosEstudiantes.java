
/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
 * ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro
 * el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;

public class Problema5_PromediosEstudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        String reporteEstudiantes = "Reporte de Estudiantes\n";
        int promedio;
        int contador = 1;
        while(contador <= 4){
            System.out.print("DAME NOMBRE Y PROMEDIO DEL EST_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextInt();
            if(promedio < 7){
                estado = "Reprobado";
            }else{
                estado = "Aprobado";
            }
            reporteEstudiantes += String.format("| %10s\t| %10s\t| %10s\t|\n","NOMBRE", "PROMEDIO","ESTADO");
            reporteEstudiantes += String.format("| %10s\t| %10d\t| %10s\t|\n", nombre, promedio, estado);
            contador++;
        }
        System.out.println(reporteEstudiantes);
        
    }
    
}
/***
 run:
* DAME NOMBRE Y PROMEDIO DEL EST_1: Jesus 5
* DAME NOMBRE Y PROMEDIO DEL EST_2: Patrico 4
* DAME NOMBRE Y PROMEDIO DEL EST_3: Elen 10
* DAME NOMBRE Y PROMEDIO DEL EST_4: angel 9
* Reporte de Estudiantes
* |     NOMBRE	|   PROMEDIO	|     ESTADO	|
* |      Jesus	|          5	|  Reprobado	|
* |     NOMBRE	|   PROMEDIO	|     ESTADO	|
* |    Patrico	|          4	|  Reprobado	|
* |     NOMBRE	|   PROMEDIO	|     ESTADO	|
* |      Elena	|         10	|   Aprobado	|
* |     NOMBRE	|   PROMEDIO	|     ESTADO	|
* |      Angel	|          9	|   Aprobado	|

 * BUILD SUCCESSFUL (total time: 22 seconds)
 */