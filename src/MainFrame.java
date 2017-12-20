import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private final PaintPanel _paintPanel;

    public MainFrame() {
        setLayout(new BorderLayout());

        _paintPanel = new PaintPanel();
        _paintPanel.setPreferredSize(new Dimension(400, 400));
        add(_paintPanel, BorderLayout.CENTER);

        //shapes/sizes

        JButton smallButton = new JButton("Small");
        smallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalSize(5);
            }
        });

        JButton medButton = new JButton("Medium");
        medButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalSize(10);
            }
        });

        JButton largeButton = new JButton("Large");
        largeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalSize(15);
            }
        });

        JButton clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.eraseAll();

            }
        });

        JPanel sizeButtonPanel = new JPanel(new GridLayout(4,1));
        sizeButtonPanel.add(smallButton);
        sizeButtonPanel.add(medButton);
        sizeButtonPanel.add(largeButton);
        sizeButtonPanel.add(clear);

        //colors
        JButton blackColorButton = new JButton("Black");
        blackColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalColor(Color.BLACK);
            }
        });

        JButton blueColorButton = new JButton("Blue");
        blueColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalColor(Color.BLUE);
            }
        });

        JButton yellowColorButton = new JButton("Yellow");
        yellowColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalColor(Color.YELLOW);
            }
        });

        JButton redColorButton = new JButton("Red");
        redColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _paintPanel.setGlobalColor(Color.RED);
            }
        });

        JPanel colorButtonPanel = new JPanel(new GridLayout(4,1));
        colorButtonPanel.add(blackColorButton);
        colorButtonPanel.add(blueColorButton);
        colorButtonPanel.add(yellowColorButton);
        colorButtonPanel.add(redColorButton);


        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        add(sizeButtonPanel, BorderLayout.WEST);
        add(colorButtonPanel, BorderLayout.EAST);



    }
}
