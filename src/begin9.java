import java.util.Scanner;

public class begin9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");

        int a = sc.nextInt();

        System.out.print("B sonini kiriting: ");

        int b = sc.nextInt();

        double f = Math.sqrt(a * b);

        System.out.print("O'rta geometrigi: ");

        System.out.println(f);
    }
}
