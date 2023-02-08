import java.util.Scanner;

public class Cat {
    static Scanner scanner = new Scanner(System.in);
    public static void name(){
        System.out.println("Кота будут звать: ");
        String catsName = scanner.nextLine();
        System.out.println("Итак");
        System.out.println("Нашего кота зовут " + catsName);
    }
    static float catsWeight = 3;
    static int catsAge = 0;
    static int hungry = 100;
    static int desireOfGame = 50;
    public static void catCondition() {
        System.out.println("Кота зовут %s\n");
        System.out.printf("Возраст кота %s лет\n", Cat.catsAge);
        System.out.printf("Вес кота %s кг\n", Cat.catsWeight);
        System.out.println("Голод " + hungry + "\n");
        System.out.println("Желание играть " + desireOfGame + "\n");
        System.out.println("Нажмите любую клавишу...");
        char f = scanner.next().charAt(0);
        Main.menu();
    }

    public static void catFeeding() {
        if (hungry >= 50){
            System.out.println("Кот не голоден");
            return;
        }
        System.out.println("Чем покормим кота?");
        System.out.println("\t1. Рыбка\n\t2. Китикет\n\t3. В холодильнике пусто");
        char choice = scanner.next().charAt(0);
        switch (choice) {
            case '1' -> {
                hungry += 10;
                catsWeight += 0.1;
            }
            case '2' -> {
                hungry += 20;
                catsWeight += 0.3;
            }
            case '3' -> {
                hungry -= 5;
                catsWeight -= 0.1;
                desireOfGame -= 10;
            }
        }
        Main.menu();
    }

    public static void catGame() {
        if (0 <= hungry && hungry <= 20){
            System.out.println("Кот голоден, он не хочет играть");
        } else if(90 <= hungry && hungry <= 100){
            System.out.println("Кот поел, он не хочет играть");
        } else if (desireOfGame >= 100) {
            System.out.println("Кот наигрался, он не хочет играть");
        }
        Main.menu();
    }
    public static void catDied(){
        if (hungry <= 0 || catsWeight <= 0.4 || catsAge >= 18){
            System.out.println("Кот умер. Вы были плохим хозяином");
            System.exit(0);
        }
    }
}