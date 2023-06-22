import java.util.Scanner;

public class begin7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Doiraning radiusini kirirting: ");

        int r = sc.nextInt();

        double p = 3.14;

        double l = 2 * p * r;

        double s = p * r * r;

        System.out.print("Doiraning uzunligi: ");

        System.out.println(l);

        System.out.print("Doiraning yuzasi: ");

        System.out.println(s);
    }
}
