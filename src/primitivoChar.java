public class primitivoChar {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char sigma = '∑';
        var de= 64;
        char space = ' ';
        char backSpace = '\b'; //borra una caracter antes
        char tab = '\t'; //crea un espacio de tabulacion
        char newLine = '\n'; //crea una nueva linea

        //esto realiza un salto de linea en window
        // y en linux borra todo lo anterior y deja solo
        //lo que viene despues*/
        char returnCar = '\r';

        System.out.println("Caracter =" + returnCar + sigma);
        System.out.println("Decimal = " + Character.MAX_VALUE);
        System.out.println(de);
    }
}
