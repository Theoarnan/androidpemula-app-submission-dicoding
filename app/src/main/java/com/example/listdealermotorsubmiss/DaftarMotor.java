package com.example.listdealermotorsubmiss;

import java.util.ArrayList;

public class DaftarMotor {
    public static String[][] data = new String[][]{
            {"Honda ADV 150","Motor keluaran terbaru dari honda ini memiliki Desain Gagah dan Atraktif, Memiliki Ground Clearance Tinggi, Dan Nyaman digunakan untuk jarak Jauh.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t149.3 cc\n" +
                    "Tenaga Maksimal \t14.3 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tCVT","https://gaadiwaadi.com/wp-content/uploads/2019/07/2019-Honda-X-ADV-150-3.jpg","Rp. 36.000.000"},
            {"Honda Beat Street","Beat Street ini memiliki Desain yang Compact dan Ceria gaya anak muda masa kini, Meski di desain kuat dan lifestyle, tapi motor ini sangat cocok dipakai siapapun, selain itu motor ini juga hemat bahan bakar dan menggunakan teknologi terbaru.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t108.2 cc\n" +
                    "Tenaga Maksimal \t8.55 hp\n" +
                    "Opsi start \tKick & Electric\n" +
                    "Sistem pembakaran \tFull Transisterized\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tCVT ","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/73/1578/honda-beat-street-esp-slant-rear-view-full-image-568147.jpg","Rp. 17.000.000"},
            {"Yamaha Aerox","Ini adalah skuter dengan desain yang paling sporty yang ada dipasaran, yang juga memiliki tenaga ynag mumpuni dan yang utama sangat irit.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t155.1 cc\n" +
                    "Tenaga Maksimal \t14.75 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Sistem pembakaran \tTCI\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tCVT","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/84/1642/yamaha-aerox-155vva-slant-rear-view-full-image-755671.jpg","Rp. 27.500.000"},
            {"Yamaha R25","Sistem yang digunakan semakin baru dan user friendly, Harga tetep paling murah dikelasnya, banyak menghadirkan fitur baru yang membuat keluaran Yamaha ini sangat cocok digunakan sehari-hari.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t250 cc\n" +
                    "Tenaga Maksimal \t35.5 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Sistem pembakaran \tTCI\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual ","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/84/2019/yamaha-r25-2018-slant-rear-view-full-image-169006.jpg","Rp.60.000.000"},
            {"Yamaha SoulGT","Memiliki Body yang sangat Ringan dan Ringkas sehingga dapat digunakan dengan mudah, Desain Keren, Harga sangat Terjangkau di kelasnya.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t125 cc\n" +
                    "Tenaga Maksimal \t9.38 hp\n" +
                    "Opsi start \tKick & Electric\n" +
                    "Sistem pembakaran \tTCI\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tAnalog\n" +
                    "Jenis Transmisi \tCVT","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/84/1063/yamaha-soul-gt-aks-slant-rear-view-full-image-750989.jpg","Rp. 17.800.000"},
            {"Suzuki Satria F150","Desain agresif yang melambangkan motor keren ini,selain itu motor ini memiliki kinerja suspensi yang meyakinkan saat bermanuver di kecepatan tinggi tetapi tetap aman, nyaman untuk digunakan sehari-hari.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t147.3 cc\n" +
                    "Tenaga Maksimal \t18.23 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual ","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/92/1200/suzuki-satria-f150-slant-rear-view-full-image-549851.jpg","Rp.23.800.000"},
            {"Suzuki GSX R150","Nyaman untuk ditunggangi, Esy start system belum memliki kompetitor oleh merek lainnya, selain itu juga memiliki performa mesin yang sangat garang.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t147.3 cc\n" +
                    "Tenaga Maksimal \t18.9 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual ","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/92/1579/suzuki-gsx-r150-slant-rear-view-full-image-130641.jpg","Rp.34.180.000"},
            {"Ninja 250","Mesin yang superior, Bobot yang ringan, Mempunyai rem cakram dengan ABS, pilihan warna yang banyak untuk lifestyle anda.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t249 cc\n" +
                    "Tenaga Maksimal \t38.46 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Sistem pembakaran \tDigital\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/88/1897/kawasaki-ninja-250-slant-rear-view-full-image-580399.jpg","Rp.67.800.000"},
            {"Kawasaki KLX 150","Desain yan menarik, layaknya motor offroad, Suspensi sudah up side down, Mesin tangguh sesuai model motor ini sendiri, tapi juga nyaman untuk kehidupan sehari-hari.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t144 cc\n" +
                    "Tenaga Maksimal \t11.5 hp\n" +
                    "Opsi start \tKick & Electric\n" +
                    "Sistem pembakaran \tDC-CDI\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/88/1121/kawasaki-klx-150-slant-rear-view-full-image-388913.jpg","Rp.36.300.000"},
            {"Kawasaki W175","Mempunyai tampilan Klasik, Bobot ringan, Harga terjangkau dan yang paing penting adalah irit oleh karena itu cocok untuk melakukan mobilitas tinggi.\n" +
                    "\n" +
                    "Spesifikasi : \n" +
                    "Kapasitas \t147.3 cc\n" +
                    "Tenaga Maksimal \t18.9 hp\n" +
                    "Opsi start \tElectric\n" +
                    "Panel Instrumen \tDigital\n" +
                    "Indikator Bbm \tDigital\n" +
                    "Jenis Transmisi \tManual","https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/88/1274/kawasaki-w-175-slant-rear-view-full-image-933648.jpg","Rp.33.100.000"},


    };
    public static ArrayList<Motor> getListData() {
        ArrayList<Motor> list = new ArrayList<>();
        for (String[] mData : data) {
            Motor motor = new Motor();
            motor.setNamaM(mData[0]);
            motor.setDeskM(mData[1]);
            motor.setPhoto(mData[2]);
            motor.setHarga(mData[3]);
            list.add(motor);
        }
        return list;
    }
}
