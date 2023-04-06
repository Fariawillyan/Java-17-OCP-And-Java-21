package Chapter_5_Methods;



public class Methods_examples {

    int hunger = 4;



/* return type other than void are required to have a return. This return statement
 must include the primitive or object to be returned.*/


    int getHeight1() {
        int temp = 9;
        return temp;
    }

    void nap() {
    }

    //parameter List and method signature
    public void visitZoo(String name, int waitTime) {

    }

    public void oneExeption() throws IllegalArgumentException {
    }


    //declaring local and instance variable
    public int feedZooAnimals() {
        int snack = 10;

        if (snack > 4) {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }

    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;

        if (isWeekend) rest = 5;
        else rest = 20;
        System.out.println(rest);

    }

    public static void main(String[] args) {
        Methods_examples teste = new Methods_examples();
        teste.zooAnimalCheckup(false);
        System.out.println(teste);
        run(11, 77);
        walkdog(1);
        walkdog(1, 2);
        walkdog(1, 2, 3);
        walkdog(1, new int[]{4, 5});

        int resultado1 = soma(1, 2, 3);
        System.out.println(resultado1);

        printMensagem("olá", "mundo");
    }

    //The compiler does not apply a default value to final variables. must receive a value...

    /**
     * Varargs
     * A method can have at most one varargs parameter
     * if a method contains a varargs parameter, it must be the last parameter in the list.
     */


    public void walk1(int... steps) {
    }

    public void walk2(int start, int... steps) {
    }
    //public void walk3(int...steps, int start){} // DOES NOT COMPILE
    //public void walk4(int...start, int... steps){} // DOES NOT COMPILE


    //exemplo
    public static void walk11(int... steps) {
        int[] step2 = steps;    //not necessary, but shows steps is of type int[].
        System.out.println(step2.length);
    }

    //acessing elements of a Varargs
    public static void run(int... steps) {
        System.out.println(steps[1]);
    }

    //using Varargs with other methods parametes
    public static void walkdog(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static int soma(int... numeros) {

        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static void printMensagem(String... mensagens) {

        for (String mensag : mensagens) {
            System.out.println(mensag);
        }

    }


}

