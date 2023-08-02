public class Main {

    static void myMethod(String firstName, String lastName, int age) {
        /*Parameters act as variables inside the method, Parameters are specified after the method name,
        * inside the parentheses. you can add as many parameters as you want, just separate them with a comma*/
        System.out.println(firstName +" "+lastName +" is "+age +" years old" );

    }
    public static void main(String[] args) {
        myMethod("SAAD","RAMAH", 24);
        myMethod("IKRAM", "SAAD", 1);
        myMethod("HUSNA","SWALEH",20);

        /*When a parameter is passed to the method, it is called an argument. so from the above firstName and lastName
        * are parameters, while SAAD, RAMAH, 24 and so on are arguments.
        * And note that when you are working with multiple parameters, the method call must have the same number of
        * arguments as there are parameters, and the arguments must be passed in the same order*/
    }
}