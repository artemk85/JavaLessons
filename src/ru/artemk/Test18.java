package ru.artemk;

public class Test18 {
    static int [] sortirovka(int [] array) {
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static String showArray(String [][] array) {
        String output = "{";
        for (int i = 0; i < array.length; i++) {
            output +="{";
            for (int j = 0; j < array[i].length; j++) {
                output += array[i][j];
                if (j != array.length) {
                    output += ",";
                }
            }
            output +="},";
        }
        output +="}";
        return output;
    }

    public static void main(String[] args) {
        int [] array = {1, -5, 4, -199, 55, 11, -32, 23};
        String [][] strArray = {{"One", "Two"}, {"Three","Four"}, {"Five","Six", "Seven"}};
        int [] sort_array = Test18.sortirovka(array);

        for (int i=0; i< sort_array.length; i++){
            System.out.print(sort_array[i]);
            System.out.print(" ");
        }
        System.out.println("");

        System.out.println(Test18.showArray(strArray));
    }
}
