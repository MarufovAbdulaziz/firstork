import java.util.Scanner;

public class begin5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kubning yon tomonini kiriting: ");

        int a = sc.nextInt();

        int v = a * a * a;

        int s = 6 * a * a;

        System.out.print("Kubning hajmi: ");

        System.out.println(v);

        System.out.print("Kubning to'la sirti: ");

        System.out.println(s);
    }
}
