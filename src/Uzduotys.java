
public class Uzduotys {

    public static void main(String[] args) {

        // 1 uzduotis
        Integer(10);


        // 2 uzduotis
        String2("as", "kestutis");


        // 3 uzduotis
        Integer3(5.0, 5.5);

        //4 uzduotis
        System.out.println(Uzduotis4(2));

        // 5 uzduotis
        System.out.println(String5('a', 's'));
    }



    // 1 uzduotis
    private static void Integer(int a) {
        System.out.println(a + " " + ++a);
    }

    // 2 uzduotis
    private static void String2(String a, String b) {
        System.out.println(a + " " + b);
    }

    // 3 uzduotis
    private static void Integer3(double c, double d) {
        System.out.println(c);
        System.out.println(c + d);
    }

    // 4 uzduotis
    private static int Uzduotis4(int a) {
        int result = a * 2;
        return result;
    }

    // 5 uzduotis
    private static String String5(char a, char b) {
        String resultatas = a + "" + b;
        return resultatas;
    }
}
