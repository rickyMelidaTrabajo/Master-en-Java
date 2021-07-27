/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Mélida
 */
public class Variables {

    /* Primitivo boolean */
    boolean a = true;
    boolean b = false;

    /* Primitivo char */
    char r = 'r';
    char c = '\u0021';
    char retroceso = '\b';
    char nuevaLinea = '\n';
    char retornoDeCarro = '\r';
    char tabulador = '\t';
    //char diagonalInvertida = '//';
    char comillasDobles = '\"';
    
    /* Primitivos enteros */
    
    //entre -128 a 127
    byte enteroByte = 127;
    
    //entre -32768 a 32767
    short enteroShort = 32767;
    
    //enre -2147483648 a 2147483647 o 2^-32 a 2^32
    int enteroInt = 2147483647;
    
    //entre -9223372036854775808 a 9223372036854775807 o 2^-64 a 2^64
    long enteroLong = 922337203685477580L;

    /*Primitivos numeros reales*/
    //Estas se pueden expresar con notacion cientifica como 34E4
    
    //cuando se define una literal en float debe llevar la letra f o F al final
    //Si no se le coloca la f esta se define como double
    //entre -1.4E-45 a 3.4028235E38
    float realFloat = 3.1416f;
    
    //entre -4.9E-324 a 1.7976931348623157E308
    double realDouble = 4.7029235E3;

}
