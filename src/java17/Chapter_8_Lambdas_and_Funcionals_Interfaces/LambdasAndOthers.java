package java17.Chapter_8_Lambdas_and_Funcionals_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class LambdasAndOthers {
    private String testObj;
    public String getTestObj() {
        return testObj;
    }
    public void setTestObj(String testObj) {
        this.testObj = testObj;
    }

    public static void main(String[] args) {
        LambdasAndOthers lambdasAndOthers = new LambdasAndOthers();
        lambdasAndOthers.setTestObj("hello");

        AtomicReference<String> testThisObjAtomic = new AtomicReference<>(lambdasAndOthers.getTestObj());

        List<String> objFront = List.of("obj1", "obj1", "obj1", "obj4", "obj5");
        List<String> objTratadoListStream = new ArrayList<>(objFront);
        List<String> objTratadoList = new ArrayList<>();

        objFront.forEach(obj -> {
            if (!objTratadoList.contains(obj)) {
                objTratadoList.add(obj);
            }
        });

        if (!objTratadoList.isEmpty()) {
            //    objTratadoList.forEach(obj -> {
            testThisObjAtomic.set(lambdasAndOthers.getTestObj() + " - " + String.join(" - ", objTratadoList));
            //    });
        }

        //normal
        System.out.println(testThisObjAtomic);
        //with stream
        objTratadoListStream.stream().distinct().forEach(System.out::println);
    }
}
