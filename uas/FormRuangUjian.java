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
                String[] angka = new String[]{textNoUjian.getText()};
                String data = JOptionPane.showInputDialog("Nomor Ujian yang dicari: ");
                if (data.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Silahkan Masukkan Nomor Ujian yang Dicari",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showInputDialog("Nomor Ujian ini berada di indeks ke-" );
                }

            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending / Descending"
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



}

