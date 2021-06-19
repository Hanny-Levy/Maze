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

    private boolean canMove(Maze maze){
       for (int i = 0 ; i<maze.getOutBorders().length;i++){
                
                return false;
            }
       return true;
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
        this.y -= Definitions.BEETLE_HEIGHT/4;
        moves++;
    }

    public void moveDown(){
        this.y += Definitions.BEETLE_HEIGHT/4;
        moves++;
    }
    public void moveRight(){
        this.x += Definitions.BEETLE_WIDTH/4;
        moves++;
    }
    public void moveLeft(){
        this.x -= Definitions.BEETLE_WIDTH/4;
        moves++;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves() {
        this.moves = 0;
    }
}
