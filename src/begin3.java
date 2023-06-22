import java.util.Scanner;

public class begin3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kvadratning a tomonini kiriting: ");

        int a = sc.nextInt();

        System.out.print("Kvadratning b tomonini kiriting: ");

        int b = sc.nextInt();

        int S = a * b;

        int p = 2 * (a + b);

        System.out.print("Kvadratning yuzasi: ");

        System.out.println(S);

        System.out.print("Kvadratning perimetri: ");

        System.out.println(p);
    }
}
