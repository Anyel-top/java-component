package componente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BotonColor extends JButton{

    public BotonColor(String texto){
        super(texto);
        this.setBackground(Color.CYAN);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.CYAN);
            }
        });
    }
}
