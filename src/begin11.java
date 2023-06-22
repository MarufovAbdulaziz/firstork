import java.util.Scanner;

public class begin11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");

        int a = sc.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");

        int b = sc.nextInt();

        int q = a + b;

        int k = a * b;

        int modula = Math.abs(q);

        int modulb = Math.abs(k);

        System.out.print("Birinchi sonning moduli: ");

        System.out.println(modula);

        System.out.print("Ikkinchi sonning moduli: ");

        System.out.println(modulb);

    }
}
