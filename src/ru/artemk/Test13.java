package ru.artemk;

class Month {
    static void viewDaysInMonth(byte nMon) {
        switch (nMon) {
            case 1:
                System.out.println("В Январе 2022 года - 31 день.");
                break;
            case 2:
                System.out.println("В Феврале 2022 года - 28 дней.");
                break;
            case 3:
                System.out.println("В Марте 2022 года - 31 день.");
                break;
            case 4:
                System.out.println("В Апреле 2022 года - 30 дней.");
                break;
            case 5:
                System.out.println("В Мае 2022 года - 31 день.");
                break;
            case 6:
                System.out.println("В Июне 2022 года - 30 дней.");
                break;
            case 7:
                System.out.println("В Июле 2022 года - 31 день.");
                break;
            case 8:
                System.out.println("В Августе 2022 года - 31 день.");
                break;
            case 9:
                System.out.println("В Сентябре 2022 года - 30 дней.");
                break;
            case 10:
                System.out.println("В Октябре 2022 года - 31 день.");
                break;
            case 11:
                System.out.println("В Ноябре 2022 года - 30 дней.");
                break;
            case 12:
                System.out.println("В Декабре 2022 года - 31 день.");
                break;
            default:
                System.out.println("Не верный номер месяца !");
        }
    }
}

public class Test13 {

    public static void main(String[] args) {
        Month.viewDaysInMonth((byte) 12);
        Month.viewDaysInMonth((byte) 2);
        Month.viewDaysInMonth((byte) 99);
    }
}
