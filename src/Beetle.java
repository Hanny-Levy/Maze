import javax.swing.*;
import java.awt.*;
    public class Beetle  {
    private ImageIcon beetle;
    private int x ;
    private int y ;
    private int moves;

    public Beetle(int x , int y) {
        this.beetle=new ImageIcon("images/beetle.jpg");
        this.x =x ;
        this.y=y;
        this.setMoves();

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
        this.y -= this.getHeight()/4;
        moves++;
    }

    public void moveDown(){
        this.y += this.getHeight()/4;
        moves++;
    }
    public void moveRight(){
        this.x += this.getHeight()/4;
        moves++;
    }
    public void moveLeft(){
        this.x -= this.getHeight()/4;
        moves++;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves() {
        this.moves = 0;
    }
    public int getWidth(){
        return this.beetle.getIconWidth();
    }
    public int getHeight(){
        return this.beetle.getIconHeight();
    }

    public boolean finishGame(){
        if(this.getY()>=528&& this.getX()>=913)
            return true;
        else return false;
    }



}
