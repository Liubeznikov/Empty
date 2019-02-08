import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Example
{
    public static void run()
    {
        //Создадим окно и установим заголовок
        final JFrame window = new JFrame("TextFinder");

        //Подключаем иконку из корня папки проекта
        ImageIcon img = new ImageIcon("TF.bmp");
        window.setIconImage(img.getImage());

        //Событие "закрыть" при нажатии по крестику окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Текстовое поле
        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setColumns(14);


        JTextField textRoot = new JTextField();
        textRoot.setBackground(Color.WHITE);
        textRoot.setColumns(14);

        JTextField textFileType = new JTextField();
        textFileType.setBackground(Color.WHITE);
        textFileType.setColumns(14);

        JTextField textDesiredText = new JTextField();
        textDesiredText.setBackground(Color.WHITE);
        textDesiredText.setColumns(14);


        //Создадим панель
        JPanel panel = new JPanel();

        //Создадим кнопки
        JButton minButton = new JButton("Свернуть");
        JButton maxButton = new JButton("Растянуть");
        JButton normalButton = new JButton("Оригинал");
        JButton exitButton = new JButton("Выход");
        JButton helloButton = new JButton("Hello");
        helloButton.setBounds(100,100,40,20);


        //Событие для кнопки "Свернуть"
        minButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setState(JFrame.ICONIFIED);
            }
        });

        //Событие для кнопки "Растянуть"
        maxButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });


        //Событие для кнопки "Оригинал"
        normalButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setExtendedState(JFrame.NORMAL);
            }
        });


        //Событие для кнопки "Выход"
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                window.setVisible(false);
                System.exit(0);
            }
        });

        //Событие для кнопки "Hello"
        helloButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Действие
                textField.setText("Hello World!");
            }
        });


        //Добавим кнопки и поля на панель
      //  panel.add(minButton);
       // panel.add(maxButton);
       // panel.add(normalButton);
       // panel.add(exitButton);
        panel.add(textField);
        panel.add(textRoot);
        panel.add(textFileType);
        panel.add(textDesiredText);
        panel.add(helloButton);


        //Добавим панель в окно
        window.getContentPane().add(panel);

        window.pack();

        //Разместим программу по центру
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    //Запускаем
    public static void main(String[] args)
    {
        run();
    }

    //Больше документации https://docs.oracle.com/javase/tutorial/uiswing/components/componentlist.html
}