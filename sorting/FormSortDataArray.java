package gui.sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormSortDataArray {
    private JPanel rootPanel;
    private JTextField textAngka;
    private JButton buttonSaave;
    private JTable tableAngka;
    private DefaultTableModel tableModel;
    private boolean added = false;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormSortDataArray() {
        this.initComponents();

        buttonSaave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultTableModel model = (DefaultTableModel) tableAngka.getModel();
                String input = textAngka.getText();
                String[] tmp = input.split(",");
                String data = textAngka.getText();
                int size = tmp.length;
                System.out.println(tmp.length);

                if(data.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Angka Belum Diinputkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;

                }

                if (!added) {
                    for(int i = 0; i < size; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int x = 0;
                for(int i : Sorting.getascending(input, size)) {
                    model.setValueAt(i, x, 0);
                    x++;
                }
                int y = 0;
                for(int i : Sorting.getdescending(input,size)) {
                    model.setValueAt(i, y, 1);
                    y++;
                }

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
        //set table model
        tableAngka.setModel(tableModel);
        //menemampilkan sorting di setiap colom
        tableAngka.setAutoCreateRowSorter(true);
        //enable single selection
        tableAngka.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
