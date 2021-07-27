/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Mélida
 */
public class Primitivos {
    
    float realFloat = 1.5e3f;
    float realFloatNegative = 1.5e-10f;
    
    
    public void testByte() {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("El valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("El valor minimo de un byte: " + Byte.MIN_VALUE);
        
    }

    public void testShort() {
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("El valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("El valor minimo de un short: " + Short.MIN_VALUE);
    }
    
    public void testInteger() {
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("El valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int: " + Integer.MIN_VALUE);
    }
    
    public void testLong() {
        long numeroLong = 2147483648L; //Si no le colocamos la L nos lee como un int
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("El valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("El valor minimo de un long: " + Long.MIN_VALUE);
        
    }
}
