import java.util.Scanner;

public class begin10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A ni kiriting: ");

        int a = sc.nextInt();

        System.out.print("B ni kiriting: ");

        int b = sc.nextInt();

        int y = a + b;

        int p = a * b;

        int a2 = a * a;

        int b2 = b * b;

        System.out.print("Ikki son yidindisi: ");

        System.out.println(y);

        System.out.print("Ikki son ko'paytmasi: ");

        System.out.println(p);

        System.out.print("Birinchi sonning kvadrati: ");

        System.out.println(a2);

        System.out.print("Ikkinchi sonning kvadrati: ");

        System.out.println(b2);
    }
}
