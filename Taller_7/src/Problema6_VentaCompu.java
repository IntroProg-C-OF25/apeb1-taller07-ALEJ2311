
/** *
 * Problema 6
 * Una empresa de comercialización de computadoras realiza el proceso de venta
 * haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10%
 * Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 *
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente
 * Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author ALEJ2311
 */
import java.util.Scanner;

public class Problema6_VentaCompu {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, tipClient;
        double costCompu, desc = 0, subTotal, prFinal;
        String nombre;

        while (contador <= 7) {
            System.out.print("INGRESE SU NOMBRE: ");
            nombre = tcl.nextLine();
            System.out.print("INGRESE EL COSTO DE LA COMPUTADORA: ");
            costCompu = tcl.nextDouble();
            System.out.print("INGRESE SU TIPO DE CLIENTE: ");
            tipClient = tcl.nextInt();
            tcl.nextLine();
            if (tipClient == 1) {
                desc = 0.10;
            } else {
                if (tipClient == 2) {
                    desc = 0.2;
                } else {
                    desc = 0;
                }
            }
            subTotal = (costCompu * desc);
            prFinal = (costCompu - subTotal);
            System.out.println("Venta_" + contador + " " +  nombre +  " Cliente tipo" + tipClient + " Compra computadora en precio: " + costCompu
                    + " con un descuento de: " + subTotal + " Precio final de: " + prFinal );
            contador++;
        }
    }

}
/***
 * INGRESE SU NOMBRE: Jesus Rivas
 * INGRESE EL COSTO DE LA COMPUTADORA: 400
 * INGRESE SU TIPO DE CLIENTE: 1
 * Venta_1 Jesus Rivas Cliente tipo1 Compra computadora en precio: 400.0 con un descuento de: 40.0 Precio final de: 360.0
 * INGRESE SU NOMBRE: Patricio Rivas 
 * INGRESE EL COSTO DE LA COMPUTADORA: 400
 * INGRESE SU TIPO DE CLIENTE: 2
 * Venta_2 Patricio Rivas Cliente tipo2 Compra computadora en precio: 400.0 con un descuento de: 80.0 Precio final de: 320.0
 * INGRESE SU NOMBRE: Sebastian Serrano
 * INGRESE EL COSTO DE LA COMPUTADORA: 400
 * INGRESE SU TIPO DE CLIENTE: 3
 * Venta_3 Sebastian Serrano Cliente tipo3 Compra computadora en precio: 400.0 con un descuento de: 0.0 Precio final de: 400.0
 * INGRESE SU NOMBRE: Angel Aguilar
 * INGRESE EL COSTO DE LA COMPUTADORA: 500
 * INGRESE SU TIPO DE CLIENTE: 1
 * Venta_4 Angel Aguilar Cliente tipo1 Compra computadora en precio: 500.0 con un descuento de: 50.0 Precio final de: 450.0
 * INGRESE SU NOMBRE: Ricardo Cabanilla
 * INGRESE EL COSTO DE LA COMPUTADORA: 500
 * INGRESE SU TIPO DE CLIENTE: 2
 * Venta_5 Ricardo Cabanilla Cliente tipo2 Compra computadora en precio: 500.0 con un descuento de: 100.0 Precio final de: 400.0
 * INGRESE SU NOMBRE: Carlos Carrillo
 * INGRESE EL COSTO DE LA COMPUTADORA: 500
 * INGRESE SU TIPO DE CLIENTE: 3
 * Venta_6 Carlos Carrillo Cliente tipo3 Compra computadora en precio: 500.0 con un descuento de: 0.0 Precio final de: 500.0
 * INGRESE SU NOMBRE: Luis Sanchez
 * INGRESE EL COSTO DE LA COMPUTADORA: 600
 * INGRESE SU TIPO DE CLIENTE: 1
 * Venta_7 Luis Sanchez Cliente tipo1 Compra computadora en precio: 600.0 con un descuento de: 60.0 Precio final de: 540.0
 * BUILD SUCCESSFUL (total time: 1 minute 48 seconds)
 */