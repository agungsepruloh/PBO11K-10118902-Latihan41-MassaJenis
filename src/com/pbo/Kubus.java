package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung nilai volume dan massa jenis kubus
 *
 */

public class Kubus {

    private int sisi;
    private int massa;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public int hitungVolume(int sisi) {
        return (int) Math.pow(sisi, 3);
    }

    public static int hitungMassaJenis(int massa, int volume) {
        return massa / volume;
    }

    public void main(String[] args) {
        System.out.println("===== Massa Jenis Kubus =====");
        Kubus kubus = new Kubus();
        System.out.print("Sisi\t: ");
        Scanner scanner = new Scanner(System.in);
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa\t: ");
        Scanner scanner1 = new Scanner(System.in);
        kubus.setMassa(scanner1.nextInt());

        int volume = kubus.hitungVolume(kubus.getSisi());
        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println(String.format("Volume\t: %d", volume));
        System.out.println(String.format("Massa Jenis\t: %d", kubus.hitungMassaJenis(kubus.getMassa(), volume)));
    }
}
