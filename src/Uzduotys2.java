import java.util.Scanner;
public class Uzduotys2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek norite skaiciu ivesti? : ");
        int n = reader.nextInt();



        for(int i = 0; n > i; i++) {
            System.out.println("Iveskite skaiciu: ");
            int a = reader.nextInt();
            if(a > 100) {
                System.out.println(a);
            }
        }

        reader.close();
    }



}
