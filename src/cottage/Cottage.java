/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottage;

import java.util.Scanner;

/**
 *
 * @author aditn
 */
public class Cottage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Kamar ( Duku, Jeruk, Alpukat, "
                + "JambuAir, Durian, Melon, Belimbing, Mangga, Kedondong, Barrack )");
        String kamar = input.next();
        System.out.println("Berapa Kamar (Alpukat, dan Jambu Air Maksimal 1 kamar. Kamar lain Maks 2. Barrack maksimal lebih dari 2 )");
        int jumlah = input.nextInt();
        System.out.println("Pilih Jenis Hari ( Weekday, Weekend, Holiday ) ");
        String event = input.next();
        System.out.println("Berapa Lama Menginap (Hari)  ");
        int durasi = input.nextInt();
        int harga = 0;
        if (kamar.equals("duku")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 915000;
                } else if (event.equals("weekend")) {
                    harga = 1025000;
                } else if (event.equals("holiday")) {
                    harga = 1225000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("jeruk")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 915000;
                } else if (event.equals("weekend")) {
                    harga = 1025000;
                } else if (event.equals("holiday")) {
                    harga = 1225000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("alpukat")) {
            if (jumlah == 1) {
                if (event.equals("weekday")) {
                    harga = 575000;
                } else if (event.equals("weekend")) {
                    harga = 695000;
                } else if (event.equals("holiday")) {
                    harga = 895000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("jambuair")) {
            if (jumlah == 1) {
                if (event.equals("weekday")) {
                    harga = 575000;
                } else if (event.equals("weekend")) {
                    harga = 695000;
                } else if (event.equals("holiday")) {
                    harga = 895000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("durian")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 595000;
                } else if (event.equals("weekend")) {
                    harga = 715000;
                } else if (event.equals("holiday")) {
                    harga = 915000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("melon")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 595000;
                } else if (event.equals("weekend")) {
                    harga = 715000;
                } else if (event.equals("holiday")) {
                    harga = 915000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("belimbing")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 495000;
                } else if (event.equals("weekend")) {
                    harga = 575000;
                } else if (event.equals("holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("mangga")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 495000;
                } else if (event.equals("weekend")) {
                    harga = 575000;
                } else if (event.equals("holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("kedondong")) {
            if (jumlah <= 2) {
                if (event.equals("weekday")) {
                    harga = 495000;
                } else if (event.equals("weekend")) {
                    harga = 575000;
                } else if (event.equals("holiday")) {
                    harga = 755000;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        if (kamar.equals("barrack")) {
            if (jumlah >= 0) {
                if (event.equals("weekday")) {
                    harga = 25000 * jumlah;
                } else if (event.equals("weekend")) {
                    harga = 25000 * jumlah;
                } else if (event.equals("holiday")) {
                    harga = 35000 * jumlah;
                } else {
                    harga = 0;
                }
            } else {
                System.out.println("Jumlah Melebihi Ruang");
            }
        }
        System.out.println("Harga Kamar " + kamar + " dengan jumlah kamar " + jumlah + " pada " + event + " selama " + durasi + " hari = Rp." + harga * durasi);
    }
}
