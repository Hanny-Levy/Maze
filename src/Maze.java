import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel {
    private Brick[] outBorders;
    private RowBorders rowBorders;
    private Brick defaultBrick;

    public Maze(){ outBorders=new Brick[4];
    this.rowBorders=new RowBorders();
    setOutBorders();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        printOutBorders(graphics);
        rowBorders.print(graphics);


        //ציור עמודות שורה 1
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_STARTING_Y,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS+35);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+480,Definitions.MAZE_STARTING_Y,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2);

        //ציור עמודות שורה 2
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2+20);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+300+Definitions.MAZE_WIDTH_BORDERS/2,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2+20);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS+600,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2+20);
        graphics.fillRect(Definitions.MAZE_WIDTH_BORDERS/2+Definitions.MAZE_WIDTH_BORDERS+601,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS,Definitions.MAZE_HEIGHT,(Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*3)-(Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS));
        graphics.fillRect(Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT,Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS *2,Definitions.MAZE_HEIGHT,Definitions.MAZE_WIDTH_BORDERS/2+20);



    }






    public void setOutBorders() {
        for (int i = 0; i < 4; i++) {
            Brick brick = new Brick(Definitions.MAZE_STARTING_X, Definitions.MAZE_STARTING_Y, Definitions.MAZE_WIDTH, Definitions.MAZE_HEIGHT);
            outBorders[i]=brick;
        }
        outBorders[1].setWidth(outBorders[1].getHeight());
        outBorders[1].setHeight(Definitions.MAZE_ENDING_Y-Definitions.MAZE_STARTING_Y);
        outBorders[2].setY(Definitions.MAZE_ENDING_Y);outBorders[2].setWidth(Definitions.MAZE_WIDTH-Definitions.BEETLE_WIDTH);
        outBorders[3].setX(outBorders[3].getX()+outBorders[3].getWidth());outBorders[3].setWidth(outBorders[3].getHeight());outBorders[3].setHeight(Definitions.MAZE_ENDING_Y-Definitions.MAZE_STARTING_Y);

    }
    public void printOutBorders(Graphics graphics){
        for (int i=0 ; i<this.outBorders.length;i++)
        outBorders[i].print(graphics);
    }

        }