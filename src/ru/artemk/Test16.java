package ru.artemk;

class EMAil {

    static void printMail(String email) {
        int start = email.indexOf('@');
        int end_com = email.indexOf(".com");
        int end_ru = email.indexOf(".ru");
        int end_org = email.indexOf(".org");

        if (start != -1) {
            if (end_com != -1) System.out.println(email.substring(start+1, end_com));
            if (end_ru != -1) System.out.println(email.substring(start+1, end_ru));
            if (end_org != -1) System.out.println(email.substring(start+1, end_org));
        }
    }

    static void printMail2(String email) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                start = i + 1;
            }
            if (email.charAt(i) == '.') {
                end = i;
            }
        }
        System.out.println(email.substring(start, end));
    }

    static void printMail3(String emails) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < emails.length(); i++) {
            if (emails.charAt(i) == '@') start = i + 1;
            if (emails.charAt(i) == '.') end = i;
            if (emails.charAt(i) == ';') System.out.println(emails.substring(start, end));
        }
    }

    static void printMail4(String emails) {
        int a = 0;
        int b = 0;
        int c = 0;

        while(c < emails.length() - 1){
            a = emails.indexOf('@', c);
            b = emails.indexOf('.', c);
            c = emails.indexOf(';', c + 1);
            System.out.println(emails.substring(a + 1, b));
        }
    }
}

public class Test16 {
    public static void main(String[] args) {
        long m = System.nanoTime();
        EMAil.printMail("ya@yahoo.com");
        EMAil.printMail("on@yandex.ru");
        EMAil.printMail("ona@gmail.com");
        EMAil.printMail("info@mail.org");
        System.out.println(System.nanoTime() - m);

        System.out.println("---------------------------");
        m = System.nanoTime();
        EMAil.printMail2("ya@yahoo.com");
        EMAil.printMail2("on@yandex.ru");
        EMAil.printMail2("ona@gmail.com");
        EMAil.printMail2("info@mail.org");
        System.out.println(System.nanoTime() - m);

        System.out.println("---------------------------");
        m = System.nanoTime();
        EMAil.printMail3("ya@yahoo.com; on@yandex.ru; ona@gmail.com; info@mail.org;");
        System.out.println(System.nanoTime() - m);

        System.out.println("---------------------------");
        m = System.nanoTime();
        EMAil.printMail4("ya@yahoo.com; on@yandex.ru; ona@gmail.com; info@mail.org;");
        System.out.println(System.nanoTime() - m);
    }
}
