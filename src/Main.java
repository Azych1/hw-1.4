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

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        int age2 = 19;
        if (age>=18){
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }

        if (age2>=18){
            System.out.println("Если возраст человека равен "+age2+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age2+", то он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = -1;
        int temp2 = 15;
        if (temp>=5){
            System.out.println("На улице "+temp+" градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }

        if (temp2>=5){
            System.out.println("На улице "+temp2+" градусов, можно идти без шапки");
        } else {
            System.out.println("На улице "+temp2+" градусов, нужно надеть шапку");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 32;
        int speed2 = 72;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        if (speed2 >= 60) {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 0;
        if (age == 100) {
            System.out.println("Вы многожитель");
        }
        else        {
            age = 1;
        if (age<2&&age>0) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
            age = 5;
        }
        if (age>=2&&age<=6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
            age = 8;}
        if (age>7&&age<18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
            age = 23;}
        if (age>18&&age<24){
            System.out.println("Если возраст человека равен "+age+", то его место в университете");
            age = 25;}
        if (age>24&&age<60){
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
            age = 62;}
        if (age>60) {
            System.out.println("Если возраст человека равен "+age+", то он может отдохнуть");
            age = 0;
        }
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 4;
        int age2 = 6;
        int age3 = 15;

        if (age == 0) {
            System.out.println("Не может такого быть");
        }
        else if (age > 0) {


            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            }
            if (age2 >= 5 && age2 <= 14) {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе" +
                        " в сопровождении взрослого");
            }
            if (age3 > 14) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе" +
                        " без сопровождения взрослого");
            }
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seats = 60;
        int standPlaces = capacity - seats;
        int occupiedSeats = 20;
        int occupiedStandPlaces = 15;
        int freeSeats = 60 - occupiedSeats;
        int freeStandPlaces = standPlaces - occupiedStandPlaces;
        int freeAllPlaces = freeSeats + freeStandPlaces;

        if (freeAllPlaces>0){
            if (freeSeats>0&&freeStandPlaces>0){
                System.out.println("В вагоне для вас есть как сидячее так и стоячее место");
            } else if (freeSeats>0&&freeStandPlaces==0) {
                System.out.println("В вагоне для вас есть только сидячее место");
            } else if (freeSeats==0&&freeStandPlaces>0) {
                System.out.println("В вагоне для вас есть только стоячее место");
            }
        }
        else {
            System.out.println("Извините, все места заняты");
        }

    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one>two&&one>three){
            System.out.println(one+" - большее число");
        } else if (two>one&&two>three){
            System.out.println(two+" - большее число");
        }
        else{
            System.out.println(three+" - большее число");
        }
    }


}