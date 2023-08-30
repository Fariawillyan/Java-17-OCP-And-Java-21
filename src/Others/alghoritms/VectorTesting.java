package Others.alghoritms;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTesting {


    public static void main(String[] args) throws InterruptedException {

        int size = 1_000_000;

        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for(int i=0; i < size; i++){
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("added "  + size + " elements to ArrayList: " + ( end - start) +" ms");


        List<Integer> vectorList = new Vector<>();

        start = System.currentTimeMillis();

        for(int i=0; i < size; i++){
            vectorList.add(i);
        }

        end = System.currentTimeMillis();
        System.out.println("added "  + size + " elements to vectorList: " + ( end - start) +" ms");

        /** You can to correct this problem with ... = Collections.synchronizedList(new ArrayList<>(); **/ //threadsafe
        List<Integer> multiThreadList = new ArrayList<>();
        start = System.currentTimeMillis();

        Thread t1 = new Thread(()-> {
            for(int i=0; i < size; i++){
                multiThreadList.add(i);
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i=0; i < size; i++){
                multiThreadList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("added  elements to multiThreadList way to ArraytList: " + ( end - start) +" ms");
        System.out.println("size is " + multiThreadList.size());


        List<Integer> multiThreadVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(()-> {
            for(int i=0; i < size; i++){
                multiThreadVector.add(i);
            }
        });

        t2 = new Thread(()-> {
            for(int i=0; i < size; i++){
                multiThreadVector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("added  elements to multiThreadList way to ArrayVector: " + ( end - start) +" ms");

        System.out.println("size is " + multiThreadVector.size());

    }


}
