import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numeroStr = scanner.nextLine();
        int decimal = 0;

        try  {
            decimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException err) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
        }

        System.out.println("decimal = " + decimal);

        String resultadoBinario = "numero binario de " + decimal + " = " + Integer.toBinaryString(decimal);
        String resultadoOctal = "numero octal de " + decimal + " = " + Integer.toOctalString(decimal);
        String resultadoHexadecimal = "numero hexadecimal de " + decimal + " = " + Integer.toHexString(decimal);


        String mensaje = resultadoBinario;
        mensaje += '\n' + resultadoOctal;
        mensaje += '\n' + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
