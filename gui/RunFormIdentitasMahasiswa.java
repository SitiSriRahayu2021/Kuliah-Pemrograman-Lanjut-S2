package gui;

import TugasNim.NIM;

import javax.swing.*;

public class RunFormIdentitasMahasiswa {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Identitas Mahasiswa");
        jFrame.setContentPane(new FormIdentitasMahasiswa().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);

    }
}


