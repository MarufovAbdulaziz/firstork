import java.util.Scanner;

public class begin12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");

        int a = sc.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");

        int b = sc.nextInt();

        int y = a * a + b * b;

        double c = Math.sqrt(y);

        double P = a + b + c;

        System.out.print("Birinchi sonni yig'indisi: ");

        System.out.println(P);

        System.out.println(c);
    }

}
