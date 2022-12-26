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
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
    public static void task6() {
        System.out.println("Задача 6");
    }
    public static void task7() {
        System.out.println("Задача 7");
    }
}