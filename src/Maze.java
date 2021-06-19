import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel {
    private Brick[] outBorders;
    private RowBorders rowBorders;
    private ColumnBorders columnBorders;

    public Maze(){ outBorders=new Brick[4];
    this.rowBorders=new RowBorders();
    setOutBorders();
    this.columnBorders=new ColumnBorders();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.printOutBorders(graphics);
        this.rowBorders.print(graphics);
        this.columnBorders.print(graphics);

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