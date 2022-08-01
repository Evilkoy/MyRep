import java.util.HashMap;
import java.util.Scanner;

public class MenuEngine implements Menu {
    HashMap<String, Integer> totalEngine = new HashMap<>();

    @Override
    public HashMap<String, Integer> getTotal() {
        return totalEngine;
    }


    @Override
    public void choise() {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case (1):
                    totalEngine.put("Заміна мастила", 1000);
                    choise();
                    break;
                case (2):
                    totalEngine.put("Перевірка форсунок та свічок", 2000);
                    choise();
                    break;
                case (3):
                    totalEngine.put("Робота з проводкою", 3000);
                    choise();
                    break;
                default:
                    main.text();
                    break;
            }
        }
    }

    @Override
    public void text() {
        System.out.println("1. Заміна мастила - 1000 грн");
        System.out.println("2. Перевірка форсунок та свічок - 2000 грн");
        System.out.println("3. Робота з проводкою - 3000 грн");
        System.out.println("4. Вихід");
        choise();
    }
}
