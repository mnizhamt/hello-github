import javax.swing.*;

public class Main extends JPanel{

  public void Main() {
    super("HW App");
    setSize(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true)
  }
  
  public static void main(String[] args) {
    new Main();
  }

}
