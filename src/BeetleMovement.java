import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BeetleMovement implements KeyListener {
    private Beetle beetle;
    private MazeScene mazeScene;


    public BeetleMovement(Beetle beetle,MazeScene mazeScene) {
        this.beetle =beetle;
        this.mazeScene=mazeScene;

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();

        if (keyCode==keyEvent.VK_RIGHT&&mazeScene.collision(this.beetle, mazeScene.getMaze())==false)
            this.beetle.moveRight();

        else  this.beetle.moveLeft();
        if (keyCode == keyEvent.VK_LEFT&&mazeScene.collision(this.beetle, mazeScene.getMaze())==false)
            this.beetle.moveLeft();

        else this.beetle.moveRight();
        if (keyCode == keyEvent.VK_DOWN&&mazeScene.collision(this.beetle, mazeScene.getMaze())==false)
            this.beetle.moveDown();
            else this.beetle.moveUp();

        if (keyCode == keyEvent.VK_UP&&mazeScene.collision(this.beetle, mazeScene.getMaze())==false)
            this.beetle.moveUp();
        else this.beetle.moveDown();
    }

    public void keyReleased(KeyEvent e) {

    }

    public Beetle getBeetle() {
        return beetle;
    }
}
