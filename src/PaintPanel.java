import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PaintPanel extends JPanel {

    private final ArrayList<PaintPoint> _points;

    private Color _globalColor = Color.black;
    private int _globalSize = 3;

    public PaintPanel() {
        _points = new ArrayList<>();

        MouseAdapter adapter = new MouseAdapter() {
                @Override
            public void mouseDragged(MouseEvent e) {
                    PaintPoint point = new PaintPoint(e.getX(), e.getY(),
                            _globalSize, _globalColor);
                    _points.add(point);
                    repaint();

            }
        };

        addMouseListener(adapter);
        addMouseMotionListener(adapter);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(_globalColor);
        for (PaintPoint point : _points) {
            point.draw(g);
        }
    }

    public void setGlobalColor(Color color) {
        _globalColor = color;
        repaint();
    }

    public void setGlobalSize(int size) {
        _globalSize = size;
        repaint();
    }

    public void eraseAll() {
        _points.clear();
        repaint();
    }
}
