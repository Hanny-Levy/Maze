import javax.swing.*;
import java.awt.*;

public class ColumnBorders extends JPanel {
    Brick [] column1;
    Brick [] column2;
    Brick [] column3;
    Brick [] column4;
    Brick [] column5;
    private int x;
    private int y;
    private int width;
    private int height;
    private int space;

    public ColumnBorders(){
        this.column1=new Brick[2];
        this.column2=new Brick[4];
        this.column3=new Brick[4];
        this.column4=new Brick[3];
        this.column5=new Brick[1];
        setColumn1();
        setColumn2();
        setColumn3();
        setColumn4();
        setColumn5();

    }


    @Override
    public void print(Graphics g) {
        super.print(g);
        this.printColumn1(g);
        this.printColumn2(g);
        this.printColumn3(g);
        this.printColumn4(g);
        this.printColumn5(g);

    }

    public void setColumn1() {
        this.x=Definitions.MAZE_WIDTH_BORDERS;
        this.y=Definitions.MAZE_STARTING_Y;
        this.width=Definitions.MAZE_HEIGHT;
        this.height=Definitions.MAZE_WIDTH_BORDERS;
        for (int i=0; i<this.column1.length;i++)
            this.column1[i]=new Brick(this.x,this.y,this.width,this.height);

        this.column1[0].setX(this.x*2+40);this.column1[0].setHeight(this.height+35);
        this.column1[1].setX(this.x+480);this.column1[1].setHeight(this.height/2);
    }

    public void printColumn1(Graphics g){
        this.setColumn1();
        for (int i=0 ; i<this.column1.length;i++)
            this.column1[i].print(g);
    }

    public void setColumn2() {
    this.setColumn1();
        this.x=Definitions.MAZE_WIDTH_BORDERS;
        this.y=this.column1[0].getY()+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS;
        this.width=Definitions.MAZE_HEIGHT;
        this.height=this.column1[1].getHeight()+20;
        for (int i=0; i<this.column2.length;i++)
            this.column2[i]=new Brick(this.x+Definitions.space*i,this.y,this.width,this.height);
        this.column2[3].setX(this.x/2+this.x+Definitions.space*2+1);
        this.column2[3].setHeight(Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*2);
        this.column2[1].setX(this.column2[1].getX()+this.x/2);

    }
    public void printColumn2(Graphics g){
        this.setColumn2();
        for (int i=0; i<this.column2.length;i++)
            this.column2[i].print(g);
    }

    public void setColumn3() {
        this.setColumn2();
        this.x=Definitions.MAZE_WIDTH-Definitions.MAZE_HEIGHT;
        this.y=this.column1[0].getY()+this.column2[3].getHeight();
        this.width=Definitions.MAZE_HEIGHT;
        this.height=this.column2[1].getHeight();
        for (int i=0; i<this.column3.length;i++)
                  this.column3[i]=new Brick(this.x+Definitions.space*i,this.y,this.width,this.height);
        this.column3[1].setX(Definitions.MAZE_WIDTH_BORDERS+Definitions.space);
        this.column3[2].setX(Definitions.MAZE_WIDTH_BORDERS*2+Definitions.space);
        this.column3[3].setX((this.column3[2].getX()-Definitions.MAZE_STARTING_X)/3+Definitions.BEETLE_WIDTH);

    }
    public void printColumn3(Graphics g){
        setColumn3();
        for (int i=0; i<this.column3.length;i++)
            this.column3[i].print(g);
    }

    public void setColumn4() {
    this.setColumn3();
    this.y=Definitions.MAZE_STARTING_Y+Definitions.MAZE_HEIGHT_BETWEEN_BORDERS*3;
    this.x=this.column1[0].getX();
    this.width=Definitions.MAZE_HEIGHT;
    this.height=this.column1[1].getHeight();
        for (int i=0; i<this.column4.length;i++)
            this.column4[i]=new Brick(this.x,this.y,this.width,this.height);
        this.column4[1].setX(Definitions.MAZE_WIDTH_BORDERS+Definitions.space+Definitions.MAZE_WIDTH_BORDERS/2);
        this.column4[2].setX(this.column4[1].getX()+Definitions.MAZE_WIDTH_BORDERS);
        this.column4[2].setHeight(this.column1[1].getHeight()+12);

    }

    public void printColumn4(Graphics g) {
        this.setColumn4();
        for (int i=0; i<this.column4.length;i++)
            this.column4[i].print(g);
    }

    public void setColumn5(){
        this.setColumn4();
        this.width=Definitions.MAZE_HEIGHT;
        this.y=Definitions.MAZE_ENDING_Y-Definitions.MAZE_STARTING_Y+8;
        this.x=this.column1[0].getX()+Definitions.space/4+15;
        this.height=this.column1[1].getHeight();
            this.column5[0]=new Brick(this.x,this.y,this.width,this.height);
    }

    public void printColumn5(Graphics g) {
        this.setColumn5();
        for (int i=0; i<this.column5.length;i++)
            this.column5[i].print(g);
    }

    public Brick[] getColumn1() {
        return column1;
    }

    public Brick[] getColumn2() {
        return column2;
    }

    public Brick[] getColumn3() {
        return column3;
    }

    public Brick[] getColumn4() {
        return column4;
    }

    public Brick[] getColumn5() {
        return column5;
    }
}
