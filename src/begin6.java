import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Paralelepepidning a tomonini kiriting: ");

        int a = sc.nextInt();

        System.out.print("Paralelepepidning b tomonini kiriting: ");

        int b = sc.nextInt();

        System.out.print("Paralelepepidning c tomonini kiriting: ");

        int c = sc.nextInt();

        int v = a * b * c;

        int s = 2 * (a * b + b * c + a * c);

        System.out.print("Paralelepepidning hajmi: ");

        System.out.println(v);

        System.out.print("Paralelepepidning to'la sirti: ");

        System.out.println(s);
    }
}
