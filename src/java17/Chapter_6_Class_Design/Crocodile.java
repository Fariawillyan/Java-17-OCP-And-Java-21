package java17.Chapter_6_Class_Design;

public class Crocodile extends Reptile{
    protected  int speed = 20;

    public int getSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
        System.out.println(croc.getSpeed2());
    }

    // Calling the super Reference
    public int getSpeed2(){
        return super.speed;
    }





}
