import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String a = in.nextLine();
        int b=a.length();
        System.out.println();
        for (int x =0; x<b; x++){
            char c = a.charAt(x);
            System.out.println(c);
        }
    }
}
