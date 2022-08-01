import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MainMenu implements Menu {
    int sum = 0;
    static HashMap<String, Integer> totalMain = new HashMap<>();

    @Override
    public HashMap<String, Integer> getTotal() {
        return null;
    }

    @Override
    public void choise() {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case (1):
                    engine.text();
                    break;
                case (2):
                    chassis.text();
                    break;
                case (3):
                    body.text();
                    break;
                case (4):
                    info();
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void text() {
        System.out.println("1. ������");
        System.out.println("2. ������ �������");
        System.out.println("3. ������ �� ������");
        System.out.println("4. ϳ������");
        choise();
    }

    private void info() {
        totalMain.putAll(engine.getTotal());
        totalMain.putAll(chassis.getTotal());
        totalMain.putAll(body.getTotal());
        for (Map.Entry entry : totalMain.entrySet()) {
            System.out.println(entry);
        }
        for (float f : totalMain.values()) {
            sum += f;
        }
        System.out.println("���� �� ������ - " + sum + " ���");
        discount();
    }

    private void discount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ �������� ������ �� 25%? ����� �������: ���/ͳ");
        String answer = sc.nextLine();
        if (answer.equals("���")) {
            double discount = Math.round((Math.random() * 20) + 5);
            System.out.println("���� ������ - " + discount + "%");
            System.out.println("���� �� ������, ���������� ������ - " + (int) sum * (1 - (discount / 100))+" ���");
        }
        System.exit(0);
    }
}
