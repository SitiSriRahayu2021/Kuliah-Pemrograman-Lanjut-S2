package gui.uas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormRuangUjian {
    private JTextField textNoUjian;
    private JButton buttonSorting;
    private JTable tableHasil;
    private JPanel rootPanel;
    private JButton buttonCari;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormRuangUjian() {
        this.initComponents();

        buttonSorting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String noUjian = textNoUjian.getText();

                if (noUjian.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Silahkan Masukkan Nomor Ujian untuk Ruang Ujian Ini",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    tableModel.addRow(new Object[]{noUjian});
                    textNoUjian.setText("");
                }
            }

        });

        buttonCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] data = {textNoUjian.getText()};
                String angka = textNoUjian.getText();
                JOptionPane.showInputDialog("Silahkan masukkan nomor ujian yang akan dicari");

                JOptionPane.showInputDialog("nomor ujian ada di INDEKS KE " + Sequential(data, angka));


            }

        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };

        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set tablemodel
        tableHasil.setModel(tableModel);
        //menampilkan sorting disetiap colom
        tableHasil.setAutoCreateRowSorter(true);
        //ENABLE SINGLE SELECTION
        tableHasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    static int Sequential(String[] data, String angka) {
        for (int i = 0; i < data.length; i++) {
            if (angka == data[i]) {
                return i;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] data = {2,4,6,8,9};
        int angka =10 ;



    }


}





