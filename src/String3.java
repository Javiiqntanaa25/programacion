import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String a = in.nextLine();
        int a2 = a.length();
        System.out.print("Introduzca el caracter que quiere comprobar cuantas veces se repite: ");
        char b = in.next().charAt(0);
        int contador = 0;
        int i=0;
        for (int x = 0; x<a2; x++){
            char d = a.charAt(x);
            if (d==b){
                contador++;
            }
        }

        System.out.println("El caracter " + b + " se repite " + contador + " veces");
    }
}
