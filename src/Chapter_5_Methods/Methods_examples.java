package Chapter_5_Methods;



public class Methods_examples {

    int hunger = 4;



/* return type other than void are required to have a return. This return statement
 must include the primitive or object to be returned.*/


    int getHeight1(){
        int temp = 9;
        return temp;
    }

    void nap(){
    }

    //parameter List and method signature
    public void visitZoo(String name, int waitTime){

    }
    public void oneExeption() throws IllegalArgumentException{}



    //declaring local and instance variable
    public int feedZooAnimals(){
        int snack = 10;

        if(snack > 4){
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }

    public void zooAnimalCheckup(boolean isWeekend){
        final int rest;

        if(isWeekend) rest = 5; else rest = 20;
        System.out.println(rest);

    }

    public static void main(String[] args) {
    Methods_examples teste = new Methods_examples();
     teste.zooAnimalCheckup(false);
        System.out.println(teste);
    }

    //The compiler does not apply a default value to final variables. must receive a value...

    /**
     * Varargs
     * A method can have at most one varargs parameter
     * if a method contains a varargs parameter, it must be the last parameter in the list.

     */

}

