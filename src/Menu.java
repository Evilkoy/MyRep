import java.util.HashMap;

public interface Menu {
    Menu engine = new MenuEngine();
    Menu chassis = new MenuChassis();
    Menu body = new MenuBody();
    Menu main = new MainMenu();
    public HashMap<String, Integer> getTotal();
    public void choise();
    public void text();
}
