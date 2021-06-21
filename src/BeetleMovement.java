import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BeetleMovement implements KeyListener {
    private Beetle beetle;



    public BeetleMovement(Beetle beetle) {
        this.beetle =beetle;

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == keyEvent.VK_RIGHT) {
            this.beetle.moveRight();
        }
        if (keyCode == keyEvent.VK_LEFT) {
            this.beetle.moveLeft();
        }
        if (keyCode == keyEvent.VK_DOWN) {
            this.beetle.moveDown();
        }
        if (keyCode == keyEvent.VK_UP) {
            this.beetle.moveUp();
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
