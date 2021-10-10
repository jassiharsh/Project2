package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        //declare arraylist
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(5);
        numList.add(8);
        numList.add(10);
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }
       numList.add(3, 12);
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        //arrayList can take multiple data types
        List<Object> objList = new ArrayList();
        objList.add("3");
        objList.add(3);
        objList.add('3');
        objList.add(3,5);
        objList.add(true);

    }
}
