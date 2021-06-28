package gui.uas;

import gui.sorting.FormSortDataArray;

import javax.swing.*;

public class RunFormRuangUjian {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/ujian.png");
        JFrame jFrame = new JFrame("Form Ruang Ujian");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new FormRuangUjian().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
