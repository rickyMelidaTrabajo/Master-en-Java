import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int decimal = 0;
        try  {
            decimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            //System.exit(0);
        }

        System.out.println("decimal = " + decimal);

        String resultadoBinario = "numero binario de " + decimal + " = " + Integer.toBinaryString(decimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + decimal + " = " + Integer.toOctalString(decimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de " + decimal + " = " + Integer.toHexString(decimal);
        System.out.println(resultadoHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


        String mensaje = resultadoBinario;
        mensaje += '\n' + resultadoOctal;
        mensaje += '\n' + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
