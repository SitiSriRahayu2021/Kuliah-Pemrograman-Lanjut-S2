package TugasNim;

public class NIMRun {
    public static void main(String[] args) {

        String nim = "12050120515";
        NIM objNim= new NIM();
        objNim.setNim(nim);
        System.out.println("Nama : Siti Sri Rahayu");
        System.out.println("Jenjang Pendidikan : " + objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk : 20" + objNim.getTahunMasuk() + objNim.getTahunMasuk1());
        System.out.println("Fakultas : " + objNim.getFakultas());
        System.out.println("Program Studi : " + objNim.getProgramStudi1());
        System.out.println("Jenis Kelamin : " + objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa " + objNim.getNomorMahasiswa() + objNim.getNomorMahasiswa1() + objNim.getNomorMahasiswa2() + objNim.getNomorMahasiswa3());
    }
}
