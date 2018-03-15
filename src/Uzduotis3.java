import java.util.Scanner;
public class Uzduotis3 {

    public static void main(String[] args) {
    int a = 0;
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Iveskite skaicius tol kol Ivesite '0' : ");
            int b = reader.nextInt();
            a = a + b;
            for(int i = 1; b >= i; i++) {
                System.out.println("Iveskite skaiciu: ");
                a = reader.nextInt();
                a = a + a;
            }
            reader.close();
        } while (a != 0);
        System.out.println(a);

    }
}
