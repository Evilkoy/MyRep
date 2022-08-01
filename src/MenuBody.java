import java.util.HashMap;
import java.util.Scanner;

public class MenuBody implements Menu {
    HashMap<String, Integer> totalBody = new HashMap<>();

    @Override
    public HashMap<String, Integer> getTotal() {
        return totalBody;
    }

    @Override
    public void choise() {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case (1):
                    totalBody.put("Полірування", 1000);
                    choise();
                    break;
                case (2):
                    totalBody.put("Вирівнювання вм'ятин", 2000);
                    choise();
                    break;
                case (3):
                    totalBody.put("Покриття авто плівкою", 3000);
                    choise();
                    break;
                case (4):
                    totalBody.put("Повна покраска", 4000);
                    choise();
                default:
                    main.text();
                    break;
            }
        }
    }

    @Override
    public void text() {
        System.out.println("1. Полірування - 1000 грн");
        System.out.println("2. Вирівнювання вм'ятин - 2000 грн");
        System.out.println("3. Покриття авто плівкою - 3000 грн");
        System.out.println("4. Повна покраска - 4000 грн");
        System.out.println("5. Вихід");
        choise();
    }
}
