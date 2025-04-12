import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Задача №1
        System.out.println("\nЗадача №1");
        int age;
        System.out.print("Введите ваш возраст ");
        age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Тебе 18  или больше лет.");
        } else {
            System.out.println("Тебе меньше 18 лет.");
        }
        // Задача №2
        System.out.println("\nЗадача №2");
        int temperature;
        System.out.print("Введите температуру на улице ");
        temperature = scan.nextInt();
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице 5 градусов. Сам решай, нужна ли тебе шапка.");
        }
        // Задача №3
        System.out.println("\nЗадача №3");
        int speed;
        System.out.print("Введите скорость ");
        speed = scan.nextInt();
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф! ");
        }
        else
        {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно. ");
        }
        // Задача №4
        System.out.println("\nЗадача №4");
        if (age <= 6)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");

        }
        else if ( age <= 17)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");

        }
        else if (age <= 24)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        // Задача №5
        System.out.println("\nЗадача №5");
        int  childAge;
        childAge = scan.nextInt();
        if (childAge < 5)
        {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        else if (childAge < 14)
        {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else
        {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        // Задача №6
        System.out.println("\nЗадача №6");
        int wagonCapacity = 102, passengers;
        System.out.print("Введите количество пассажиров ");
        passengers = scan.nextInt();
        if (passengers < 60)
        {
            System.out.println("В вагоне есть сидячие места.");
        }
        else if (passengers < wagonCapacity)
        {
            System.out.println("В вагоне есть стоячие места.");
        }
        else
        {
            System.out.println("Вагон уже полностью забит.");

        }
        // Задача №7
        System.out.println("\nЗадача №7");
        int one, two, three;
        System.out.print("Введите первое число ");
        one = scan.nextInt();
        System.out.print("Введите второе число ");
        two = scan.nextInt();
        System.out.print("Введите третье число ");
        three = scan.nextInt();
        if (one > two && one > three)
        {
            System.out.println("Первое число большее.");
        }
        else if (two > one && two > three)
        {
            System.out.println("Второе число большее.");
        }
        else if (three > one && three > two)
        {
            System.out.println("Третье число большее.");
        }
        else
        {
            System.out.println("Нет большего числа.");
        }



    }
}