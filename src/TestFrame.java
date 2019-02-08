import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestFrame extends JFrame {

    public TestFrame() {
        super("TextFinder");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelRoot = new JLabel();
        labelRoot.setText("Папка для поиска:");
        labelRoot.setBounds(10,10,130,20);
        panel.add(labelRoot);

        JLabel labelType = new JLabel();
        labelType.setText("Расширение файлов:");
        labelType.setBounds(10,30,130,20);
        panel.add(labelType);

        JLabel labelDesiredText = new JLabel();
        labelDesiredText.setText("Искомый текст:");
        labelDesiredText.setBounds(10,50,130,20);
        panel.add(labelDesiredText);


        JTextField textRoot = new JTextField();
        textRoot.setBackground(Color.WHITE);
        textRoot.setColumns(14);
        textRoot.setBounds(145,10,140,20);
        panel.add(textRoot);

        JTextField textType = new JTextField();
        textType.setBackground(Color.WHITE);
        textType.setColumns(14);
        textType.setText(".log");
        textType.setBounds(145,30,200,20);
        panel.add(textType);

        JTextField textDesiredText = new JTextField();
        textDesiredText.setBackground(Color.WHITE);
        textDesiredText.setColumns(14);
        textDesiredText.setBounds(145,50,200,20);
        panel.add(textDesiredText);

        JButton buttonFind = new JButton("Искать");
        buttonFind.setBounds(350, 10, 85, 59);
        panel.add(buttonFind);

        JButton buttonPath = new JButton("path");
        buttonPath.setBounds(285, 10, 59, 19);
        panel.add(buttonPath);

        getContentPane().add(panel);

        setPreferredSize(new Dimension(640, 480));

        buttonFind.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                textDesiredText.setText("Hello World");
            }
        });

        buttonPath.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие

            }
        });



    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}