import javax.swing.*;
import java.awt.*;

public class MazeScene extends JPanel {
    private ImageIcon maze ;
    private int moves ;
    private Beetle beetle;
    private JLabel moveCounter;

    public MazeScene() {
    this.setDoubleBuffered(true);
    this.setLayout(null);
    this.setBackground(Color.WHITE);
    this.moveCounter = new JLabel("Moves: 0");
    this.moveCounter.setBounds(Definitions.BUTTON_WIDTH+30 , 0, Definitions.MOVES_COUNTER_LABEL_WIDTH, Definitions.MOVES_COUNTER_LABEL_HEIGHT );

        this.add(moveCounter);


    this.beetle=new Beetle(Definitions.BEETLE_STARTING_X,Definitions.BEETLE_STARTING_Y);
    this.maze=new ImageIcon("images/maze.png");
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
       // this.maze.paintIcon(this,graphics,0,0);
       // setMaze();
        beetle.paint(graphics,this);
        new Maze().paint(graphics);
    }

    public void setMaze() {
        Image image = maze.getImage() ;
        Image newImage = image.getScaledInstance(Definitions.BOARD_WIDTH,Definitions.BOARD_HEIGHT,java.awt.Image.SCALE_SMOOTH);
        this.maze=new ImageIcon(newImage);
    }

    public Beetle getBeetle() {
        return beetle;
    }

}
