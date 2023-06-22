import java.util.Scanner;

public class begin18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Birinchi sonni kiriting: ");

        int a = sc.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");

        int b = sc.nextInt();

        System.out.print("Uchinchi sonni kiriting: ");

        int c = sc.nextInt();

        int u = a * c;

        int q = b * c;

        System.out.print("Birinchi va Uchinchi sonlar ko'paytirish  natijasi: ");

        System.out.println(u);

        System.out.print("Ikkinchi va uchinchi sonlar qo'shilish natijasi: ");

        System.out.println(q);
    }
}
