import java.util.Scanner;

public class begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");//10

        int a = scanner.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");//5

        int b = scanner.nextInt();

        int yig = a + b;//15

        b = yig -  b;//10

        a = yig - a;//5

        System.out.println("A ning yangi qiymati: " + a);

        System.out.println("B ning yangi qiymati: " + b);


    }
}
