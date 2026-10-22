import javax.swing.*;
import java.awt.*;

public class BaseWindow {

    protected JFrame frame;

    // Constructor
    public BaseWindow() {

        // Create JFrame
        frame = new JFrame();

        // Required assignment title
        frame.setTitle("Java Swing Assignment");

        // Required assignment size
        frame.setSize(800, 800);

        // Close application when X is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Open window in center of screen
        frame.setLocationRelativeTo(null);

        // Prevent resizing so design stays consistent
        frame.setResizable(false);

        // Application icon using ImageIcon
        ImageIcon icon = new ImageIcon(
                BaseWindow.class.getResource("/logo.png")
        );

        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            frame.setIconImage(icon.getImage());
        }
    }
}