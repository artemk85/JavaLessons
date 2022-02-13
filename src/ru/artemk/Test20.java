package ru.artemk;

import java.util.ArrayList;
import java.util.Collections;

public class Test20 {
    static ArrayList<String> abc(String ... strings) {
        ArrayList<String> new_aList = new ArrayList<>();

        for (String str: strings) {
//            boolean isPresent = false;
//            for (int i=0; i < new_aList.size(); i++){
//                if (str.equals(new_aList.get(i))) {
//                    isPresent = true;
//                    // System.out.println(String.format("str = %s, %d element = %s", str, i, new_aList.get(i)));
//                }
//            }
//            if (isPresent == false) new_aList.add(str);
            if (!new_aList.contains(str)) {
                new_aList.add(str);
            }
        }
        Collections.sort(new_aList);
        return new_aList;
    }

    public static void main(String[] args) {
        ArrayList t = Test20.abc(args);
        // System.out.println("ArrayList size = "+args.length);
        System.out.println(t);
    }
}
