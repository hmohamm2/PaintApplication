import java.awt.*;

public class PaintPoint {

    private final int _x;
    private final int _y;
    private final int _size;
    private final Color _color;

    public PaintPoint(int x, int y, int size, Color color) {
        _x = x;
        _y = y;
        _size = size;
        _color = color;
    }

    public void draw(Graphics g) {
        g.setColor(_color);
        g.fillOval(_x, _y, _size, _size);

    }
}

