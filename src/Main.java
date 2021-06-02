import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

    }










    private void mainGameLoop(){
     new Thread(() -> {
         while (true){
             repaint();
             try {
                 Thread.sleep(25);
             }
             catch (InterruptedException exception){
                 exception.printStackTrace();
             }
         }
     }) .start();
    }
}
