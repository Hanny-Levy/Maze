import javax.swing.*;
import java.awt.*;

public class MazeScene extends JPanel {
    private Maze maze ;
    private Beetle beetle;
    private JLabel moveCounter;

    public MazeScene() {
    this.setDoubleBuffered(true);
    this.setLayout(null);
    this.setBackground(Color.GRAY);
    this.moveCounter = new JLabel("Moves: 0");
    this.moveCounter.setBounds(Definitions.BUTTON_WIDTH+30 , 0, Definitions.MOVES_COUNTER_LABEL_WIDTH, Definitions.MOVES_COUNTER_LABEL_HEIGHT );
    this.add(moveCounter);
    this.maze=new Maze();
    this.beetle=new Beetle(Definitions.BEETLE_STARTING_X+40,Definitions.BEETLE_STARTING_Y);

    this.mainGameLoop();
    }

    public boolean collision(Beetle beetle , Maze maze){
       boolean collision;
       Rectangle beetleRec= new Rectangle(beetle.getX(),beetle.getY(),Definitions.BEETLE_WIDTH,Definitions.BEETLE_HEIGHT);

           for (int i = 0; i < maze.getOutBorders().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getOutBorders()[i].getX(), maze.getOutBorders()[i].getY(), maze.getOutBorders()[i].getWidth(), maze.getOutBorders()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getRowBorders().getRow1().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getRowBorders().getRow1()[i].getX(), maze.getRowBorders().getRow1()[i].getY(), maze.getRowBorders().getRow1()[i].getWidth(), maze.getRowBorders().getRow1()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getRowBorders().getRow2().length; i++) {
              Rectangle  mazeBrickRec = new Rectangle(maze.getRowBorders().getRow2()[i].getX(), maze.getRowBorders().getRow2()[i].getY(), maze.getRowBorders().getRow2()[i].getWidth(), maze.getRowBorders().getRow2()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getRowBorders().getRow3().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getRowBorders().getRow3()[i].getX(), maze.getRowBorders().getRow3()[i].getY(), maze.getRowBorders().getRow3()[i].getWidth(), maze.getRowBorders().getRow3()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getRowBorders().getRow4().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getRowBorders().getRow4()[i].getX(), maze.getRowBorders().getRow4()[i].getY(), maze.getRowBorders().getRow4()[i].getWidth(),maze.getRowBorders().getRow4()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getColumnBorders().getColumn1().length; i++) {
             Rectangle mazeBrickRec = new Rectangle(maze.getColumnBorders().getColumn1()[i].getX(), maze.getColumnBorders().getColumn1()[i].getY(), maze.getColumnBorders().getColumn1()[i].getWidth(), maze.getColumnBorders().getColumn1()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getColumnBorders().getColumn2().length; i++) {
              Rectangle  mazeBrickRec = new Rectangle(maze.getColumnBorders().getColumn2()[i].getX(), maze.getColumnBorders().getColumn2()[i].getY(), maze.getColumnBorders().getColumn2()[i].getWidth(), maze.getColumnBorders().getColumn2()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getColumnBorders().getColumn3().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getColumnBorders().getColumn3()[i].getX(), maze.getColumnBorders().getColumn3()[i].getY(), maze.getColumnBorders().getColumn3()[i].getWidth(), maze.getColumnBorders().getColumn3()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getColumnBorders().getColumn4().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getColumnBorders().getColumn4()[i].getX(), maze.getColumnBorders().getColumn4()[i].getY(), maze.getColumnBorders().getColumn4()[i].getWidth(), maze.getColumnBorders().getColumn4()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
           for (int i = 0; i < maze.getColumnBorders().getColumn5().length; i++) {
              Rectangle mazeBrickRec = new Rectangle(maze.getColumnBorders().getColumn5()[i].getX(), maze.getColumnBorders().getColumn5()[i].getY(), maze.getColumnBorders().getColumn5()[i].getWidth(), maze.getColumnBorders().getColumn5()[i].getHeight());
               if (beetleRec.intersects(mazeBrickRec)){
                   return collision=true;
               }
           }
        return collision=false;
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
