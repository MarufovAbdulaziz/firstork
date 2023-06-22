import java.util.Scanner;

public class begin13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinchi sonni kiriting: ");

        int r1 = sc.nextInt();

        System.out.print("Ikkinchi sonni kiriting: ");

        int r2 = sc.nextInt();

        System.out.println("Uchinchi son: 3.14");

        double p = 3.14;

        double s1 = p * r1;

        double s2 = p * r2;

        double s3 = p * (r1 - r2);

        System.out.print("Birinchi sonning yig'indisi: ");

        System.out.println(s1);

        System.out.print("Ikkinchi sonning yig'indisi: ");

        System.out.println(s2);

        System.out.print("Uchinchi sonning yig'indisi: ");

        System.out.println(s3);



    }
}
