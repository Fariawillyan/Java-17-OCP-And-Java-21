package java17.Chapter_5_Methods;

public class Passing_Data_among_methods {

    /**
     * Java is a "##### pass-by-value ######" language. This means that a copy of variable is made and the method receives tha copy.    *
     * Assignments made in the method do not affect the caller.     *
     */

    public static void main(String[] args) {
        //primitive
        int num = 4;
        newNumber(num);
        System.out.println(num);
        //the variable on line 12 never changes because no assignments are made to it

        //objects
        String name = "webby";
        speak(name);
        System.out.println(name);
        //the correct is webby. The variable assignment is only ti the method parameter and doesn't affect the caller.


        //In this case, falar() calls a method on the parameter.the variable s is a copy of the variable nome.
        //both point to the same StringBuilder, which means that changes made to the StringBuilder are available to both references.
        var nome = new  StringBuilder("willyan");
        falar(nome);
        System.out.println(nome);

    }

    public static void falar(StringBuilder s) {
        s.append("Henrique");
    }

    public static void speak(String name ){
        name = "Faria";
    }

    public static void newNumber(int num) {
        num = 8;
    }


}
