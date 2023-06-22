import java.util.Scanner;

public class begin4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Aylananing diametrini kiriting: ");

        int d = sc.nextInt();

        double p = 3.14;

        System.out.print("Aylananing uzunligi: ");

        double L = p * d;

        System.err.println(L);
    }
}
