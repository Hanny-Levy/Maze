import javax.swing.*;
import java.awt.*;

public class MazeScene extends JPanel {
    private Maze maze ;
    private Beetle beetle;
    private JLabel moveCounter;

    public MazeScene() {
    this.setDoubleBuffered(true);
    this.setLayout(null);
    this.setBackground(Color.WHITE);
    this.moveCounter = new JLabel("Moves: 0");
    this.moveCounter.setBounds(Definitions.BUTTON_WIDTH+30 , 0, Definitions.MOVES_COUNTER_LABEL_WIDTH, Definitions.MOVES_COUNTER_LABEL_HEIGHT );
    this.add(moveCounter);
    this.maze=new Maze();

    this.beetle=new Beetle(Definitions.BEETLE_STARTING_X,Definitions.BEETLE_STARTING_Y);
    this.mainGameLoop();
    }

    public void mainGameLoop(){
        new Thread(() -> {
            while (true){

                repaint();
                try {
                    this.moveCounter.setText("Moves: " + this.beetle.getMoves() );
                    Thread.sleep(25);
                }
                catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        }) .start();
    }


    public void paint(Graphics graphics) {
        super.paint(graphics);
        beetle.paint(graphics,this);
        maze.paint(graphics);
    }

    public Maze getMaze() {
        return maze;
    }

    public JLabel getMoveCounter() {
        return moveCounter;
    }

    public Beetle getBeetle() {
        return beetle;
    }

}
