import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAssignment extends BaseWindow {

    // Required assignment variables
    JPanel panel;
    JLabel label;

    // Buttons
    JButton changeTextButton;
    JButton changeBackgroundButton;
    JButton resetButton;

    // Original background colour
    Color originalBackground = Color.WHITE;

    // Constructor
    public SwingAssignment() {

        // Call parent constructor
        super();

        /*
         * MAIN BACKGROUND
         */
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setLayout(null);
        backgroundPanel.setBackground(new Color(244, 247, 251));

        frame.setContentPane(backgroundPanel);

        /*
         * =========================
         * HEADER
         * =========================
         */

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setBounds(0, 0, 800, 120);
        headerPanel.setBackground(new Color(23, 59, 102));

        /*
         * JS ICON BOX
         */
        // Load logo image
        ImageIcon logo = new ImageIcon(
                SwingAssignment.class.getResource("/logo.png")

        );
        System.out.println("Logo loaded: " + (logo.getIconWidth() > 0));
// Resize logo
        Image logoImage = logo.getImage().getScaledInstance(
                60, 60, Image.SCALE_SMOOTH
        );

// Display logo
        JLabel iconLabel = new JLabel(new ImageIcon(logoImage));

        iconLabel.setBounds(50, 30, 60, 60);

        /*
         * HEADER TITLE
         */
        JLabel titleLabel = new JLabel("Java Swing Assignment");
        titleLabel.setBounds(135, 23, 500, 40);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 28)
        );

        /*
         * HEADER SUBTITLE
         */
        JLabel subtitleLabel =
                new JLabel("PROG209  •  Basic Interactive GUI");

        subtitleLabel.setBounds(136, 65, 400, 30);
        subtitleLabel.setForeground(
                new Color(220, 232, 245)
        );

        subtitleLabel.setFont(
                new Font("Arial", Font.PLAIN, 14)
        );

        headerPanel.add(iconLabel);
        headerPanel.add(titleLabel);
        headerPanel.add(subtitleLabel);

        /*
         * =========================
         * REQUIRED JPANEL
         * =========================
         */

        panel = new JPanel();

        panel.setLayout(null);

        /*
         * Figma position and size
         */
        panel.setBounds(
                60,
                165,
                680,
                540
        );

        panel.setBackground(originalBackground);

        panel.setBorder(
                new LineBorder(
                        new Color(220, 228, 238),
                        1,
                        true
                )
        );

        /*
         * =========================
         * SECTION TITLE
         * =========================
         */

        JLabel sectionLabel =
                new JLabel("EVENT DRIVEN PROGRAMMING");

        sectionLabel.setBounds(
                48,
                35,
                300,
                25
        );

        sectionLabel.setForeground(
                new Color(71, 112, 159)
        );

        sectionLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                )
        );

        /*
         * =========================
         * REQUIRED JLABEL
         * =========================
         */

        label = new JLabel(
                "<html>" +
                        "Welcome to Java Swing First<br>" +
                        "Individual Assignment by Councillor" +
                        "</html>"
        );

        label.setBounds(
                48,
                72,
                585,
                90
        );

        label.setForeground(
                new Color(23, 43, 77)
        );

        label.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        /*
         * =========================
         * DIVIDER
         * =========================
         */

        JSeparator separator = new JSeparator();

        separator.setBounds(
                48,
                190,
                584,
                2
        );

        separator.setForeground(
                new Color(228, 234, 241)
        );

        /*
         * =========================
         * INSTRUCTION
         * =========================
         */

        JLabel instructionLabel =
                new JLabel(
                        "Use the controls below to demonstrate event handling."
                );

        instructionLabel.setBounds(
                48,
                215,
                500,
                30
        );

        instructionLabel.setForeground(
                new Color(95, 111, 130)
        );

        instructionLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        15
                )
        );

        /*
         * =========================
         * CHANGE TEXT BUTTON
         * =========================
         */

        changeTextButton =
                new JButton("Change Text");

        changeTextButton.setBounds(
                48,
                270,
                180,
                54
        );

        changeTextButton.setBackground(
                new Color(23, 105, 170)
        );

        changeTextButton.setForeground(Color.WHITE);

        changeTextButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        changeTextButton.setFocusPainted(false);
        changeTextButton.setBorderPainted(false);
        changeTextButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR)
        );

        /*
         * =========================
         * CHANGE BACKGROUND BUTTON
         * =========================
         */

        changeBackgroundButton =
                new JButton("Change Background");

        changeBackgroundButton.setBounds(
                244,
                270,
                230,
                54
        );

        changeBackgroundButton.setBackground(
                new Color(46, 139, 87)
        );

        changeBackgroundButton.setForeground(
                Color.WHITE
        );

        changeBackgroundButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        changeBackgroundButton.setFocusPainted(false);
        changeBackgroundButton.setBorderPainted(false);
        changeBackgroundButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR)
        );

        /*
         * =========================
         * RESET BUTTON
         * =========================
         */

        resetButton =
                new JButton("Reset");

        resetButton.setBounds(
                490,
                270,
                142,
                54
        );

        resetButton.setBackground(
                new Color(100, 116, 139)
        );

        resetButton.setForeground(Color.WHITE);

        resetButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        resetButton.setFocusPainted(false);
        resetButton.setBorderPainted(false);
        resetButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR)
        );

        /*
         * =========================
         * STATUS BOX
         * =========================
         */

        JPanel statusPanel = new JPanel();

        statusPanel.setLayout(null);

        statusPanel.setBounds(
                48,
                365,
                584,
                92
        );

        statusPanel.setBackground(
                new Color(244, 247, 251)
        );

        statusPanel.setBorder(
                new LineBorder(
                        new Color(230, 235, 241),
                        1,
                        true
                )
        );

        /*
         * STATUS TITLE
         */

        JLabel statusTitle =
                new JLabel("Interactive Swing GUI");

        statusTitle.setBounds(
                20,
                12,
                300,
                30
        );

        statusTitle.setForeground(
                new Color(23, 43, 77)
        );

        statusTitle.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        /*
         * STATUS DESCRIPTION
         */

        JLabel statusDescription =
                new JLabel(
                        "JFrame • JPanel • JLabel • ImageIcon • ActionListener"
                );

        statusDescription.setBounds(
                20,
                45,
                500,
                25
        );

        statusDescription.setForeground(
                new Color(100, 116, 139)
        );

        statusDescription.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        statusPanel.add(statusTitle);
        statusPanel.add(statusDescription);

        /*
         * =========================
         * ADD COMPONENTS TO PANEL
         * =========================
         */

        panel.add(sectionLabel);
        panel.add(label);
        panel.add(separator);
        panel.add(instructionLabel);

        panel.add(changeTextButton);
        panel.add(changeBackgroundButton);
        panel.add(resetButton);

        panel.add(statusPanel);

        /*
         * =========================
         * EVENT HANDLING
         * =========================
         */

        /*
         * CHANGE LABEL TEXT
         */
        changeTextButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        label.setText(
                                "<html>" +
                                        "Text Changed Successfully!<br>" +
                                        "Welcome, Councillor." +
                                        "</html>"
                        );
                    }
                }
        );

        /*
         * CHANGE JPANEL BACKGROUND
         */
        changeBackgroundButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panel.setBackground(
                                new Color(
                                        219,
                                        234,
                                        254
                                )
                        );
                    }
                }
        );

        /*
         * RESET EVERYTHING
         */
        resetButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        label.setText(
                                "<html>" +
                                        "Welcome to Java Swing First<br>" +
                                        "Individual Assignment by Councillor" +
                                        "</html>"
                        );

                        panel.setBackground(
                                originalBackground
                        );
                    }
                }
        );

        /*
         * =========================
         * FOOTER
         * =========================
         */

        JLabel footer =
                new JLabel(
                        "Designed for Java Swing  •  800 × 800 px"
                );

        footer.setBounds(
                60,
                715,
                500,
                30
        );

        footer.setForeground(
                new Color(113, 128, 150)
        );

        footer.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                )
        );

        /*
         * =========================
         * ADD EVERYTHING TO FRAME
         * =========================
         */

        backgroundPanel.add(headerPanel);
        backgroundPanel.add(panel);
        backgroundPanel.add(footer);

        /*
         * Refresh components
         */
        backgroundPanel.revalidate();
        backgroundPanel.repaint();

        /*
         * Display application
         */
        frame.setVisible(true);
    }

    /*
     * =========================
     * MAIN METHOD
     * =========================
     */

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {

                    @Override
                    public void run() {

                        new SwingAssignment();
                    }
                }
        );
    }
}