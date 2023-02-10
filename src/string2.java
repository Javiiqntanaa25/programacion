import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca una cadena: ");
        String a = in.nextLine();
        System.out.print("Introduzca la subcadena para comprobar si empiezan igual: ");
        String b = in.nextLine();
        boolean resultado = a.startsWith(b);
        if (resultado==true){
            System.out.println("La cadena empieza por la subcadena introducida");
        }else {
            System.out.println("La cadena no empieza por la subcadena introducida");
        }
    }
}
