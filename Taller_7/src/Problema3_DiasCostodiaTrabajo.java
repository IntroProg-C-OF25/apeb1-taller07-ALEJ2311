
import java.util.Scanner;

public class Problema3_DiasCostodiaTrabajo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String NomEmpleado;
        int diasWork, costoDia, costoPagar, contador = 1;
        while(contador <= 5){
            System.out.print("INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR DÍA DEL EMPLEDADO" + contador + ": ");
            NomEmpleado = tcl.next();
            diasWork = tcl.nextInt();
            costoDia = tcl.nextInt();
            costoPagar = (diasWork * costoDia);
            System.out.printf("| %10s\t| %10s\t| %10s\t| %10s\t|\n", "NOMBRE", "DIAS", "COSTO DIA", "TOTAL");
            System.out.printf("| %10s\t| %10d\t| %10d\t| %10d\t|\n", NomEmpleado, diasWork, costoDia, costoPagar);
            contador++;
        }
    }
 /***
  * run:
I * NGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO1: Jesus 10 4
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|      Jesus	|         10	|          4	|         40	|
I * NGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO2: Angel 7 10
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|      Angel	|          7	|         10	|         70	|
I * NGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO3: Patricio 9 12
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|   Patricio	|          9	|         12	|        108	|
I * NGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO4: Edison 20 5
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|     Edison	|         20	|          5	|        100	|
I * NGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO5: Manuel 60 20
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|     Manuel	|         60	|         20	|       1200	|
B * BUILD SUCCESSFUL (total time: 56 seconds)
  */   
}
