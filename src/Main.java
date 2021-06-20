
import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

    new Main();



    }


    public Main () {
        frame();
        MazeScene mazeScene = new MazeScene();
        mazeScene.setBounds(0,0,Definitions.BOARD_WIDTH,Definitions.BOARD_HEIGHT);
        this.add(mazeScene);
        BeetleMovement beetleMovement = new BeetleMovement(mazeScene.getBeetle());
        if (mazeScene.collision(mazeScene.getBeetle(),mazeScene.getMaze())==false)
            this.addKeyListener(beetleMovement);
        else System.out.println("collision");
    }

    public void frame(){
        this.setVisible(true);
        this.setSize(Definitions.BOARD_WIDTH, Definitions.BOARD_HEIGHT);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }
}



