
public class SecondClass {
    public static void main(String[] args) {

        Integer integer = 123;
        Integer integer1 = Integer.parseInt("12345");
        Integer integer2 = Integer.valueOf("2222");

        // po = boolean yra klase, getbololean yra metodas
        Boolean booleanClass = Boolean.getBoolean("true");

        //sumos skaiciavimas su double
        Double doubleClass = Double.sum(123.44, 76.56);

        System.out.println(doubleClass);


    }
}
