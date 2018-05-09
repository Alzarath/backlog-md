import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Backlog {
  static String appName = "Backlog M.D.";
  public Backlog(String title) {
    super(title);

    // Menu initialization
    JMenuBar appMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    // Menu configuration
    fileMenu.setMnemonic(KeyEvent.VK_F);
    editMenu.setMnemonic(KeyEvent.VK_E);
    newItem.setMnemonic(KeyEvent.VK_N);
    openItem.setMnemonic(KeyEvent.VK_O);
    saveItem.setMnemonic(KeyEvent.VK_S);
    exitItem.setMnemonic(KeyEvent.VK_X);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) {
    Backlog window = new Backlog(String.format(" - %s", appName));
  }
}
