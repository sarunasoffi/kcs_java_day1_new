
public class ThirdClass {

    public static void main(String[] args) {

        //tuscias masyvas
        String[] mas = new String[5];

        mas[0] = "Sarunas";

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        //uzpildytas masyvas
        String[] mas2 = {
                "Andrius",
                "Jonas",
                "Kestas",
                "Povilas",
                "Pete"
        };

        for(String m : mas2) {
            System.out.println(m);
        }


        //if sutrumpinimas
        int a = 41;
        int b = 39;
        int max = a > 40 ? a : b;
        System.out.println(max);
    }
}
