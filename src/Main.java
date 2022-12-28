public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age =17;
        System.out.println("При возрасте "+age+" лет");
        if(age>=18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        age = age+4;
        System.out.println("При возрасте "+age+" лет");
        if(age>=18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature=20;
        System.out.println("При температуре воздуха "+temperature+" С");
        if(temperature>=5) System.out.println("Сегодня тепло, можно идти без шапки");
        else System.out.println("На улице холодно, нужно надеть шапку");
        temperature=temperature-17;
        System.out.println("При температуре воздуха "+temperature+" С");
        if(temperature>=5) System.out.println("Сегодня тепло, можно идти без шапки");
        else System.out.println("На улице холодно, нужно надеть шапку");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed =55;
        System.out.print("При скорости "+speed+" км/ч");
        if(speed>60) System.out.println(" вам придется заплатить штраф");
        else System.out.println(" можно ездить спокойно");
        speed = speed+30;
        System.out.print("При скорости "+speed+" км/ч");
        if(speed>60) System.out.println(" вам придется заплатить штраф");
        else System.out.println(" можно ездить спокойно");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age =1;
        do {
            if (age < 2) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно быть с мамой.");
            } else if (age <= 7) {
                  System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
            } else if (age <= 18) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
            } else if (age <= 24) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
            } else {
                System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
            }
            age = age + 5;
        } while (age<30);
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age =4;
        do {
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            } else if (age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен "+age+",то ему можно кататься на аттракционе без сопровождения взрослого");
            }
            age = age + 6;
        } while (age<18);
    }
    public static void task6() {
        System.out.println("Задача 6");
        int placeSeat =60;
        int placeTotal =102;
        int numberPassengers =41;
        do {
            if (numberPassengers < placeSeat) {
                System.out.println("В этом вагоне осталось " + (placeSeat-numberPassengers) + " сидячих мест");
            } else if (numberPassengers < placeTotal) {
                System.out.println("В этом вагоне осталоось " + (placeTotal-numberPassengers)  + " стоячих мест");
            } else {
                System.out.println("Извините, в этом вагоне нет свободных мест");
            }
            numberPassengers = numberPassengers + 30;
        } while (numberPassengers<=150);

    }
    public static void task7() {
        System.out.println("Задача 7");
        int one =15;
        int two =17;
        int three =11;
        if (one>two && one>three) {
            System.out.println("Максимальное число " + one);
        } else if (two>three) {
            System.out.println("Максимальное число " + two);
        } else {
            System.out.println("Максимальное число " + three);
        }
    }
}