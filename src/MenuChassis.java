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
                    totalChassis.put("����� ������������", 1000);
                    choise();
                    break;
                case (2):
                    totalChassis.put("����� ������", 2000);
                    choise();
                    break;
                case (3):
                    totalChassis.put("����� ������������ �� ������", 3000);
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
        System.out.println("1. ����� ������������ - 1000 ���");
        System.out.println("2. ����� ������ - 2000 ���");
        System.out.println("3. ����� ������������ �� ������ - 3000 ���");
        System.out.println("4. �����");
        choise();
    }
}
