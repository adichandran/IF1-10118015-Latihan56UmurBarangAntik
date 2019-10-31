/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan56umurbarangantik;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program tentang umur barang antik radio
 */
public class IF110118015Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rd = new Radio(234);
        rd.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+ rd.getName());
        rd.tampilUmur();
    }
    
}
