
public class ForthClass {

    //spausdiname
    public static void main(String[] args) {
        ForthClass methodExample = new ForthClass(); //objektas
        methodExample.sayHelloToUser("andrius");
        String name = methodExample.sayHelloToUser("jonas");
        System.out.println(name);

        sum(13, 56);
    }

    //nauja klase
    private String sayHelloToUser(String name) {
    String result = "Labas " + name;
    return result;
    }



    public static void sum(int numb, int numb2) {
        int result = numb + numb2;
        System.out.println(result);
    }

}
