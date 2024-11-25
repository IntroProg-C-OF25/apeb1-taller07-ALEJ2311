
/** *
 * Problema 7
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;

public class Problema7_Serie3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1 = 1, contador = 1, limite = 0;
        System.out.print("INGRESE UN LIMITE: ");
        limite = tcl.nextInt();
        System.out.print("Sumatoria = ");
        while (contador <= limite) {
            if(contador % 2 == 0){
                System.out.print( "+" +"(" + num1 + "/" + contador + ")");
            }else{
                System.out.print( "-" +"(" + num1 + "/" + contador + ")");
            }
            contador++;
        }
    }

}
/***
 * INGRESE UN LIMITE: 10
 * Sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)BUILD SUCCESSFUL (total time: 1 second)

 */
