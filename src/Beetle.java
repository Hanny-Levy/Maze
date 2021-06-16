import javax.swing.*;
import java.awt.*;
public class Beetle  {
    private ImageIcon beetle;
    private int x ;
    private int y ;

    public Beetle(int x , int y) {
        this.beetle=new ImageIcon("images/beetle.jpg");
        this.x =x ;
        this.y=y;

    }

    public void paint(Graphics graphics,MazeScene mazeScene){
        this.beetle.paintIcon(mazeScene,graphics,x,y);

    }

    public void setBeetle(ImageIcon beetle) {
        this.beetle = beetle;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getBeetle() {
        return beetle;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void moveUp(){
        this.y-=2;
    }

    public void moveDown(){
    this.y+=2;
    }
    public void moveRight(){
    this.x+=2;
    }
    public void moveLeft(){
    this.x-=2;
    }


}
