import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c, x, y;
        System.out.print("El valor de a es: ");
        a = leer.nextInt();
        System.out.print("El valor de b es: ");
        b = leer.nextInt();
        System.out.print("El valor de c es: ");
        c = leer.nextInt();
        System.out.print("El valor de x es: ");
        x = leer.nextInt();
        y = (a*(x*x))+(b*x)+c;
        System.out.print("y = " +y);


    }
}