package ru.artemk;

public class Test19 {
    static String[] abc(String[] ... arrays) {

        int count = 0;
        int i = 0;

        for(String[] array: arrays) {
            /*for(String a: array){
                count += 1;
            }*/
            count += array.length;
        }
        String[] new_array = new String[count];

        for(String[] array: arrays) {
            for(String a: array){
                new_array[i] = a;
                i++;
            }
        }

        return new_array;
    }

    public static void main(String[] args) {
        String[] array1 = {"one","two","3"};
        String[] array2 = {"four","5","six"};
        String[] array3 = {"seven","eight","nine"};
        String[] array4 = {"ten","11","tvelwe"};
        String[] array5 = {"many","years","ago"};
        String[] array6 = {"My","name","ArtemK"};

        String[] narr = Test19.abc(array1, array2, array3, array4, array5, array6);


        for(String el: narr){
            boolean eq = false;
            for (String arg: args) {
                if (el.equals(arg)) eq = true;
            }

            if (eq) System.out.print("null" + " " );
            else System.out.print(el + " ");
        }
        System.out.println();
    }
}
