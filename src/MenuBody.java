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
                    totalBody.put("����������", 1000);
                    choise();
                    break;
                case (2):
                    totalBody.put("����������� ��'����", 2000);
                    choise();
                    break;
                case (3):
                    totalBody.put("�������� ���� ������", 3000);
                    choise();
                    break;
                case (4):
                    totalBody.put("����� ��������", 4000);
                    choise();
                default:
                    main.text();
                    break;
            }
        }
    }

    @Override
    public void text() {
        System.out.println("1. ���������� - 1000 ���");
        System.out.println("2. ����������� ��'���� - 2000 ���");
        System.out.println("3. �������� ���� ������ - 3000 ���");
        System.out.println("4. ����� �������� - 4000 ���");
        System.out.println("5. �����");
        choise();
    }
}
