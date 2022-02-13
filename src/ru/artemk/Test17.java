package ru.artemk;

public class Test17 {
    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        /*
         * If both refer to the same object, they are equal
         */
        if(sb1 == sb2)
            return true;

        /*
         * If any of them is null, then they are not equal.
         * We know both are not null at this point because of the previous
         * condition which checks equality.
         */
        if(sb1 == null || sb2 == null)
            return false;

        boolean isEqual = true;

        /*
         * If both are not same length, they are not equal
         */
        if(sb1.length() == sb2.length()){
            /*
             * Now, compare the characters one by one, and break the loop
             * as soon as the characters at given position are different.
             */
            for(int i = 0 ; i < sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }
        return isEqual;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");

        if (Test17.ravenstvo(sb1, sb2)) System.out.println("Равны");
        else System.out.println("Не равны !");
    }
}
