import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class buttontest {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // when you click the button it will now generate the poem
        
                Poem poemobj = new Poem();
                poemobj.Poemscanner();
                 Poem samplepoem = new Poem(null);
                 System.out.println();
        
                poemobj.generatePoem();
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}