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
        System.out.println("1. Двигун");
        System.out.println("2. Ходова частина");
        System.out.println("3. Роботи по кузову");
        System.out.println("4. Підсумок");
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
        System.out.println("Сума до сплати - " + sum + " грн");
        discount();
    }

    private void discount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Бажаєте отримати знижку до 25%? Дайте відповідь: Так/Ні");
        String answer = sc.nextLine();
        if (answer.equals("Так")) {
            double discount = Math.round((Math.random() * 20) + 5);
            System.out.println("Ваша знижка - " + discount + "%");
            System.out.println("Сума до сплати, враховуючи знижку - " + (int) sum * (1 - (discount / 100))+" грн");
        }
        System.exit(0);
    }
}
