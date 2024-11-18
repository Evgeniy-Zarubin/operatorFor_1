public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int temparature = 7;
        if (temparature < 5) {
            System.out.println("На улице " + temparature + " градусов, нужно надеть шапку");
        }
        if (temparature > 5) {
            System.out.println("На улице " + temparature + " градусов, можно идти без шапки");
        }

        //Задача 3
        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Задача 4
        int ageWork = 15;
        if (ageWork >= 2 && ageWork < 6) {
            System.out.println("Если возраст человека равен " + ageWork + ", то ему нужно ходить в детский сад");
        }
        if (ageWork >= 7 && ageWork < 17) {
            System.out.println("Если возраст человека равен " + ageWork + ", то ему нужно ходить в школу");
        }
        if (ageWork >= 18 && ageWork <= 24) {
            System.out.println("Если возраст человека равен " + ageWork + ", то его место в университете");
        }
        if (ageWork > 24) {
            System.out.println("Если возраст человека равен " + ageWork + ", то ему пора ходить на работу");
        }

        //Задача 5
        int ageCheck = 13;
        if (ageCheck < 5) {
            System.out.println("Если возраст ребёнка равен " + ageCheck + ", то ему нельзя кататься на аттракционе");
        }
        if (ageCheck > 5 && ageCheck < 14) {
            System.out.println("Если возраст ребёнка равен " + ageCheck + ", то ему можно кататься на аттракционе в сопровождении взрослого." +
                    "Если взрослого нет, то кататься нельзя");
        }
        if (ageCheck > 14) {
            System.out.println("Если возраст ребёнка равен " + ageCheck + ", то ему можно кататься без сопровождения");
        }

        //Задача 6
        int train = 102;
        int trainSit = 60;
        //int trainStand = train - trainSit;
        int placePeople = 99;

        if (placePeople < trainSit) {
            System.out.println("Если количество людей в поезде равно " + placePeople + ", то есть и сидячие и стоячие места");
        } else if (placePeople < train && placePeople >= trainSit) {
            System.out.println("Если количество людей в поезде равно " + placePeople + ", то есть только стоячие места");
        } else {
            System.out.println("Cорян, поезд полон");
        }

        int one = 5;
        int two = 100;
        int three = 16;

        if (one > two && one > three) {
            System.out.println ("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println ("Число " + two + " больше остальных");
        } else
        {
            System.out.println ("Число " + three + " больше остальных");
        }
    }
}