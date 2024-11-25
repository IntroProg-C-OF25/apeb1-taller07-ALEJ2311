/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 5, limite, contador2 = 8;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while(contador <= limite){
            System.out.print(contador + "/" + (contador2 + 2) + ", ");
            contador+=5;
            contador2+=2;
        }
        System.out.println("");
    }
    
}
/***
 * run:
 *DAME EL LIMITE: 30
 *5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 
 *BUILD SUCCESSFUL (total time: 2 seconds)
 */