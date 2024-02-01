public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int age = 19;

        if (age >= 18 ) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2;
        System.out.println("Задача 2");

        int temperature = 0;

        if (temperature < 5) {
            System.out.println("На улице " + temperature +  " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature +  " градусов, можно идти без шапки.");
        }

        // Задача 3;
        System.out.println("Задача 3");

        int speed = 60;

        if (speed > 60) {
            System.out.println("Если скорость " + speed +  ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed +  ", то можно ездить спокойно.");
        }

        // Задача 4;
        System.out.println("Задача 4");

        int age2 = 25;

        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");
        }

        // Задача 5;
        System.out.println("Задача 5");

        int ageOfChild = 15;

        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageOfChild > 5 && ageOfChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (ageOfChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6;
        System.out.println("Задача 6");

        int railwayСarriageCapacity = 102;

        if (railwayСarriageCapacity < 102) {
            System.out.println("В вагоне есть место.");
        }
        if (railwayСarriageCapacity < 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        // Задача 7;
        System.out.println("Задача 7");

        int one;
        int two;
        int three;
    }
}