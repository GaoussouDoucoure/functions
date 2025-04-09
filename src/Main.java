public class Main {
    public static void greet(){
        System.out.println("Hello world. I am in a method/function");
    } // this void method and will not return anything, mainly used for outputting

    public static int add(int a, int b){
        return a + b;
    } // this method return to add()


    public static String fullName(String first, String last){
        return first + ", " + last;
    }

    public static String agePhrase(int age){
        return  "Your age is" + " " + age;
    }

    public static void main(String[] args) {
        greet(); // void method
        greet(); // void method
        int sum = add(6, 7); //call/invoke the function above
        System.out.println(sum);
        System.out.println(add(11,22));
        System.out.println(fullName("Gaoussou", "Doucoure"));
        System.out.println(agePhrase(26));
    }
}