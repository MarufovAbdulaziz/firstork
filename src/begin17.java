import java.util.Scanner;

public class begin17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");

        int a = scanner.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");

        int b = scanner.nextInt();

        System.out.print("Uchinchi sonni kiriting: ");

        int c = scanner.nextInt();

        int o = a + c;

        int m = b + c;

        System.out.print("Birinchi va Uchinchi sonlar qo'shilish natijasi: ");

        System.out.println(o);

        System.out.print("Ikkinchi va uchinchi sonlar qo'shilish natijasi: ");

        System.out.println(m);
    }
}
