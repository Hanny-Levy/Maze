import javax.swing.*;
import java.awt.*;

public class MazeScene extends JPanel {
    private ImageIcon maze ;
    private JButton start;
    private JButton pause ;
    private int moves ;
    private Beetle beetle;

    public MazeScene() {
    this.setDoubleBuffered(true);
    this.setLayout(null);
    this.setBackground(Color.WHITE);
    this.start = new JButton("START");
   // this.pause = new JButton("PAUSE");
    this.start.setBounds(0,0,Definitions.BUTTON_WIDTH,Definitions.BUTTON_HEIGHT);
    //this.pause.setBounds(Definitions.BOARD_WIDTH-Definitions.BUTTON_WIDTH,0,Definitions.BUTTON_WIDTH,Definitions.BUTTON_HEIGHT);
    this.add(start);
   // start.addActionListener((e -> {
//
   //     start.setVisible(false);
//
   // }));
  //  this.add(pause);
  //      pause.addActionListener((e -> {
  ///          pause.setVisible(false);
//
  //      }));

    this.beetle=new Beetle(Definitions.BEETLE_STARTING_X,Definitions.BEETLE_STARTING_Y);
    this.maze=new ImageIcon("images/maze.png");
    this.mainGameLoop();
    }

    public void mainGameLoop(){
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
