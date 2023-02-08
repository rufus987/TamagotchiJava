import java.util.Scanner;

public class Main {
    private static int countMenu = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру Тамагочи!");
        System.out.println("Тамагочи - кот, которого необходимо кормить и играть");

        System.out.println("Давайте создадим нашего кота");
        Cat.name();
        System.out.println("Начать игру? (Нажмите Y для продолжения, другую клавишу для выхода)");
        char control = scanner.next().charAt(0);
        if (control == 'Y') {
            System.out.println();
        } else {
            System.out.println("ВЫХОД");
            System.exit(0);
        }
        Cat.catCondition();
        menu();
    }

    public static void menu() {
        Cat.catDied();
        Main.countMenu += 1;
        if (Main.countMenu == 20){
            Cat.catsAge+=1;
            Main.countMenu = 0;
        }
        Cat.hungry -= 5;
        Cat.catsWeight -= 0.1;
        Cat.desireOfGame += 10;
        boolean isGame = true;
        while (isGame) {
            System.out.println("МЕНЮ КОТА");
            System.out.println("\t1. Состояние кота.\n\t2. Кормление кота.\n\t3. Игра с котом \n\t4. ВЫХОД");
            char choice = Cat.scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    Cat.catCondition();
                    break;
                case '2':
                    Cat.catFeeding();
                    break;
                case '3': Cat.catGame();
                case '4':
                    isGame = false;
                    break;
                default:
                    System.out.println("Некорректная команда!");
                    menu();
            }
        }
    }
}