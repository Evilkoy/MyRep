import java.util.HashMap;
import java.util.Scanner;

public class MenuChassis implements Menu {
    HashMap<String, Integer> totalChassis = new HashMap<>();

    @Override
    public HashMap<String, Integer> getTotal() {
        return totalChassis;
    }


    @Override
    public void choise() {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case (1):
                    totalChassis.put("Заміна сайлентблоків", 1000);
                    choise();
                    break;
                case (2):
                    totalChassis.put("Заміна гальмів", 2000);
                    choise();
                    break;
                case (3):
                    totalChassis.put("Заміна амортизаторів та пружин", 3000);
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
        System.out.println("1. Заміна сайлентблоків - 1000 грн");
        System.out.println("2. Заміна гальмів - 2000 грн");
        System.out.println("3. Заміна амортизаторів та пружин - 3000 грн");
        System.out.println("4. Вихід");
        choise();
    }
}
