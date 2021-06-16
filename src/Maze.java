import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel {

    //private Wall[] walls;

    public Maze(){


    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        //ציור קווים עליונים של המבוך
        graphics.fillRect(Definitions.MAZE_STARTING_X,Definitions.MAZE_STARTING_Y,Definitions.MAZE_WIDTH,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_STARTING_X,Definitions.MAZE_ENDING_Y,Definitions.MAZE_WIDTH-Definitions.BEETLE_WIDTH,Definitions.MAZE_HEIGHT);
        //ציור קווים תחתונים של המבוך
        graphics.fillRect(Definitions.MAZE_STARTING_X,Definitions.MAZE_STARTING_Y,Definitions.MAZE_HEIGHT,Definitions.MAZE_ENDING_Y-Definitions.MAZE_STARTING_Y);
        graphics.fillRect(Definitions.MAZE_STARTING_X+Definitions.MAZE_WIDTH,Definitions.MAZE_STARTING_Y,Definitions.MAZE_HEIGHT,Definitions.MAZE_ENDING_Y-Definitions.MAZE_STARTING_Y);
        //ציור גבולות פנימיים לפי Y
        //שורה 1
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+300,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+600,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_HEIGHT);
        //שורה 2
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*2,Definitions.MAZE_WIDTH_BORDERS+100,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+450,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS *2,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS *2,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        //שורה 3
        graphics.fillRect(Definitions.MAZE_STARTING_X,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS *3,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+300,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS *3,Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+500,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*3,Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_HEIGHT);
        //שורה 4
        graphics.fillRect(Definitions.MAZE_STARTING_X+100,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*4-Definitions.BEETLE_HEIGHT/2,Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+300,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*4-Definitions.BEETLE_HEIGHT/2,Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_HEIGHT);
        graphics.fillRect(Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT-Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*4-Definitions.BEETLE_HEIGHT/2,Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_HEIGHT);
        //ציור העמודות
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2);



    }

   // public boolean collision (Beetle beetle) {

  //  }
}
