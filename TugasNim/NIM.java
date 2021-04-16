package TugasNim;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if(kodeJp == '1') {
            return "S1 (Sarjana)";
        } else if(kodeJp == '2') {
            return "S2 (Magister)";
        } else if(kodeJp == '3') {
            return "S3 (Doktor)";
        }
        return "UNKNOWN";

    }

    public String getTahunMasuk() {
        char kodeTm1 = nim.charAt(1);
        if(kodeTm1 == '0') {
            return "0";
        } else if(kodeTm1 == '1') {
            return "1";
        } else if(kodeTm1 == '2') {
            return "2";
        } else if(kodeTm1 == '3') {
            return "3";
        } else if(kodeTm1 == '4') {
            return "4";
        } else if(kodeTm1 == '5') {
            return "5";
        } else if(kodeTm1 == '6') {
            return "6";
        } else if(kodeTm1 == '7') {
            return "7";
        } else if(kodeTm1 == '8') {
            return "8";
        } else if(kodeTm1 == '9') {
            return "9";
        }
        return "UNKNOWN";
    }

    public String getTahunMasuk1() {
        char kodeTm2 = nim.charAt(2);
        if(kodeTm2 == '0') {
            return "0";
        } else if(kodeTm2 == '1') {
            return "1";
        } else if(kodeTm2 == '2') {
            return "2";
        } else if(kodeTm2 == '3') {
            return "3";
        } else if(kodeTm2 == '4') {
            return "4";
        } else if(kodeTm2 == '5') {
            return "5";
        } else if(kodeTm2 == '6') {
            return "6";
        } else if(kodeTm2 == '7') {
            return "7";
        } else if(kodeTm2 == '8') {
            return "8";
        } else if(kodeTm2 == '9') {
            return "9";
        }
        return "UNKNOWN";
    }

    public String getFakultas() {
        char kodeFk = nim.charAt(3);
        if(kodeFk == '1') {
            return "TARBIYAH DAN KEGURUAN";
        } else if(kodeFk == '2') {
            return "SYARIAH DAN HUKUM";
        } else if(kodeFk == '3') {
            return "USHULUDDIN";
        } else if(kodeFk == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        } else if(kodeFk == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if(kodeFk == '6') {
            return "PSIKOLOGI";
        } else if(kodeFk == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if(kodeFk == '8') {
            return "PERTNIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getProgramStudi() {
        char kodePs = nim.charAt(4);
        if(kodePs == '0') {
            return "0";
        }
        return "UNKNOWN";
    }

    public String getProgramStudi1() {
        char kodePs1 = nim.charAt(5);
        if(kodePs1 == '1') {
            return "Teknik Informatika";
        } else if(kodePs1 == '2') {
            return "Teknik Industri";
        } else if(kodePs1 == '3') {
            return "Sistem Informasi";
        } else if(kodePs1 == '4') {
            return "Matematika";
        } else if(kodePs1 == '5') {
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    public String getJenisKelamin() {
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1') {
            return "LAKI-LAKI";
        } else if(kodeJk == '2') {
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }

    public String getNomorMahasiswa() {
        char kodeNm = nim.charAt(7);
        if (kodeNm == '0') {
            return "0";
        } else if (kodeNm == '1') {
            return "1";
        } else if (kodeNm == '2') {
            return "2";
        } else if (kodeNm == '3') {
            return "3";
        } else if (kodeNm == '4') {
            return "4";
        } else if (kodeNm == '5') {
            return "5";
        } else if (kodeNm == '6') {
            return "6";
        } else if (kodeNm == '7') {
            return "7";
        } else if (kodeNm == '8') {
            return "8";
        } else if (kodeNm == '9') {
            return "9";
        }
        return "UNKNOWN";
    }

    public String getNomorMahasiswa1() {
        char kodeNm1 = nim.charAt(8);
        if (kodeNm1 == '0') {
            return "0";
        } else if (kodeNm1 == '1') {
            return "1";
        } else if (kodeNm1 == '2') {
            return "2";
        } else if (kodeNm1 == '3') {
            return "3";
        } else if (kodeNm1 == '4') {
            return "4";
        } else if (kodeNm1 == '5') {
            return "5";
        } else if (kodeNm1 == '6') {
            return "6";
        } else if (kodeNm1 == '7') {
            return "7";
        } else if (kodeNm1 == '8') {
            return "8";
        } else if (kodeNm1 == '9') {
            return "9";
        }
        return "UNKNOWN";
    }

    public String getNomorMahasiswa2() {
        char kodeNm2 = nim.charAt(9);
        if (kodeNm2 == '0') {
            return "0";
        } else if (kodeNm2 == '1') {
            return "1";
        } else if (kodeNm2 == '2') {
            return "2";
        } else if (kodeNm2 == '3') {
            return "3";
        } else if (kodeNm2 == '4') {
            return "4";
        } else if (kodeNm2 == '5') {
            return "5";
        } else if (kodeNm2 == '6') {
            return "6";
        } else if (kodeNm2 == '7') {
            return "7";
        } else if (kodeNm2 == '8') {
            return "8";
        } else if (kodeNm2 == '9') {
            return "9";
        }
        return "UNKNOWN";
    }

    public String getNomorMahasiswa3() {
        char kodeNm3 = nim.charAt(10);
        if (kodeNm3 == '0') {
            return "0";
        } else if (kodeNm3 == '1') {
            return "1";
        } else if (kodeNm3 == '2') {
            return "2";
        } else if (kodeNm3 == '3') {
            return "3";
        } else if (kodeNm3 == '4') {
            return "4";
        } else if (kodeNm3 == '5') {
            return "5";
        } else if (kodeNm3 == '6') {
            return "6";
        } else if (kodeNm3 == '7') {
            return "7";
        } else if (kodeNm3 == '8') {
            return "8";
        } else if (kodeNm3 == '9') {
            return "9";
        }
        return "UNKNOWN";
    }


}
