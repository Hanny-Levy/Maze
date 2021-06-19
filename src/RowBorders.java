import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyBoundsListener;

public class RowBorders extends JPanel {
    Brick[] row1;
    Brick[] row2;
    Brick[] row3;
    Brick[] row4;
    private int x;
    private int y;
    private int width;
    private int height;
    private int space;

    public RowBorders() {
        row1 = new Brick[Definitions.Row];
        row2 = new Brick[Definitions.Row];
        row3 = new Brick[Definitions.Row];
        row4 = new Brick[Definitions.Row];
        this.space=300;
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        this.printRow1(g);
        this.printRow2(g);
        this.printRow3(g);
        this.printRow4(g);
    }



    public void setRow1() {
        this.x=Definitions.MAZE_WIDTH_BORDERS;
        this.y=Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS;
        this.width=Definitions.MAZE_WIDTH_BORDERS/2;
        this.height=Definitions.MAZE_HEIGHT;
        this.row1[0]=new Brick(this.x,this.y,this.width,this.height);
        for (int i=1 ; i<this.row1.length;i++) {
        this.row1[i]=new Brick(this.x+this.space*i,this.y,this.width*i,this.height);
        }
    }

        public void printRow1(Graphics g){
        setRow1();
            for (int i=0 ; i<this.row1.length;i++)
                this.row1[i].print(g);
        }
        public void setRow2 () {
            this.setRow1();
            this.x=this.row1[0].getX();
            this.y=Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*2;
            this.width=this.row1[0].getWidth();
            this.height=this.getRow1()[0].getHeight();
            for (int i=0 ; i<this.row2.length;i++){
                this.row2[i]=new Brick(this.x+space*i,this.y,this.width*i,this.height);
            }
            this.row2[0].setWidth(this.space);
            this.row2[1].setX(this.row2[1].getX()+Definitions.MAZE_WIDTH_BORDERS/2);
            this.row2[2].setX(Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT);
            this.row2[2].setWidth(this.width);
        }
    public void printRow2(Graphics g){
        setRow2();
        for (int i=0 ; i<this.row2.length;i++)
            this.row2[i].print(g);
    }

        public void setRow3 () {
            this.x=Definitions.MAZE_WIDTH_BORDERS;
            this.y=Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*3;
            this.width=this.row1[0].getWidth();
            this.height=this.getRow1()[0].getHeight();
            for (int i=0 ; i<this.row3.length;i++){
                this.row3[i]=new Brick(i*this.x+space,this.y,this.width*i,this.height);
            }
            this.row3[0].setX(Definitions.MAZE_STARTING_X);
            this.row3[0].setWidth(this.width);
            this.row3[2].setWidth(this.row3[2].getWidth()+72);

    }
    public void printRow3(Graphics g){
        setRow3();
        for (int i=0 ; i<this.row3.length;i++)
            this.row3[i].print(g);
    }


       public void setRow4 () {
           this.x=Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT_BETWEEN_BORDERS;;
           this.y=Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*4-Definitions.BEETLE_HEIGHT/2;
           this.width=this.row1[0].getWidth()*2;
           this.height=this.getRow1()[0].getHeight();
           for (int i=0 ; i<this.row4.length;i++){
               this.row4[i]=new Brick(this.x,this.y,this.width,this.height);
           }
           this.row4[1].setX(Definitions.MAZE_WIDTH_BORDERS+this.space);
           this.row4[0].setX(Definitions.MAZE_STARTING_X+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS);


       }
    public void printRow4(Graphics g){
        setRow4();
        for (int i=0 ; i<this.row4.length;i++)
            this.row4[i].print(g);
    }

      public Brick[] getRow1 () {
            return row1;
        }

        public Brick[] getRow2 () {
            return row2;
        }

        public Brick[] getRow3 () {
            return row3;
        }

        public Brick[] getRow4 () {
            return row4;
        }
    }

