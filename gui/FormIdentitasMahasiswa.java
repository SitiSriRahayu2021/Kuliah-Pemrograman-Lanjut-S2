package gui;

import TugasNim.NIM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormIdentitasMahasiswa {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormIdentitasMahasiswa() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //mengambil nama dari textNama
                String nama = textNama.getText();
                //mengambil data dari textNim
                String nim = textNim.getText();
                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                Mahasiswa objNim= new Mahasiswa();
                objNim.setNim(nim);

                //Tampilkan output ke form
                labelHasil.setText("Nama : " + mhs.getNama() + " \n " +
                        "Nim : " + mhs.getNim() + " \n " +
                        "Jenjang Pendidikan : " + mhs.getJenjangPendidikan() + " \n " +
                        "Tahun Masuk : 20" + mhs.getTahunMasuk() + mhs.getTahunMasuk1() + " \n " +
                        "Fakultas : " + mhs.getFakultas() + " \n " +
                        "Program Studi : "  +  mhs.getProgramStudi1() + " \n " +
                        "Jenis Kelamin : " + mhs.getJenisKelamin() + " \n " +
                        "Nomor Urut Mahasiswa : " + mhs.getNomorMahasiswa() + mhs.getNomorMahasiswa1() + mhs.getNomorMahasiswa2() + mhs.getNomorMahasiswa3() + " \n ");
            }
        });

    }

    public JPanel getRootPanel() {
        return rootPanel;

    }
}
